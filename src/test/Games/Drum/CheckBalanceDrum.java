package Test.Games.Drum;

import BackEnd.Account;

public class CheckBalanceDrum {
    private final Account account;
    private final int numberUser;
    private final double balanceUser;
    private final int bet;

    public CheckBalanceDrum(Account account, int numberUser, double balanceUser, int bet) {
        this.account = account;
        this.numberUser = numberUser;
        this.balanceUser = balanceUser;
        this.bet = bet;
    }

    public boolean CheckBalanceUser() {
        account.TestCreateAccount();

        Account.accounts.get(numberUser).Balance = balanceUser;
        Account.NumberUser = numberUser;

        return account.CheckBalance(bet);
    }
}
