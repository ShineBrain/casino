package test.Authtorization;

import BackEnd.Account;

public class PageAuthorization {
    private Account account;
    private String  login;
    private String  password;

    public PageAuthorization(Account account, String login, String password){
        this.account = account;
        this.login = login;
        this.password = password;
    }

    //Контроллер формы авторизации использует метод CheckAccount класса Account для проверки логина и пороля пользователя
    public boolean DataValidation(){
        account.TestCreateAccount();

        if (account.CheckAccount(login, password))
            return true;
        else
            return false;
    }



}
