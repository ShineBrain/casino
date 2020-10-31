package Test.Authtorization;

import BackEnd.Account;

public class Test {
    private static final String TestLogin1 = "qqq";
    private static final String TestPassword1 = "111";

    private static final String TestLogin2 = "qwe";
    private static final String TestPassword2 = "123";

    public static void main(String[] args) {
       System.out.println("\t\t\t\t Verification authorization");

        Account account = new Account();

        PageAuthorization pageAuthorization = new PageAuthorization(account, TestLogin1, TestPassword1);

        System.out.println("---------------------------Test1--------------------------------");
        System.out.println("Test login 1: " + TestLogin1 + "; " + "Test password 1: " + TestPassword1);
        System.out.print  ("Result: ");

        if (pageAuthorization.DataValidation())
            System.out.println("Verification of the entered data is successful");
        else
            System.out.println("Verification error");

        System.out.println("---------------------------Test2--------------------------------");
        System.out.println("Test login 2: " + TestLogin2 + "; " + "Test password 2: " + TestPassword2);
        System.out.print  ("Result: ");

        PageAuthorization pageAuthorization1 = new PageAuthorization(account, TestLogin2, TestPassword2);

        if (pageAuthorization1.DataValidation())
            System.out.println("Verification of the entered data is successful");
        else
            System.out.println("Verification error");

        System.out.println("----------------------------------------------------------------");
    }
}
