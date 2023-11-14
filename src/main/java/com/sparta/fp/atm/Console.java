package com.sparta.fp.atm;

import java.util.Scanner;

public class Console {

    private ATM atm = new ATM();

    public void showCurrentValuesInATM(){
        System.out.println("Values  quantity of units");
        System.out.println("50       "+ atm.getNoteOf50());
        System.out.println("20       "+ atm.getNoteOf20());
        System.out.println("10       "+ atm.getNoteOf10());
        System.out.println("5        "+ atm.getNoteOf5());
        System.out.println("2        "+ atm.getNoteOf2());
        System.out.println("1        "+ atm.getNoteOf1());

    }
    public void operation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the amount to withdraw:  ");
        String amountInput=scanner.nextLine();
        int amount = Integer.parseInt(amountInput);
        atm.withdrawValue(amount);
    }

    public void userInteraction(){
        showCurrentValuesInATM();
        operation();
        showCurrentValuesInATM();
    }
}
