package BackEnd;

import java.util.ArrayList;

public class AccountsDataManager {
    static { Runtime.getRuntime().loadLibrary("adm"); }

    private boolean SAVE_ALWAYS = false;

    // Accounts data
    private ArrayList<Account> data;

    // Native library option methods
    native private void option_nWritingLogFile();
    native private void option_nSetFilePrfName(String fPrfName);

    // Native library methods
    native private void nInitLibrary();
    native private void nFreeLibrary();

    native private ArrayList<Account> nReadDataFromFile();
    native private void nWriteDataToFile(ArrayList<Account> data);

    // Private methods
    private void save() {
        if (this.SAVE_ALWAYS)
            nWriteDataToFile(this.data);
    }

    // Public constructor
    public AccountsDataManager() {}

    // Initialize the account data manager
    public void init() {
        this.nInitLibrary();
        this.data = this.nReadDataFromFile();
    }

    // Free the account data manager
    public void free() {
        this.nWriteDataToFile(this.data);
        this.nFreeLibrary();
    }

    // Enable writing to the log file
    public void option_writeLogFile() {
        this.option_nWritingLogFile();
    }

    // Enable writing to the profile file always
    // Will be write changes to the file after every
    //      call of the data functions that make changes
    // for ex: add(), remove(), set() and erase()
    // if this option is off, write to the file only
    //      in one moment, when free library with free() func;
    public void option_saveAlways() {
        this.SAVE_ALWAYS = true;
    }

    // Set the profile file name
    public void option_setNameProfileFile(String fName) {
        this.option_nSetFilePrfName(fName);
    }

    // Add the account to the array
    public void add(Account account) {
        if (this.data == null)
            this.data = new ArrayList<>();
        this.data.add(account);
        save();
    }

    // Return the account with the specific array index
    public Account get(int index) {
        if (this.data == null)
            return null;
        return data.get(index);
    }

    // Return the size of accounts
    public int size() {
        return this.data.size();
    }

    // Return the all data
    public ArrayList<Account> getAll() {
        if (this.data == null)
            return null;
        return this.data;
    }

    // Deletes one of the accounts, that is equal
    public void remove(Account account) {
        if (this.data != null)
            this.data.remove(account);
        save();
    }

    // Deletes one of the accounts, that have equal index
    public void remove(int index) {
        if (this.data != null)
            this.data.remove(index);
        save();
    }

    // Erase all data
    // CAUTION: if enabled write_always, delete the all data
    //      and it can't be restored.
    public void erase() {
        if (this.data != null)
            this.data.clear();
        save();
    }

    // Rewrite all stored data if it exist
    public void setData(ArrayList<Account> accounts) {
        this.data = accounts;
        save();
    }
}
