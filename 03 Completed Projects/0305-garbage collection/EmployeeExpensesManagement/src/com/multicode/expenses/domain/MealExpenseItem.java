package com.multicode.expenses.domain;

import java.math.*;
import java.util.*;

public class MealExpenseItem implements ExpenseItem {

    private int numberOfDiners;
    private int id;
    private int claimId;
    private String description;
    private BigDecimal amount;

    public void setNumberOfDiners(int numberOfDiners) {
        this.numberOfDiners = numberOfDiners;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getClaimId() {
        return claimId;
    }

    public void setClaimId(int claimId) {
        this.claimId = claimId;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public MealExpenseItem(int id, int claimId, String description, BigDecimal amount, int numberOfDiners) {
        this.id = id;
        this.claimId = claimId;
        this.description = description;
        this.amount = amount;
        this.numberOfDiners = numberOfDiners;
    }

    public int getNumberOfDiners() {
        return numberOfDiners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MealExpenseItem that = (MealExpenseItem) o;
        return numberOfDiners == that.numberOfDiners;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDiners);
    }

    @Override
    public String toString() {
        return "MealExpenseItem{" +
                "numberOfDiners=" + numberOfDiners +
                "} " + super.toString();
    }
}
