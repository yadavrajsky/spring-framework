package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
    @Value("Rahul")
    private String studentName;
    @Value("Delhi")
    private String studentCity;

    @Value("#{temp}")
    private List<String>address;

    public Student(String studentName, String studentCity) {
        this.studentName = studentName;
        this.studentCity = studentCity;
    }

    public Student()
    {
        super();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [studentName=" + studentName + ", studentCity=" + studentCity + "]" + "Address: " + address;
    }
}
