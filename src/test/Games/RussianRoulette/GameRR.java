package Test.Games.RussianRoulette;

import BackEnd.Account;
import BackEnd.RRbet;

import java.util.ArrayList;

public class GameRR {
    //Процесс игры Russian Roulette реализуется в методе RRGame класса RRbet

    private final ArrayList<Account> room;
    private final int bet;
    private final double coefficient;
    private final int percent;
    RRbet rRbet = new RRbet();

    public GameRR(ArrayList<Account> room, int bet, double coefficient, int percent){
        this.room = room;
        this.bet = bet;
        this.coefficient = coefficient;
        this.percent = percent;
    }

    public boolean CheckGameRR(){
        try {
            rRbet.RRGame(room, bet, coefficient, percent);

            return true;
        } catch (Exception exception){
            return false;
        }
    }

}
