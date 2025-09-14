package DAO;

public interface AdminDao {
    boolean login(String username, String password);

    void viewAllAccounts();

    void searchAccount(String accountNo);

    void viewAllTransactions();


    void deleteAccount(String accountNo);
}
