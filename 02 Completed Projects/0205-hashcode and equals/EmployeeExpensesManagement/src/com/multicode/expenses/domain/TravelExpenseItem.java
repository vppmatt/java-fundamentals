package com.multicode.expenses.domain;

import java.math.*;
import java.util.*;

public class TravelExpenseItem extends ExpenseItem {

    private String modeOfTravel;

    public TravelExpenseItem(int id, int claimId, String description, BigDecimal amount, String modeOfTravel) {
        super(id, claimId, description, amount);
        this.modeOfTravel = modeOfTravel;
    }

    public String getModeOfTravel() {
        return modeOfTravel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TravelExpenseItem that = (TravelExpenseItem) o;
        return Objects.equals(modeOfTravel, that.modeOfTravel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), modeOfTravel);
    }

    @Override
    public String toString() {
        return "TravelExpenseItem{" +
                "modeOfTravel='" + modeOfTravel + '\'' +
                "} " + super.toString();
    }
}
