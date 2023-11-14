package com.sparta.fp.atm;

public class ATM {

    private int noteOf50 = 12;
    private int noteOf20 = 20;
    private int noteOf10 = 50;
    private int noteOf5 = 100;
    private int noteOf2 = 250;
    private int noteOf1 = 500;

    public int getNoteOf50() {
        return noteOf50;
    }

    public int getNoteOf20() {
        return noteOf20;
    }

    public int getNoteOf10() {
        return noteOf10;
    }

    public int getNoteOf5() {
        return noteOf5;
    }

    public int getNoteOf2() {
        return noteOf2;
    }

    public int getNoteOf1() {
        return noteOf1;
    }

    public void withdrawValue(int amount){

        System.out.println("Customer withdraws  £" + amount);
       if (amount >=50){
           int noteNum= amount/50;
           System.out.println(noteNum + " x £50");
           amount= amount-(noteNum*50);
           noteOf50=noteOf50-noteNum;
       }
        if (amount >=20){
            int noteNum= amount/20;
            System.out.println(noteNum + " x £20");
            amount= amount-(noteNum*20);
            noteOf20=noteOf20-noteNum;
        }
        if (amount >=10){
            int noteNum= amount/10;
            System.out.println(noteNum + " x £10");
            amount= amount-(noteNum*10);
            noteOf10=noteOf10-noteNum;
        }
        if (amount >=5){
            int noteNum= amount/5;
            System.out.println(noteNum + " x £5");
            amount= amount-(noteNum*5);
            noteOf5=noteOf5-noteNum;
        }
        if (amount >=2){
            int noteNum= amount/2;
            System.out.println(noteNum + " x £2");
            amount= amount-(noteNum*2);
            noteOf2=noteOf2-noteNum;
        }
        if (amount >=1){
            int noteNum= amount/1;
            System.out.println(noteNum + " x £1");
            amount= amount-(noteNum*1);
            noteOf1=noteOf1-noteNum;
        }





    }
}
