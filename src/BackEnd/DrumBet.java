package BackEnd;

public class DrumBet extends RRbet implements OtherInterf {
    protected int DropNum = 0;

    protected void Calculations(int bet, int percent, double coefficient){
        MinusBalance(bet);

        double WinBet = bet * coefficient;
        double PercentAdmin = ((bet * coefficient) * percent)/100;
        double FinalWinBet = WinBet - PercentAdmin;

        Admin.PersonalBalance += PercentAdmin;
        accounts.get(NumberUser).Balance += FinalWinBet;
    }

    private boolean CheckArray(int[] array, int number){
        boolean bool = false;

        for (int value : array){
            if (value == number) {
                bool = true;
                break;
            }
        }
        return bool;
    }

    private boolean CheckBet(int bet){ return bet > 0 && bet < 1000001; }

    protected void VoteColor(String color, int bet, int percent, double coefficient){
        int answer = 1 + (int)(Math.random() * 36);
        int distributor;

        if (color.equals("Red"))
            distributor = 1;
        else
            distributor = 2;

        switch (distributor){
            case 1:
                if (CheckBalance(bet)){
                    DropNum = answer;
                    if (bet > 0 && bet < 1000001){
                        if (answer % 2 == 0 && color.equals("Red")){
                            Calculations(bet, percent, coefficient);
                            OtherInterf.FXNotification("You won!");
                        }
                        else {
                            Admin.OverallBalance += MinusBalance(bet);
                            OtherInterf.FXNotification("Lose");
                        }
                    }
                    else OtherInterf.FXNotification("Invalid balance entered");
                }
                else OtherInterf.FXNotification("Insufficient funds");

                break;
            case 2:
                if (CheckBalance(bet)){
                    DropNum = answer;
                    if (bet > 0 && bet < 1000001){
                        if (answer % 2 != 0 && color.equals("Black")){
                            Calculations(bet, percent, coefficient);
                            OtherInterf.FXNotification("You won!");
                        }
                        else {
                            Admin.OverallBalance += MinusBalance(bet);
                            OtherInterf.FXNotification("Lose");
                        }
                    }
                    else OtherInterf.FXNotification("Invalid balance entered");
                }
                else OtherInterf.FXNotification("Insufficient funds");

                break;
            default:
                System.err.println("Error");
        }
    }

    protected void VoteColumn(int numberColumn, int bet, int percent, double coefficient){
        int answer = 1 + (int)(Math.random() * 36);

        int[] array1 = {1, 4, 7, 10, 13, 16, 19, 22, 25, 28, 31, 34};
        int[] array2 = {2, 5, 8, 11, 14, 17, 20, 23, 26, 29, 32, 35};
        int[] array3 = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36};

        switch (numberColumn){
            case 1:
                if (CheckBet(bet)){
                    if (CheckBalance(bet)){
                        DropNum = answer;
                        if (CheckArray(array1, answer)){
                            Calculations(bet, percent, coefficient);
                            OtherInterf.FXNotification("You won!");
                        }
                        else {
                            Admin.OverallBalance += MinusBalance(bet);
                            OtherInterf.FXNotification("Lose");
                        }
                    }
                    else OtherInterf.FXNotification("Insufficient funds");
                }
                else OtherInterf.FXNotification("Invalid balance entered");

                break;
            case 2:
                if (CheckBet(bet)){
                    if (CheckBalance(bet)){
                        DropNum = answer;
                        if (CheckArray(array2, answer)){
                            Calculations(bet, percent, coefficient);
                            OtherInterf.FXNotification("You won!");
                        }
                        else {
                            Admin.OverallBalance += MinusBalance(bet);
                            OtherInterf.FXNotification("Lose");
                        }
                    }
                    else OtherInterf.FXNotification("Insufficient funds");
                }
                else OtherInterf.FXNotification("Invalid balance entered");

                break;
            case 3:
                if (CheckBet(bet)){
                    if (CheckBalance(bet)){
                        DropNum = answer;
                        if (CheckArray(array3, answer)){
                            Calculations(bet, percent, coefficient);
                            OtherInterf.FXNotification("You won!");
                        }
                        else {
                            Admin.OverallBalance += MinusBalance(bet);
                            OtherInterf.FXNotification("Lose");
                        }
                    }
                    else OtherInterf.FXNotification("Insufficient funds");
                }
                else OtherInterf.FXNotification("Invalid balance entered");

                break;
            default:
                System.err.println("Error");
        }
    }

    protected void FromTo(int from, int to, int bet, int percent, double coefficient){
        int answer = (int) (Math.random() * 36);

        if (CheckBet(bet)){
            if (CheckBalance(bet)){
                DropNum = answer;
                if (answer > from - 1 && answer < to + 1){
                    Calculations(bet, percent, coefficient);
                    OtherInterf.FXNotification("You won");
                }
                else {
                    Admin.OverallBalance += MinusBalance(bet);
                    OtherInterf.FXNotification("You lose");
                }
            }
            else OtherInterf.FXNotification("Insufficient funds");
        }
        else OtherInterf.FXNotification("Invalid balance entered");
    }
}