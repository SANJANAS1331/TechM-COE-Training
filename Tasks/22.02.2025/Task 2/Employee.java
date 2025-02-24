package org.example;

public class Employee {
    private int empId;
    private String empName;
    private double sal;
    private int yearsWorked;

    public Employee(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }

    public String getEmployeeDetails() {
        return "ID: " + empId + ", Name: " + empName + ", Salary: " + sal + ", Years Worked: " + yearsWorked;
    }

    public void setEmployeeDetails(int empId, String empName, double sal, int yearsWorked) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.yearsWorked = yearsWorked;
    }

    public String getLoanEligibility() {
        if (yearsWorked > 5) {
            if (sal >= 1500000.00) {
                return "Eligible for 7 lakhs loan";
            } else if (sal >= 1000000.00) {
                return "Eligible for 5 lakhs loan";
            } else if (sal == 600000.00) {
                return "Eligible for 2 lakhs loan";
            } else {
                return "Not eligible for a loan";
            }
        } else {
            return "Not eligible for a loan due to insufficient years of service";
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1022, "xyz", 1700000.00, 7);
        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp1.getLoanEligibility());
        emp1.setEmployeeDetails(1023, "abc", 140000.00, 6);
        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp1.getLoanEligibility());
        emp1.setEmployeeDetails(1024, "lmn", 100000.00, 5);
        System.out.println(emp1.getEmployeeDetails());
        System.out.println(emp1.getLoanEligibility());
    }
}