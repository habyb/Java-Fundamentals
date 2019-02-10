
public class Mian {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount();
		
		b.setNumAccount(54334);
		b.setActive(true);
		
		b.deposit(1000);
		b.withdraw(100);
		b.withdraw(300);
		
		double balance = b.getBalance();
		
		if (balance < 0) {
			System.out.println("Insufficient Funds");
		} else {			
			System.out.println(balance);
		}
	}

}
