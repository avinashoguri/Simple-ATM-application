package bank;

import java.util.Scanner;



public class Atm {

	public static void process1(BankAccount ac){
		
		System.out.println("---------------------------");
		
		System.out.println("Your balance is : "+ac.getBalance());
       
		System.out.println("---------------------------");
	}
	public static void process2(BankAccount ac){
		
		System.out.println("--------------------------");
		double money=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Amount: ");
		money = input.nextDouble();
		
		ac.depositFunds(money);
		System.out.println(money+" deposited succesfully");
		System.out.println("Updated Balance is :"+ac.getBalance());
		System.out.println("--------------------------");
		
	}
	public static void process3(BankAccount ac){
		System.out.println("-------------------------");
		double money=0;
		Scanner input=new Scanner(System.in);
		System.out.print("enter amount:");
		money=input.nextDouble();
		if(ac.withdrawFunds(money))		
			System.out.println(money+" withdrawan succsusfully");
		else
			System.out.println("Insufficient funds..");
		
		System.out.println("Remaining Balance is :"+ac.getBalance());
		
		System.out.println("-------------------------");
		
	}
	public static void process4(BankAccount ac){
		
		System.out.println("-------------------------");
		
		double money=0;
		String  mobileNumber="";
		//int length=mobileNumber.length();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter mobile number:");
		
//		for(int i=0;i<length;i++){
		
		
		do{
			mobileNumber=input.nextLine();
			if(mobileNumber.length()!=10)
			System.out.println(" enter correct mobile number : ");
		}while(mobileNumber.length()!=10);
		
		 
		
		if(mobileNumber.length()==10){
		System.out.print("Enter ammount to recharge :");
		}
		
		
		money=input.nextDouble();
		
		if(ac.withdrawFunds(money)){		
			System.out.println("Recharge succsusfully done to "+mobileNumber+" with "+money);
		}
		else{
			System.out.println("Insuficient Funds in your account to proceed.");
		}
			
		System.out.println("-------------------------");
	}
	public static void main(String[] s){
		
		
		
		BankAccount account1;
		BankAccount account2;
	account2 = new BankAccount("8686431347", "avinash","Oguri", "avinashoguris@gmail.com");
		account1 = new BankAccount("9010828483","Suchen","Oguri","suchen.oguri@gmail.com");
		int choice=0;
		System.out.println("*******  WELCOME TO ATM **********\n");
		System.out.println(" 			A/C holder name :Mr AVINASH OGURI ");
		System.out.println("			  A/C No.: 00020258659607");
		
		do{
			
			System.out.println("1.View balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.withdraw money");
			System.out.println("4. mobile recharge");
			System.out.println("5.exit");
			System.out.print("\nplease enter your choice: ");
			Scanner input=new Scanner(System.in);
			
			choice=input.nextInt();
			//input.close();
			
			
			switch(choice){
				case 1:process1(account1);break;
				case 2:process2(account1); break;
				case 3:process3(account1);break;
				case 4:process4(account1);break;
				case 5:break;
				default :System.out.println("plz enter correct choice");
			}			
			
		}while(choice!=5);
		System.out.println("\n********** THANK YOU ************");
		
	}
		
}
