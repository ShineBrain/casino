package Test.Games.SlotMachine;

import BackEnd.Account;
import BackEnd.Bet;

public class TestSM {
    private static final int numberUser0 = 0;
    private static final int numberUser3 = 3;

    private static final double balanceUser0 = 10000;
    private static final double balanceUser3 = 100;

    private static final int bet = 1000;

    private static final String inputNumber1 = "4";
    private static final String inputNumber2 = "11";

    private static final String vote1 = "1";
    private static final String vote2 = "2";
    private static final String vote3 = "3";
    private static final String vote4 = "4";
    private static final String vote5 = "5";
    private static final String vote6 = "6";

    private static final int betForGame = 500;
    private static final double coefficient = 2;
    private static final int percent = 1;

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t   Check balance");

        System.out.println("---------------------------Test1--------------------------------");

        SlotMachine slotMachine0 = new SlotMachine(new Account(), numberUser0, balanceUser0, bet);

        System.out.println("User 1");
        System.out.println("Balance: " + balanceUser0 + "; " + "Bet: " + bet + ";");
        System.out.print  ("Result: ");

        if (slotMachine0.CheckBalance())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test2--------------------------------");

        SlotMachine slotMachine3 = new SlotMachine(new Account(), numberUser3, balanceUser3, bet);

        System.out.println("User 2");
        System.out.println("Balance: " + balanceUser3 + "; " + "Bet: " + bet + ";");
        System.out.print  ("Result: ");

        if (slotMachine3.CheckBalance())
            System.out.println("True");
        else
            System.out.println("False");


        System.out.println();


        System.out.println("\t\t\t\t\t  Check input number");
        System.out.println("---------------------------Test1--------------------------------");

        CheckEnterNumber checkEnterNumber = new CheckEnterNumber(inputNumber1);

        System.out.println("Number1");
        System.out.println("Value = " + inputNumber1);
        System.out.print  ("Result: ");

        if (checkEnterNumber.CheckNumber())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test2--------------------------------");

        CheckEnterNumber checkEnterNumber1 = new CheckEnterNumber(inputNumber2);

        System.out.println("Number2");
        System.out.println("Value = " + inputNumber2);
        System.out.print  ("Result: ");

        if (checkEnterNumber1.CheckNumber())
            System.out.println("True");
        else
            System.out.println("False");


        System.out.println();


        System.out.println("\t\t\t\t\t  Process game");

        System.out.println("---------------------------Test1--------------------------------");
        System.out.println("Vote: " + vote1 + "; " + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "percent: " + percent + ";");
        System.out.print  ("Result: ");

        GameProcess gameProcess1 = new GameProcess(new Bet(), vote1, betForGame, coefficient, percent);

        if (gameProcess1.GameP())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test2--------------------------------");
        System.out.println("Vote: " + vote2 + "; " + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "percent: " + percent + ";");
        System.out.print  ("Result: ");

        GameProcess gameProcess2 = new GameProcess(new Bet(), vote2, betForGame, coefficient, percent);

        if (gameProcess2.GameP())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test3--------------------------------");
        System.out.println("Vote: " + vote3 + "; " + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "percent: " + percent + ";");
        System.out.print  ("Result: ");

        GameProcess gameProcess3 = new GameProcess(new Bet(), vote3, betForGame, coefficient, percent);

        if (gameProcess3.GameP())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test4--------------------------------");
        System.out.println("Vote: " + vote2 + "; " + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "percent: " + percent + ";");
        System.out.print  ("Result: ");

        GameProcess gameProcess4 = new GameProcess(new Bet(), vote4, betForGame, coefficient, percent);

        if (gameProcess4.GameP())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test5--------------------------------");
        System.out.println("Vote: " + vote5 + "; " + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "percent: " + percent + ";");
        System.out.print  ("Result: ");

        GameProcess gameProcess5 = new GameProcess(new Bet(), vote5, betForGame, coefficient, percent);

        if (gameProcess5.GameP())
            System.out.println("True");
        else
            System.out.println("False");

        System.out.println("---------------------------Test6--------------------------------");
        System.out.println("Vote: " + vote6 + "; " + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "percent: " + percent + ";");
        System.out.print  ("Result: ");

        GameProcess gameProcess6 = new GameProcess(new Bet(), vote6, betForGame, coefficient, percent);

        if (gameProcess6.GameP())
            System.out.println("True");
        else
            System.out.println("False");

    }
}
