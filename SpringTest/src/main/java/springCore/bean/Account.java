package springCore.bean;

public class Account {
	private String accNo;
	private String accName;
	private String accType;
	private long balance;

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accNo, String accName, String accType, long balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accType=" + accType + ", balance=" + balance
				+ "]";
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
}
