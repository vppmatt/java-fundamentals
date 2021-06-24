package com.multicode.expenses.domain;

import java.math.*;

public class Employee {

    private int id;
    private String title;
    private String firstName;
    private String surname;
    private String jobTitle;
    private String department;
    private boolean active;
    private ExpenseClaim[] expenseClaims;

    private int nextExpenseClaimPosition = 0;


    public Employee() {
        this.expenseClaims = new ExpenseClaim[10];
    }

    public Employee(String title, String firstName, String surname) {
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.expenseClaims = new ExpenseClaim[10];
    }

    public Employee(int id, String title, String firstName, String surname, String jobTitle, String department, boolean active) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.department = department;
        this.active = active;
        this.expenseClaims = new ExpenseClaim[10];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length() >=2) {
            this.firstName = firstName;
        }
        else {
            System.out.println("First name must be at least 2 characters long");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if(title.length() >=2) {
            this.title = title;
        }
        else {
            System.out.println("Title must be at least 2 characters long");
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if(surname.length() >=2) {
            this.surname = surname;
        }
        else {
            System.out.println("Surname must be at least 2 characters long");
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getMailingName() {
        return title + " " + firstName + " " + surname;
    }

    public String getMailingName(boolean initialOnly) {
        if (initialOnly) {
            return title + " " + firstName.substring(0,1) + " " + surname;
        }
        else {
            return title + " " + surname;
        }
    }

    public void addExpenseClaim(ExpenseClaim expenseClaim) {
        this.expenseClaims[nextExpenseClaimPosition] = expenseClaim;
        nextExpenseClaimPosition++;
    }

    public BigDecimal getTotalOfExpenseClaims() {
        BigDecimal total = BigDecimal.ZERO;
        for(ExpenseClaim expenseClaim : expenseClaims) {
            if (expenseClaim != null) total = total.add(expenseClaim.getTotalAmount());
        }
        return total;
    }

}
