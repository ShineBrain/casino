package BackEnd;

import javafx.scene.control.Alert;

import java.util.ArrayList;

import static BackEnd.OtherInterf.Transition;

public class RRbet extends Bet {
    protected static ArrayList<Account> Room0 = new ArrayList<>(6);
    protected static ArrayList<Account> Room1 = new ArrayList<>(6);
    protected static ArrayList<Account> Room2 = new ArrayList<>(6);
    protected static ArrayList<Account> Room3 = new ArrayList<>(6);
    protected static ArrayList<Account> Room4 = new ArrayList<>(6);
    protected static ArrayList<Account> Room5 = new ArrayList<>(6);

    protected String Conversion(int Number){ return String.valueOf(Number); }
    private void ClearRoom(ArrayList<Account> Room){ Room.clear(); }

    private boolean CheckOnCoincidence(ArrayList<Account> Room, Account account){
        boolean bool = true;

        for (Account value : Room){
            if (value == account){
                bool = false;
                break;
            }
        }
        return bool;
    }

    protected void AddAccount(ArrayList<Account> Room){
        if (Room.size() < 7 && CheckOnCoincidence(Room, accounts.get(NumberUser)))
            Room.add(accounts.get(NumberUser));
        else
            System.out.println("Size > 6");
    }

    protected void RRGame(ArrayList<Account> Room, int bet, double coefficient, int percent){
        if (CheckBalance(bet)){

            MinusBalance(bet);

            AddAccount(Room);

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Notification");
            alert.setHeaderText(null);
            alert.setContentText("You are in the game");
            alert.showAndWait();

            if (Room.size() == 6){

                int answer = 1 + (int)(Math.random() * 6);
                Account winner = Room.get(answer);

                for (int i = 0; i < accounts.size(); i++){
                    if (accounts.get(i) == winner){

                        double WinBet = bet * coefficient;
                        double PercentAdmin = ((bet * coefficient) * percent)/100;
                        double FinalWinBet = WinBet - PercentAdmin;

                        Admin.PersonalBalance += PercentAdmin;
                        accounts.get(i).Balance += FinalWinBet;

                        ClearRoom(Room);
                        break;
                    }
                    else System.out.println("Not user");
                }
            }
            else System.out.println("Size != 6");
        }
        else Transition("/FileFXML/NotBalance.fxml");
    }
}