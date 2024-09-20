package com.evergent.coreJava.Dao;

import java.sql.*;


import com.evergent.coreJava.bean.MetroServiceBean;
import com.evergent.coreJava.bean.MetroTicketBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MetroManagementDAO {

    public int addService(MetroServiceBean service) {
        String query = "INSERT INTO services (service_id, service_name, price) VALUES (?, ?, ?)";
        try (Connection conn = MetroDBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
             
            pstmt.setInt(1, service.getServiceId());
            pstmt.setString(2, service.getServiceName());
            pstmt.setDouble(3, service.getPrice());
            return pstmt.executeUpdate(); // Returns the number of affected rows
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Return 0 if there was an error
    }

    public String getService(int serviceId) {
        String query = "SELECT * FROM services WHERE service_id = ?";
        try (Connection conn = MetroDBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
             
            pstmt.setInt(1, serviceId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return "Service ID: " + rs.getInt("service_id") + 
                       ", Name: " + rs.getString("service_name") + 
                       ", Price: " + rs.getDouble("price");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Service not found.";
    }

    public int bookTicket(MetroTicketBean ticket) {
        String query = "INSERT INTO tickets (ticket_id, passenger_name, service_name, travel_date) VALUES (?, ?, ?, ?)";
        try (Connection conn = MetroDBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
             
            pstmt.setInt(1, ticket.getTicketId());
            pstmt.setString(2, ticket.getPassengerName());
            pstmt.setString(3, ticket.getServiceName());
            pstmt.setString(4, ticket.getTravelDate());
            return pstmt.executeUpdate(); // Returns the number of affected rows
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // Return 0 if there was an error
    }

    public String getAllBookings() {
        String query = "SELECT * FROM tickets";
        StringBuilder bookings = new StringBuilder();
        try (Connection conn = MetroDBConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {
             
            while (rs.next()) {
                bookings.append("Ticket ID: ").append(rs.getInt("ticket_id"))
                        .append(", Passenger: ").append(rs.getString("passenger_name"))
                        .append(", Service: ").append(rs.getString("service_name"))
                        .append(", Travel Date: ").append(rs.getString("travel_date")).append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookings.length() > 0 ? bookings.toString() : "No bookings found.";
    }
}
