package BackEnd;

import java.util.ArrayList;

public class Account {
    public String Login;
    public String Password;
    public String CardNumber;
    public String FullName;
    public String DateExpirationCard;
    public String CVV;
    public double Balance;

    public static int NumberUser;

    public static ArrayList<Account> accounts = new ArrayList<>();

    public Account(){}

    public Account(String Login, String Password, String CardNumber, String FullName, String DateExpirationCard, String CVV){
        this.Login = Login;
        this.Password = Password;
        this.CardNumber = CardNumber;
        this.FullName = FullName;
        this.DateExpirationCard = DateExpirationCard;
        this.CVV = CVV;
    }

    public String TransformationFullName(String string){
        String strr = string.toUpperCase();
        char[] arrayChar = strr.toCharArray();

        return String.valueOf(arrayChar);
    }

    public Boolean CheckAccount(String str, String str1){
        boolean bool = false;

        for (int i = 0; i < accounts.size(); i++){
            if (accounts.get(i).Login.equals(str) && accounts.get(i).Password.equals(str1)) {
                bool = true;
                NumberUser = i;
                break;
            }
            else bool = false;
        }
        return bool;
    }

    public boolean CheckDuplicateAccount(String login, String cardNumber) {
        for (Account account : accounts) {
            if (login.equalsIgnoreCase(account.Login) || cardNumber.equals(account.CardNumber))
                return false;
        }
        return true;
    }

    protected boolean CheckBalance(int bet){ return bet == accounts.get(NumberUser).Balance || bet < accounts.get(NumberUser).Balance; }

    protected double MinusBalance(int bet){
        accounts.get(NumberUser).Balance -= bet;
        return bet;
    }

    protected boolean CheckDate(String expirationDataReg){
        try {
            char[] array = expirationDataReg.toCharArray();

            String str0 = Character.toString(array[0]);
            String str1 = Character.toString(array[1]);
            String str2 = Character.toString(array[2]);
            String str3 = Character.toString(array[3]);
            String str4 = Character.toString(array[4]);

            String string1 = str0 + str1;
            String string2 = str3 + str4;

            int num1 = Integer.parseInt(string1);
            int num2 = Integer.parseInt(string2);

            if (num1 > 0 && num1 < 13){
                if (num2 > 19 && num2 < 100){
                    return str2.equals(".");
                }
                else return false;
            }
            else return false;
        }
        catch (Exception ex){
            return false;
        }
    }

    public void TestCreateAccount(){
        accounts.add(new Account("qwe", "123", "1111222233334444", "As Sa", "11.01", "123"));
        accounts.add(new Account("Player2", "222", "2222333344445555", "Ed Di", "22.01", "456"));
        accounts.add(new Account("Player3", "333", "3333444455556666", "Mi Is", "17.03", "789"));
        accounts.add(new Account("Player4", "444", "3333634523556666", "Di Im", "23.03", "321"));
        accounts.add(new Account("Player5", "555", "3333444458786666", "Ig Go", "01.03", "654"));
        accounts.add(new Account("Player6", "666", "3311134465556666", "Ch He", "04.03", "987"));
    }
}