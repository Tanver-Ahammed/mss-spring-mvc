package com.spring.mvc.model;

import java.util.List;

public class Student {
    private Long id;
    private String name;
    private String dob;
    private List<String> courses;
    private String gender;
    private String type;
    private Address address;

    public Student() {
    }

    public Student(Long id, String name, String dob,
                   List<String> courses, String gender, String type, Address address) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.courses = courses;
        this.gender = gender;
        this.type = type;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id: " + id +
                "\nName: " + name +
                "\nDOB='" + dob +
                "\nCourses=" + courses +
                "\bGender='" + gender +
                "\nType='" + type +
                "\nAddress=" + address +
                '}';
    }
}
