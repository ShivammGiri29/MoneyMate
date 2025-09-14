package DAO;

import java.util.List;

import POJO.Transaction;

public interface TransactionDao {
	void recordTransaction(String accountno, String type, double amount);
    List<Transaction> getTransactions(String accountno);

}
