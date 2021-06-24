package com.multicode.expenses.domain;

import java.math.*;

public class MealExpenseItem extends ExpenseItem {

    private int numberOfDiners;

    public MealExpenseItem(int id, int claimId, String description, BigDecimal amount, int numberOfDiners) {
        super(id, claimId, description, amount);
        this.numberOfDiners = numberOfDiners;
    }

    public int getNumberOfDiners() {
        return numberOfDiners;
    }
}
