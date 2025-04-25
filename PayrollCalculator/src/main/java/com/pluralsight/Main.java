package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // read employee data from a .csv file --- inputted cvs file
        // generate payroll information for each employee --
        // read the file using the BufferedReader

//        The file will contain several lines of employee data in the form:
//        id|name|hours-worked|pay-rate
//        For example:
//        10|Dana Wyatt|52.5|12.50
//        20|Ezra Aiden|17|16.75
//        30|Brittany Thibbs|40|16.50
//        40|Zephaniah Hughes|2|10.0


        // load file using FileReader object
        try {
            BufferedReader bufreader = new BufferedReader(new FileReader("employees.csv"));

            // read file line-by-line
            String readLine;
            while((readLine = bufreader.readLine()) != null){
                // split fields using "|" as delimiter
                String[] employeeDetails = readLine.split(Pattern.quote("|"));

                // copy values from tokens array into variables
                int employeeID = Integer.parseInt(String.valueOf(employeeDetails[0]));
                String employeeName;
                double hoursWorked;
                double payRate;


                // match data and use to create a new Employee object
                if(employeeDetails.length == 4){
                    employeeName = String.valueOf(employeeDetails[1]);
                    hoursWorked = Double.parseDouble(String.valueOf(employeeDetails[2]));
                    payRate = Double.parseDouble(String.valueOf(employeeDetails[3]));

                    Employee newEmployee = new Employee(employeeID, employeeName, hoursWorked, payRate);

                    double grossPay = newEmployee.getGrossPay(hoursWorked, payRate);


                    // display employee using printf
                    // call employee's getEmployeeID(), getName(), and getGrossPay();
                    // repeat for each line

                    System.out.printf("%d | %s | %f | %f | Gross Pay: %f \n"
                            , employeeID
                            , employeeName
                            , hoursWorked
                            , payRate
                            , grossPay);

                } else{
                    System.out.println("There is employee details missing!");
                }
            }

            bufreader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }








        // repeat for each line within file


    }
}

