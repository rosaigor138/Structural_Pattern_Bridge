package org.example;

public class PublicCompany extends Company{
    public PublicCompany(){
        super(0.0f);
    }
    @Override
    public float calculateTax() {
        return baseTax;
    }
}
