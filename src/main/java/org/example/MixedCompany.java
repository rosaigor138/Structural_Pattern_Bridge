package org.example;

public class MixedCompany extends Company{

    private float privatePercentage;
    public MixedCompany(float tax, float privatePercentage){
        super(tax);
        this.privatePercentage = privatePercentage;
    }

    @Override
    public float calculateTax() {
        return this.baseTax * privatePercentage * (1 + this.size.taxPercentageIncrease());
    }
}
