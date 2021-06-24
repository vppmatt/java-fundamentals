package com.multicode.expenses.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExpenseClaim {

    private int	id;
    private int employeeId;
    private Date dateOfClaim;
    private double totalAmount;
    private boolean approved;
    private boolean paid;

    public ExpenseClaim(int id, int employeeId, Date dateOfClaim, double totalAmount) {
        this.id = id;
        this.employeeId = employeeId;
        this.dateOfClaim = dateOfClaim;
        this.totalAmount = totalAmount;
        this.approved = false;
        this.paid = false;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public void setPaid(boolean paid) {
        if(approved) {
            this.paid = paid;
        }
        else {
            System.out.println("This item cannot be paid as it has not yet been approved.");
        }
    }

    public int getId() {
        return id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Date getDateOfClaim() {
        return dateOfClaim;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public boolean isApproved() {
        return approved;
    }

    public boolean isPaid() {
        return paid;
    }

    public String getPrettyDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        return simpleDateFormat.format(dateOfClaim);
    }
}
