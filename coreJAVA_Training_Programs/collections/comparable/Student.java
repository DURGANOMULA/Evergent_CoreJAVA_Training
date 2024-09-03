package com.evergent.corejava.collections.comparable;

public class Student implements Comparable<Student>
{
private String studentName;
private int age;
public Student(String studentName, int age) {
	this.studentName = studentName;
	this.age = age;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [studentName=" + studentName + ", age=" + age + "]";
}
@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	if(this.getAge()>o.getAge())
	return 1;
	else return -1;
}


}
