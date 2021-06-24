package com.multicode.expenses.domain;

import java.math.*;

public abstract class ExpenseItem {

    private int id;
    private int claimId;
    private String description;
    private BigDecimal amount;

    public ExpenseItem(int id, int claimId, String description, BigDecimal amount) {
        this.id = id;
        this.claimId = claimId;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getClaimId() {
        return claimId;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
