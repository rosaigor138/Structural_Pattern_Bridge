package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrivateCompanyTest {
    @Test
    void shouldReturnPrivateCompanyMEI(){
        Size size = new MEI();
        PrivateCompany privateCompany = new PrivateCompany(100.0f);
        privateCompany.setSize(size);
        assertEquals(110.0f,privateCompany.calculateTax());
    }
    @Test
    void shouldReturnPrivateCompanyEI(){
        Size size = new EI();
        PrivateCompany privateCompany = new PrivateCompany(100.0f);
        privateCompany.setSize(size);
        assertEquals(130.0f,privateCompany.calculateTax());
    }
    @Test
    void shouldReturnPrivateCompanyME(){
        Size size = new ME();
        PrivateCompany privateCompany = new PrivateCompany(100.0f);
        privateCompany.setSize(size);
        assertEquals(120.0f,privateCompany.calculateTax());
    }
    @Test
    void shouldReturnPrivateCompanyMEIWithDifferentTaxBase(){
        Size size = new MEI();
        PrivateCompany privateCompany = new PrivateCompany(200.0f);
        privateCompany.setSize(size);
        assertEquals(220.0f,privateCompany.calculateTax());
    }

}