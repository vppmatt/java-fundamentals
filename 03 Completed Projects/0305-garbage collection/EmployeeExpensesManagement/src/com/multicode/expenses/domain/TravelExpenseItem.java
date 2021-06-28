package com.multicode.expenses.domain;

import com.multicode.expenses.domain.types.*;

import java.math.*;
import java.util.*;

public class TravelExpenseItem implements ExpenseItem {

    private TravelMode modeOfTravel;
    private int id;
    private int claimId;
    private String description;
    private BigDecimal amount;

    public void setModeOfTravel(TravelMode modeOfTravel) {
        this.modeOfTravel = modeOfTravel;
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

    public TravelExpenseItem(int id, int claimId, String description, BigDecimal amount, TravelMode modeOfTravel) {
        this.id = id;
        this.claimId = claimId;
        this.description = description;
        this.amount = amount;
        this.modeOfTravel = modeOfTravel;
    }

    public TravelMode getModeOfTravel() {
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
