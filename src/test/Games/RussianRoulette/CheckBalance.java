package Test.Games.RussianRoulette;

import BackEnd.Account;

public class CheckBalance {
    //Для участия в игре Russian Roulette необходимо иметь достаточно средств на счету

    //Проверка достаточности баланса для игры в Russian Roulette происходит в контроллере BetRoomController с помощью метода CheckBalance
    //класса Account.
    private final Account account;
    private final int numberUser;
    private final double balanceUser;
    private final int bet;

    public CheckBalance(Account account, int numberUser, double balanceUser, int bet) {
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

