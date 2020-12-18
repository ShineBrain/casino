package BackEnd;

public class Admin {
    
    public static double OverallBalance = 1000000;
    public static double PersonalBalance = 0;

    //Метод списания денег с баланса
    public static double MinusBalance(double WinBet){
        OverallBalance -= WinBet;

        return WinBet;
    }

}
