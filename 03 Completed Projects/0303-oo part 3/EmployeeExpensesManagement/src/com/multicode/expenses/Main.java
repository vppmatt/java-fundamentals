package com.multicode.expenses;

import com.multicode.expenses.domain.*;
import com.multicode.expenses.domain.types.*;
import com.multicode.expenses.utilities.*;

import java.math.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setFirstName("Sally");
        employee1.setSurname("Davis");

        Employee employee2 = new Employee();
        employee2.setFirstName("Deborah");
        employee2.setSurname("Smith");

        Employee employee3 = new Employee("Mr", "Philp", "Philipson");

        Employees employees = new Employees();
        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);

        employees.printEmployees();

        Employee smith = employees.findBySurname("Smith");
        System.out.println(smith.getMailingName());


        ExpenseClaim claim1 = new ExpenseClaim(1,3, LocalDate.now(), new BigDecimal("16.30"));
        ExpenseClaim claim2 = new ExpenseClaim(2,3, LocalDate.of(2021,1,13), new BigDecimal("37.50"));

        smith.addExpenseClaim(claim1);
        smith.addExpenseClaim(claim2);
        System.out.println(smith.getTotalOfExpenseClaims());

        TravelExpenseItem item1 = new TravelExpenseItem(172,1,"London to Paris", new BigDecimal("155"), TravelMode.INTERNATIONAL_TRAIN);
        AccomodationExpenseItem item2 = new AccomodationExpenseItem(173,1,"The Hilton, Paris", new BigDecimal("360"),AccomodationType.HOTEL);
        MealExpenseItem item3 = new MealExpenseItem(174,1,"Restaurant Guy Savoy", new BigDecimal("525"),2);

        EmployeeUtilities employeeUtilities = new EmployeeUtilities();
        System.out.println(employeeUtilities.totalOfAllClaims(employees));

        System.out.println(claim1.getPrettyDate());

        ClaimUtilities claimUtilities = new ClaimUtilities();

        System.out.println(claimUtilities.howOldIsTheClaim(claim2));

        System.out.println(employee3);
        System.out.println(claim1);
        System.out.println(item2);
    }
}
