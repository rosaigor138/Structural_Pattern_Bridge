package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MixedCompanyTest {
    @Test
    void shouldReturnMixedCompanyMEI(){
        Size size = new MEI();
        MixedCompany mixedCompany = new MixedCompany(100.0f, 0.1f);
        mixedCompany.setSize(size);
        assertEquals(11.0f,mixedCompany.calculateTax());
    }

    @Test
    void shouldReturnMixedCompanyEI(){
        Size size = new EI();
        MixedCompany mixedCompany = new MixedCompany(100.0f, 0.3f);
        mixedCompany.setSize(size);
        assertEquals(39.0f,mixedCompany.calculateTax());
    }
    @Test
    void shouldReturnMixedCompanyME(){
        Size size = new ME();
        MixedCompany mixedCompany = new MixedCompany(100.0f, 0.2f);
        mixedCompany.setSize(size);
        assertEquals(24.0f,mixedCompany.calculateTax());
    }
    @Test
    void shouldReturnMixedCompanyWithDifferentPrivatePercentage(){
        Size size = new MEI();
        MixedCompany mixedCompany = new MixedCompany(100.0f, 0.5f);
        mixedCompany.setSize(size);
        assertEquals(55.0f,mixedCompany.calculateTax());
    }
}