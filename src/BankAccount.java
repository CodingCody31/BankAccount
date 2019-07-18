import java.util.Random;
import java.util.Scanner;

public class BankAccount {
	private String accountNumber;
	private double checkBalance = 0;
	private double saveBalance = 0;
	private double totalBalance = 0;
	
	private static int numberOfAccounts = 0;
	
	public BankAccount() {
		this.accountNumber = accountNum();
		numberOfAccounts++;
	}
	
	public static int numBankAccount() {
		return numberOfAccounts;
	}
	
	public double totalBalance() {
		return totalBalance = this.checkBalance + this.saveBalance;
	}
	
	
	private String accountNum() {
		String accNum = "";
		for (int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 10);
			accNum += x;
		}
		return accNum;
	}
	
	 public void deposit(double x) {
		Scanner in = new Scanner(System.in);
		System.out.println("Which account would you like to deposit this in? 1 = Checking or 2 = Savings");
		int deposit = in.nextInt();
		while (deposit != 1 || deposit != 2){
			if (deposit == 1) {
			checkBalance += x;
			System.out.println("You deposited $" + x + " into your checking");
			break;
			}
			else if (deposit == 2) {
			saveBalance += x;
			System.out.println("You deposited $" + x + " into your savings");
			break;
			}
			else {
				System.out.println("Which account would you like to deposit this in? 1 = Checking or 2 = Savings");
				deposit = in.nextInt();
				}
			}
		}
	 public void withdraw(double x) {
			Scanner in = new Scanner(System.in);
			System.out.println("Which account would you like to withdraw this from? 1 = Checking or 2 = Savings");
			int withdraw = in.nextInt();
			while (withdraw != 1 || withdraw != 2){
				if (withdraw == 1) {
					if(x>checkBalance) {
						System.out.println("I'm sorry, there are insufficient funds for this request. Please try again");
						break;
					}
				checkBalance -= x;
				System.out.println("You withdrew $" + x + " from your checking");
				break;
				}
				else if (withdraw == 2) {
					if(x>saveBalance) {
						System.out.println("I'm sorry, there are insufficent funds for this request. Please try again");
						break;
					}
				saveBalance -= x;
				System.out.println("You withdrew $" + x + " from your savings");
				break;
				}
				else {
					System.out.println("Which account would you like to withdraw this from? 1 = Checking or 2 = Savings");
					withdraw = in.nextInt();
					}
				}
			}
		
	
	public void displayBalance() {
		System.out.println("Checking: $" + this.checkBalance + "\n" + "Savings: $" + this.saveBalance + "\n" + "Total: $" + totalBalance());
	}
	
	public double getCheckBalance() {
		return checkBalance;
	}
	
	public double getSaveBalance() {
		return saveBalance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	

}
