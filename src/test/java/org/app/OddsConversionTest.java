package org.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddsConversionTest {

    @Test
    void probabilityToDecimalTest(){
        assertEquals(2, OddsConversion.probabilityToDecimalOdds(50.0));
        assertEquals(1.01, OddsConversion.probabilityToDecimalOdds(99.0));
        assertEquals(19.05, OddsConversion.probabilityToDecimalOdds(5.25));
    }

    @Test
    void decimalToAmericanOdds(){
        assertEquals("+100", OddsConversion.decimalToAmericanOdds(2.0));
        assertEquals("-1111", OddsConversion.decimalToAmericanOdds(1.09));
        assertEquals("+230", OddsConversion.decimalToAmericanOdds(3.30));
        assertEquals("-909", OddsConversion.decimalToAmericanOdds(1.11));
    }
}