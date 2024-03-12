package com.learning.core.day05;

class Employee {
    String name;
    Long phoneNo;
    String passportNo;
    int employeeId;
    int licenseNo;
    String panCardNo;
    int voterId;

    public Employee(String name, Long phoneNo, int employeeId, String passportNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
    }

    public Employee(String name, Long phoneNo, int employeeId, int licenseNo, String panCardNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.licenseNo = licenseNo;
        this.panCardNo = panCardNo;
    }

    public Employee(String name, Long phoneNo, int employeeId, String passportNo, int voterId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.employeeId = employeeId;
        this.passportNo = passportNo;
        this.voterId = voterId;
    }

	public Employee(String string, long parseLong, int parseInt, int parseInt2, String string2, int parseInt3) {
		// TODO Auto-generated constructor stub
	}
}
