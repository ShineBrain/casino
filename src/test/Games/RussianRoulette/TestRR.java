package Test.Games.RussianRoulette;

import BackEnd.Account;
import Test.Games.SlotMachine.SlotMachine;

import java.util.ArrayList;

public class TestRR {
    private static final int numberUser0 = 0;
    private static final int numberUser3 = 3;

    private static final double balanceUser0 = 10000;
    private static final double balanceUser3 = 100;

    private static final int bet = 1000;

    private static final int betForGame = 1000;
    private static final double coefficient = 6;
    private static final int percent = 2;

    private static final int roomSize = 6;

    private static ArrayList<Account> room = new ArrayList<>();
    private static ArrayList<Account> room1 = new ArrayList<>();


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


        System.out.println("\t\t\t\t\t   Check RRGame");
        System.out.println("---------------------------Test1--------------------------------");

        Account.accounts.clear();

        Account account = new Account();
        account.TestCreateAccount();

        String infAccounts = "";

        for (int i = 0; i < roomSize; i++){
            Account.accounts.get(i).Balance = 10000;
            room.add(Account.accounts.get(i));

            infAccounts += "Login: " + Account.accounts.get(i).Login + "; " + "Card number: " + Account.accounts.get(i).CardNumber + "; " + "Balance: " + Account.accounts.get(i).Balance + ";\n";
        }

        GameRR gameRR = new GameRR(room, betForGame , coefficient, percent);

        System.out.print("Users in room:\n" + infAccounts + "\n"
                         + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "Percent: " + percent + ";\n"
                         + "Result: ");

        if (gameRR.CheckGameRR())
            System.out.println("True");
        else
            System.out.println("False");

        for (Account accountFinishTest : Account.accounts){
            accountFinishTest.Balance -= bet;

            System.out.println  ("Login: " + accountFinishTest.Login + "; "
                               + "Number card: " + accountFinishTest.CardNumber + "; "
                               + "Balance: " + accountFinishTest.Balance + "; ");
        }

        Account.accounts.clear();


        System.out.println("---------------------------Test2--------------------------------");

        Account.accounts.clear();

        Account account1 = new Account();
        account1.TestCreateAccount();

        String infAccounts1 = "";

        for (int i = 0; i < 5; i++){
            Account.accounts.get(i).Balance = 10000;
            room1.add(Account.accounts.get(i));

            infAccounts1 += "Login: " + Account.accounts.get(i).Login + "; " + "Card number: " + Account.accounts.get(i).CardNumber + "; " + "Balance: " + Account.accounts.get(i).Balance + ";\n";
        }

        GameRR gameRR1 = new GameRR(room1, betForGame , coefficient, percent);

        System.out.print("Users in room:\n" + infAccounts1 + "\n"
                       + "Bet: " + betForGame + "; " + "Coefficient: " + coefficient + "; " + "Percent: " + percent + ";\n"
                       + "Result: ");

        if (gameRR1.CheckGameRR())
            System.out.println("True");
        else
            System.out.println("False");

        for (Account accountFinishTest : Account.accounts){
            System.out.println  ("Login: " + accountFinishTest.Login + "; "
                               + "Number card: " + accountFinishTest.CardNumber + "; "
                               + "Balance: " + accountFinishTest.Balance + "; ");
        }

        Account.accounts.clear();
    }
}
