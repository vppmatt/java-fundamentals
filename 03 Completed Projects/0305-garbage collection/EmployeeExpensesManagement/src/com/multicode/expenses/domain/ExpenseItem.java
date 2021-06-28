package com.multicode.expenses.domain;

import java.math.*;
import java.util.*;

public interface ExpenseItem {

    public int getId();

    public int getClaimId();

    public String getDescription();

    public BigDecimal getAmount();

}
