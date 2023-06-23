package org.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddsScannerTest {

    @Test
    void checkForValidPercent(){
        assertTrue(OddsScanner.isValidPercentage("99%"));
        assertTrue(OddsScanner.isValidPercentage("1"));
        assertTrue(OddsScanner.isValidPercentage("12"));

        assertFalse(OddsScanner.isValidPercentage("-10"));
        assertFalse(OddsScanner.isValidPercentage("10*"));
        assertFalse(OddsScanner.isValidPercentage("100"));
        assertFalse(OddsScanner.isValidPercentage("0"));
    }
}