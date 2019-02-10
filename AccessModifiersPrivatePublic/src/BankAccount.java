
public class BankAccount {

	private int numAccount;
	private boolean active;
	private double balance;
	
	public void withdraw(double value) {
		if (value < 0) {
			return;
		}
		
		balance -= value;
	}
	
	public void deposit(double value) {
		if (value < 0) {
			return;
		}
		
		balance += value;
	}

	public int getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(int numAccount) {
		if (numAccount > 0) {
			this.numAccount = numAccount;
		}
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getBalance() {
		return balance;
	}
}
