package Test.Games.Drum;

import BackEnd.Account;

public class TestD {
    private static final int numberUser0 = 0;
    private static final int numberUser3 = 3;

    private static final double balanceUser0 = 10000;
    private static final double balanceUser3 = 100;

    private static final int bet = 1000;


    private static final String colorR = "Red";
    private static final String colorB = "Black";

    private static final int betInDrum = 500;

    private static final int percent = 2;
    private static final double coefficient = 2;

    private static final int from = 1;
    private static final int to = 13;

    private static final int columnNumber = 1;

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t   Check balance");

        System.out.println("---------------------------Test1--------------------------------");

        CheckBalanceDrum checkBalanceDrum = new CheckBalanceDrum(new Account(), numberUser0, balanceUser0, bet);

        System.out.println("User 1");
        System.out.println("Balance: " + balanceUser0 + "; " + "Bet: " + bet + ";");
        System.out.print  ("Result: ");

        if (checkBalanceDrum.CheckBalanceUser())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test2--------------------------------");

        CheckBalanceDrum checkBalanceDrum1 = new CheckBalanceDrum(new Account(), numberUser3, balanceUser3, bet);

        System.out.println("User 2");
        System.out.println("Balance: " + balanceUser3 + "; " + "Bet: " + bet + ";");
        System.out.print  ("Result: ");

        if (checkBalanceDrum1.CheckBalanceUser())
            System.out.println("True");
        else
            System.out.println("False");


        System.out.println();

        System.out.println("\t\t\t\t\t   Check Drum");
        System.out.println("---------------------------Test1--------------------------------");

        GameProcess gameProcess = new GameProcess(new Account(), colorR, betInDrum, percent, coefficient);

        System.out.println("Color: " + colorR + "; " + "Bet: " + betInDrum + "; " + "Percent: " + percent + "; " + "Coefficient: " + coefficient + ";" );
        System.out.print  ("Result: ");

        if (gameProcess.GameOverBlackOrRed())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test2--------------------------------");
        System.out.println("---------------------------Red/black--------------------------------");

        GameProcess gameProcess1 = new GameProcess(new Account(), colorB, betInDrum, percent, coefficient);

        System.out.println("Color: " + colorB + "; " + "Bet: " + betInDrum + "; " + "Percent: " + percent + "; " + "Coefficient: " + coefficient + ";" );
        System.out.print  ("Result: ");

        if (gameProcess1.GameOverBlackOrRed())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test3--------------------------------");
        System.out.println("---------------------------Column--------------------------------");

        GameProcess gameProcess3 = new GameProcess(new Account(), columnNumber, betInDrum, percent, coefficient);

        System.out.println("Number column: " + columnNumber + "; " + "Bet: " + betInDrum + "; " + "Percent: " + percent + "; " + "Coefficient: " + coefficient + ";" );

        if (gameProcess3.GameColumn())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test4--------------------------------");
        System.out.println("---------------------------From/To--------------------------------");

        GameProcess gameProcess2 = new GameProcess(new Account(), from, to, betInDrum, percent, coefficient);

        System.out.println("From: " + from + "; " + "To: " + to + "; " + "Bet: " + betInDrum + "; " + "Percent: " + percent + "; " + "Coefficient: " + coefficient + ";" );
        System.out.print  ("Result: ");

        if (gameProcess2.GameFromTo())
            System.out.println("True");
        else
            System.out.println("False");

    }
}
