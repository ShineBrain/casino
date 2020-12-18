package Test.Games.SlotMachine;

import BackEnd.Bet;

public class GameProcess extends Bet {
    //Процесс проведения игры:
    //Проверка введенного числа на правильность -> проверка баланса на наличие средств -> ВЫПОЛНЕНИЕ ВЫЧИСЛЕНИЙ -> уведомление
    //Выполнение вычислений происходит в методе Game класса Bet

    private final Bet betClass;
    private final String vote;
    private final int bet;
    private final double coefficient;
    private final int percent;

    public GameProcess(Bet betClass, String vote, int bet, double coefficient, int percent){
        this.betClass = betClass;
        this.vote = vote;
        this.bet = bet;
        this.coefficient = coefficient;
        this.percent = percent;
    }

    public boolean GameP(){
        return betClass.Game(vote, bet, coefficient, percent);
    }

}
