package com.multicode.expenses.domain;

import java.math.*;

public class ExpenseItem {

    private int id;
    private int claimId;
    private String expenseType;
    private String description;
    private BigDecimal amount;

    public ExpenseItem(int id, int claimId, String expenseType, String description, BigDecimal amount) {
        this.id = id;
        this.claimId = claimId;
        this.expenseType = expenseType;
        this.description = description;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getClaimId() {
        return claimId;
    }

    public String getExpenseType() {
        return expenseType;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
