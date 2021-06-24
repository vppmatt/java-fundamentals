package com.multicode.expenses.domain;

import java.math.*;
import java.text.*;
import java.time.*;
import java.time.format.*;

public class ExpenseClaim {

    private int	id;
    private int employeeId;
    private LocalDate dateOfClaim;
    private BigDecimal totalAmount;
    private boolean approved;
    private boolean paid;

    public ExpenseClaim(int id, int employeeId, LocalDate dateOfClaim, BigDecimal totalAmount) {
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

    public LocalDate getDateOfClaim() {
        return dateOfClaim;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public boolean isApproved() {
        return approved;
    }

    public boolean isPaid() {
        return paid;
    }

    public String getPrettyDate() {
        return dateOfClaim.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
