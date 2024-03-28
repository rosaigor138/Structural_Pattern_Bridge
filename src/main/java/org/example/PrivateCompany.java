package org.example;

public class PrivateCompany extends Company{
    public PrivateCompany(float tax){
        super(tax);
    }

    @Override
    public float calculateTax() {
        return this.baseTax * (1 + this.size.taxPercentageIncrease());
    }
}
