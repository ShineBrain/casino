package BackEnd;

public class Bet extends Account {

    protected static boolean CheckNum(String string){
        try {
            int num = Integer.parseInt(string);

            if (num > 0 && num < 7)
                return true;
            else
                return false;
        }
        catch (Exception ex){
            System.err.println(ex);
            return false;
        }
    }

    protected static boolean CheckBalance(int bet){
        if (bet == Balance || bet < Balance)
            return true;
        else
            return false;
    }

    protected static void Game(String vote, int bet, double coefficient, int percent){
        int voteNum = Integer.parseInt(vote);

        int answer = 1 + (int)(Math.random() * 6);

        if (voteNum == answer){
            double WinBet = bet * coefficient;
            double PercentAdmin = ((bet * coefficient) * percent)/100;
            double FinalWin = WinBet - PercentAdmin;

            Admin.PersonalBalance += PercentAdmin;

            Balance += Admin.MinusBalance(FinalWin);
        }
        else{ Admin.OverallBalance += MinusBalance(bet); }
    }
}
