package MiniProjects.ATM;
//ZEYNEP TANRIVERMİŞ
//01.02.2024

//  this class controls the account movements  
public class Account{
	
	private String name;
	private String password;
	private int balance;
	
	//  constructor
	public Account(String name, String password, int balance) {
		this.name = name;
		this.password = password;
		this.balance = balance;
	}
	
	//  getter and setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	//  method for deposit
	public void deposit(int amount) {
		balance += amount;
		System.out.println("New Balance: " + balance);
	}
	
	//  method for withdraw
	public void withdraw(int amount) {
		if(balance<amount) {
			System.out.println("There is not enough balance");
			System.out.println("Balance: " + balance);

		}
		else {
			balance -= amount;
			System.out.println("New Balance: " + balance);

		}
	}
}
