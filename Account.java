package bank;

public class Account {
	private int acNumber;
	private String acName;
	private String emailAddress;
	private 	String phoneno;
	private double balance;

Account(int acNumber,
	 String acName,
	 String emailAddress,
	String phoneno,
	double balance){
	this.acNumber=acNumber;
	this.acName=acName;
	this.emailAddress=emailAddress;
	
}
	
		
		
	public int getAcNumber() {
		return acNumber;
	}
	public void setAcNumber(int acNumber) {
		this.acNumber = acNumber;
	}
	public String getAcName() {
		return acName;
	}
	public void setAcName(String acName) {
		this.acName = acName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno){
		this.phoneno=phoneno;
	}
	
		
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
