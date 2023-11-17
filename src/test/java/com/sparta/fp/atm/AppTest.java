package com.sparta.fp.atm;


import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */@Test
    public void testWithdrawalWithSufficientNotes() {
        ATM atm = new ATM();
        int initialNoteOf50 = atm.getNoteOf50();
        int initialNoteOf20 = atm.getNoteOf20();
        int initialNoteOf10 = atm.getNoteOf10();

        int withdrawalAmount = 70;
        atm.withdrawValue(withdrawalAmount);

        int expectedNoteOf50 = initialNoteOf50 - 1;
        int expectedNoteOf20 = initialNoteOf20 - 1;
        int expectedNoteOf10 = initialNoteOf10;

        Assertions.assertEquals(expectedNoteOf50, atm.getNoteOf50());
        Assertions.assertEquals(expectedNoteOf20, atm.getNoteOf20());
        Assertions.assertEquals(expectedNoteOf10, atm.getNoteOf10());
    }

         @Test
    public void testWithdrawalWithSufficientNotes_Withdraw80() {
        ATM atm = new ATM();
        int initialNoteOf50 = atm.getNoteOf50();
        int initialNoteOf20 = atm.getNoteOf20();
        int initialNoteOf10 = atm.getNoteOf10();

        int withdrawalAmount = 80;
        atm.withdrawValue(withdrawalAmount);

        int expectedNoteOf50 = initialNoteOf50 - 1;
        int expectedNoteOf20 = initialNoteOf20 - 1;
        int expectedNoteOf10 = initialNoteOf10 -1;

        Assertions.assertEquals(expectedNoteOf50, atm.getNoteOf50());
        Assertions.assertEquals(expectedNoteOf20, atm.getNoteOf20());
        Assertions.assertEquals(expectedNoteOf10, atm.getNoteOf10());
    }


}
