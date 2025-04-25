// create Employee CLass
//        Private data members (attributes):
//        - employeeId
//                - name
//                - hoursWorked
//                - payRate
//        Methods:
//        - parameterized constructor
//                - getEmployeeId() and getters/setters for other attributes
//        - getGrossPay() that calculates and returns that employee's gross pay
//        based on their hours worked and pay rate

package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private double hoursWorked;
    private double payRate;

    public Employee(int employeeID, String name, double hoursWorked, double payRate){

        this.employeeID = employeeID;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;

    }

    double getGrossPay(double payRate, double hoursWorked) {
        // calculate gross pay
        // calculate how to pay 1.5x for overtime after 40hrs
        return (hoursWorked > 40) ? (40 * payRate) + ((payRate * 1.5) * (hoursWorked - 40)): hoursWorked * payRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}