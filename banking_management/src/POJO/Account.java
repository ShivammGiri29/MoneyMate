package POJO;

public class Account {
	
	private int accountId;
    private int customerId;
    private String accountType;
    private double balance;
    private String accountNumber;
    private int pinNo;
    public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int customerId, String accountType, double balance, String accountNumber, int pinNo) {
		super();
		this.customerId = customerId;
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.pinNo = pinNo;
	}
		

	public Account(int customerId, String accountType, double balance, String accountNumber) {
		super();
		this.customerId = customerId;
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Account(String accountType, double balance, String accountNumber) {
		super();
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public Account(int accountId, int customerId, String accountType, double balance, String accountNumber) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.accountType = accountType;
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getPinNo() {
		return pinNo;
	}
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", customerId=" + customerId + ", accountType=" + accountType
				+ ", balance=" + balance + ", accountNumber=" + accountNumber + ", pinNo=" + pinNo + "]";
	}
    
	
//
//	
	
}
