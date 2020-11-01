package Test.Games.Drum;

import BackEnd.Account;
import BackEnd.DrumBet;

import java.awt.dnd.DragGestureEvent;

//Игровой процесс в Drum строится на основе подсчетов из методов VoteColor, VoteColumn, FromTo из класса DrumBet
public class GameProcess {
    private final Account account;
    private final int betInDrum;
    private final int percent;
    private final double coefficient;

    private String color;
    private int numberColumn;
    private int from;
    private int to;

    public GameProcess(Account account, String color, int betInDrum, int percent, double coefficient){
        this.account = account;
        this.color = color;
        this.betInDrum = betInDrum;
        this.percent = percent;
        this.coefficient = coefficient;
    }

    public GameProcess(Account account, int numberColumn, int betInDrum, int percent, double coefficient){
        this.account = account;
        this.numberColumn = numberColumn;
        this.betInDrum = betInDrum;
        this.percent = percent;
        this.coefficient = coefficient;
    }

    public GameProcess(Account account, int from, int to, int betInDrum, int percent, double coefficient){
        this.account = account;
        this.from = from;
        this.to = to;
        this.betInDrum = betInDrum;
        this.percent = percent;
        this.coefficient = coefficient;
    }

    public boolean GameOverBlackOrRed(){
        account.TestCreateAccount();

        Account.NumberUser = 0;
        Account.accounts.get(Account.NumberUser).Balance = 10000;

        try {
            DrumBet drumBet = new DrumBet();
            drumBet.VoteColor(color, betInDrum, percent, coefficient);

            return true;
        } catch (Exception exception){
            return false;
        }
    }

    public boolean GameColumn(){
        account.TestCreateAccount();

        Account.NumberUser = 0;
        Account.accounts.get(Account.NumberUser).Balance = 10000;

        try {
            DrumBet drumBet = new DrumBet();
            drumBet.VoteColumn(numberColumn, betInDrum, percent, coefficient);

            return true;
        } catch (Exception exception){
            return false;
        }
    }

    public boolean GameFromTo(){
        account.TestCreateAccount();

        Account.NumberUser = 0;
        Account.accounts.get(Account.NumberUser).Balance = 10000;

        try{
            DrumBet drumBet = new DrumBet();
            drumBet.FromTo(from, to, betInDrum, percent, coefficient);

            return true;
        } catch (Exception exception){
            return false;
        }


    }

}
