package bank;

public class BankAccount {
	private String accountNumber;
	
	 private String firstName;
	private String lastName;
	private String name=lastName+firstName;
	private String email;
	private double balance;
	private String phNo=accountNumber;
	
	public BankAccount(String accountNumber,String firstName, String lastName,String email) {
		this.accountNumber = accountNumber;		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phNo=accountNumber;
		this.name=lastName+firstName;
	}

	 public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getName1(){
		return name;
		
	}
	public double getBalance() {
		return balance;		
	}
	
	public void depositFunds(double money){
		balance = balance + money;
	}
	
	public boolean withdrawFunds(double money){
		if(balance>=money){
			balance = balance - money;
			return true;
		}
		else
			return false;		
	}

	public String getName(){
		return firstName+" "+lastName;
	}
}
















