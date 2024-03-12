package com.learning.core.day05;

public class Student {
	String name;
    Long phoneNo;
    String passportNo;
    int licenseNo;
    String panCardNo;
    int voterId;

    public Student(String name, Long phoneNo, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.passportNo = passportNo;
    }

    public Student(String name, Long phoneNo, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Student(String name, Long phoneNo, int voterId, int licenseNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.voterId = voterId;
        this.licenseNo = licenseNo;
    }
}
