package com.multicode.expenses.domain;

import java.math.*;
import java.util.*;

public class MealExpenseItem extends ExpenseItem {

    private int numberOfDiners;

    public MealExpenseItem(int id, int claimId, String description, BigDecimal amount, int numberOfDiners) {
        super(id, claimId, description, amount);
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
