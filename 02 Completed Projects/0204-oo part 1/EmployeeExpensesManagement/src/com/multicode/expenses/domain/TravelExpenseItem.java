package com.multicode.expenses.domain;

import java.math.*;

public class TravelExpenseItem extends ExpenseItem {

    private String modeOfTravel;

    public TravelExpenseItem(int id, int claimId, String description, BigDecimal amount, String modeOfTravel) {
        super(id, claimId, description, amount);
        this.modeOfTravel = modeOfTravel;
    }

    public String getModeOfTravel() {
        return modeOfTravel;
    }
}
