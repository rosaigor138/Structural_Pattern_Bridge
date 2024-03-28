package org.example;

public abstract class Company {
    protected Size size;
    protected float baseTax;

    public Company(float  tax){
        this.baseTax = tax;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public float getBaseTax() {
        return baseTax;
    }

    public void setBaseTax(float baseTax) {
        this.baseTax = baseTax;
    }

    public abstract float calculateTax();
}
