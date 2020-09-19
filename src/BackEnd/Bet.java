package BackEnd;

public class Bet extends Account {

    protected static boolean CheckNum(String string){
        try {
            int num = Integer.parseInt(string);

            return num > 0 && num < 7;
        }
        catch (Exception ex){
            return false;
        }
    }

    protected boolean Game(String vote, int bet, double coefficient, int percent){
        int voteNum = Integer.parseInt(vote);

        int answer = 1 + (int)(Math.random() * 6);

        if (voteNum == answer){
            MinusBalance(bet);

            double WinBet = bet * coefficient;
            double PercentAdmin = ((bet * coefficient) * percent)/100;
            double FinalWin = WinBet - PercentAdmin;

            Admin.PersonalBalance += PercentAdmin;

            accounts.get(NumberUser).Balance += Admin.MinusBalance(FinalWin);

            return true;
        }
        else {
            Admin.OverallBalance += MinusBalance(bet);
            return false;
        }
    }
}
