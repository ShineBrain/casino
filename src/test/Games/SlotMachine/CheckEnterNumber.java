package Test.Games.SlotMachine;

import BackEnd.Bet;

//Проверка веденного числа на правильность(1-6) происходит в методе CheckNumber класса Bet
public class CheckEnterNumber extends Bet{
    private final String number;

    public CheckEnterNumber(String number) {
        this.number = number;
    }

    public boolean CheckNumber(){
        return Bet.CheckNum(number);
    }
}
