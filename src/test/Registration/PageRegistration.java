package Test.Registration;

import BackEnd.Account;

public class PageRegistration {
    private Account account;
    private String login;
    private String cardNumber;

    //Проверка на оригинальность аккаунта производится в классе контроллера RegUserController, используя метод CheckDuplicateAccount из класса Account, по полям "номер карты" и "логин"
    //Проверка на коректный ввод данных при регистрации производится в классе контроллера RegUserController с помощью регулярных выражений
    public PageRegistration(Account account, String login, String cardNumber){
        this.account = account;
        this.login = login;
        this.cardNumber = cardNumber;
    }

    public boolean CheckAccount(){
        account.TestCreateAccount();

        if (account.CheckDuplicateAccount(login, cardNumber)){
            return false;
        }
        return true;
    }
}
