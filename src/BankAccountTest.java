
public class BankAccountTest {
	
	public static void main (String[] args) {
		
		BankAccount user = new BankAccount();
		BankAccount user2 = new BankAccount();
		System.out.println(BankAccount.numBankAccount());
		System.out.println(user.getAccountNumber());
		user2.deposit(500);
		System.out.println(user2.getCheckBalance());
		user2.withdraw(100);
		System.out.println(user2.getCheckBalance());
		user2.deposit(100);
		System.out.println(user2.getSaveBalance());
		user2.displayBalance();
	}

}
