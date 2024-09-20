package com.evergent.coreJava.Service;

public class MetroManagementService {
    MetroManagementDAO metroDAO = new MetroManagementDAO();

    public int addService(int serviceId, String serviceName, double price) {
        MetroServiceBean service = new MetroServiceBean();
        service.setServiceId(serviceId);
        service.setServiceName(serviceName);
        service.setPrice(price);
        return metroDAO.addService(service);
    }

    public String viewService(int serviceId) {
        return metroDAO.getService(serviceId);
    }

    public int bookTicket(int ticketId, String passengerName, String serviceName, String travelDate) {
        MetroTicketBean ticket = new MetroTicketBean();
        ticket.setTicketId(ticketId);
        ticket.setPassengerName(passengerName);
        ticket.setServiceName(serviceName);
        ticket.setTravelDate(travelDate);
        return metroDAO.bookTicket(ticket);
    }

    public String viewAllBookings() {
        return metroDAO.getAllBookings();
    }
}
