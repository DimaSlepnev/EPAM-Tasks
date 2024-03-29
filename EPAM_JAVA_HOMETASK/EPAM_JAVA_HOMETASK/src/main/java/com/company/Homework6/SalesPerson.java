package com.company.Homework6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (percent > 200){
            this.bonus = bonus.multiply(new BigDecimal(3));
        }
        else if (percent > 100 ) {
           this.bonus = bonus.multiply(new BigDecimal(2));
        }
        else {
            this.bonus = bonus;
        }
    }
}
