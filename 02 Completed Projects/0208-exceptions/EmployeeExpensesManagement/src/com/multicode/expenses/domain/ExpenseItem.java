package com.multicode.expenses.domain;

import java.math.*;
import java.util.*;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpenseItem that = (ExpenseItem) o;
        return id == that.id &&
                claimId == that.claimId &&
                Objects.equals(description, that.description) &&
                Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, claimId, description, amount);
    }

    @Override
    public String toString() {
        return "ExpenseItem{" +
                "id=" + id +
                ", claimId=" + claimId +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
