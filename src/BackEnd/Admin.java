package BackEnd;

public class Admin {
    
    public static double OverallBalance = 1000000;
    public static double PersonalBalance = 0;

    public static double MinusBalance(double WinBet){
        OverallBalance -= WinBet;

        return WinBet;
    }

}
