package bank.app;

public class Account {
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account (String ano, String owner, int balance) {
		
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getano() {
			return ano;
	}

	public String getowner() {
	
		return owner;
	}

	public int getbalance() {
	
		return balance;
	}

	public void setbalance(int balance) {
		this.balance = balance;
		
		
	}
	
	
	
}
