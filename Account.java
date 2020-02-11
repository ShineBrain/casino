package BackEnd;

import java.util.ArrayList;

public class Account {
    public String Login;
    public String Password;
    public String CardNumber;
    public String FullName;
    public String DateExpirationCard;
    public String CVV;

    public static int NumberUser;
    public static double Balance;

    public static ArrayList<Account> accounts = new ArrayList<Account>();

    public Account(){}

    public Account(String Login, String Password, String CardNumber, String FullName, String DateExpirationCard, String CVV){
        this.Login = Login;
        this.Password = Password;
        this.CardNumber = CardNumber;
        this.FullName = FullName;
        this.DateExpirationCard = DateExpirationCard;
        this.CVV = CVV;
    }

    public Account(String Login, String Password, String CardNumber, String Fullname, String DateExpirationCard, String CVV, double Balance){
        this.Login = Login;
        this.Password = Password;
        this.CardNumber = CardNumber;
        this.FullName = Fullname;
        this.DateExpirationCard = DateExpirationCard;
        this.CVV = CVV;
        this.Balance = Balance;
    }

    public String TransformationFullName(String string){
        char[] arrayChar = string.toUpperCase().toCharArray();
        //for (int i = 0; i < arrayChar.length; i++){ if(arrayChar[i] == ' ') { arrayChar[i] = '_'; } }

        String str = String.valueOf(arrayChar);

        return str;
    }

    public Boolean CheckAccount(String str, String str1){
        Boolean bool = false;

        for (int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).Login.equals(str) && accounts.get(i).Password.equals(str1)) {
                bool = true;
                NumberUser = i;
                break;
            }
            else { bool = false; }
        }
        return bool;
    }

    protected static double MinusBalance(int bet){
        Balance -= (double)bet;

        return bet;
    }

    protected static double PlusBalance(int WinBet){
        Balance += (double)WinBet;

        return WinBet;
    }

    public void TestCreateAccount(){
        accounts.add(new Account("qwe", "123", "1111222233334444", "Qwe ret", "11.01", "123"));
        accounts.add(new Account("rty", "123", "2222333344445555", "bFcv FDS", "22.01", "456"));
        accounts.add(new Account("uio", "123", "3333444455556666", "xcV fS", "17.03", "789"));
    }
}