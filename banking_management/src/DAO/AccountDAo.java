package DAO;

import POJO.Account;

public interface AccountDAo {
	
	boolean createAccount(Account account);
    Account getAccountByNumber(String accountNumber);
    double getBalance(String accountNumber,int pin);
    boolean deposit(String accountno,int pin, double amount);
    boolean withdraw(String accountno, int pin,double amount);
    boolean sendmoney(String accountno,int pin,String accountno2,double amount);

}
