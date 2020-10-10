import BackEnd.Account;
import BackEnd.AccountsDataManager;

public class AccountDataManager_Example {
    public static void main(String[] args) {
        AccountsDataManager dm = new AccountsDataManager();

        // Use the option functions before the init function of account data manager
        //dm.option_setNameProfileFile("profile.prf");

        //dm.option_saveAlways();
        //dm.option_writeLogFile();

        // before using library, init the data manager
        dm.init();

        dm.add(new Account("1", "2", "3", "4", "5", "6"));
        dm.add(new Account("1", "2", "3", "4", "5", "6"));
        dm.add(new Account("1", "2", "3", "4", "5", "6"));

        for (Account acc : dm.getAll())
            System.out.println(acc.FullName);

        int idx = 0;
        if (dm.size() >= 1)
            dm.remove(idx);

        for (int i = 0; i < dm.size(); i++)
            System.out.println(dm.get(i).DateExpirationCard);

        // after end of work with library, free it
        dm.free();
    }
}
