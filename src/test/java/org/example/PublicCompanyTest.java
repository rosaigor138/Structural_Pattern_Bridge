package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PublicCompanyTest {

    @Test
    void shouldReturnPublicCompanyMEI(){
        Size size = new MEI();
        PublicCompany publicCompany = new PublicCompany();
        publicCompany.setSize(size);
        assertEquals(0.0f,publicCompany.calculateTax());
    }
    @Test
    void shouldReturnPublicCompanyMEIWithBaseTax(){
        Size size = new MEI();
        PublicCompany publicCompany = new PublicCompany();
        publicCompany.setBaseTax(100.0f);
        publicCompany.setSize(size);
        assertEquals(100.0f,publicCompany.calculateTax(),0.0f);
    }

}