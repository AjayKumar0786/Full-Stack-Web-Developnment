package ATMMachine;

import java.util.*;


class ATM{
	
	float Balance;
	int PIN = 1234;
	
	public void checkpin() {
		System.out.print("Enter your pin");
		Scanner sc = new Scanner(System.in); 
		int enteredpin = sc.nextInt();
		if(enteredpin == PIN) {
			menu();
		}else {
			System.out.print("Enter a valid pin it is not a valid pin");
			menu();
		}
	}
	
	
	public void menu() {
		
		System.out.println(" Enter your choice ");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdroe");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		
		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();
		
		if(opt ==1) {
			checkBalance();
			
		}else if(opt ==2) {
			WithdrowMoney();
			
		}else if(opt == 3) {
			DepositMoney();
			
		} else if(opt == 4) {
			return;
			
		}else {
			
			System.out.println("Enter a valid choice");
		}
		
	}
	
	public void checkBalance() {
		System.out.println("Balance: "+ Balance);
		menu();
	}
	
	public void WithdrowMoney() {
		System.out.println("Enter amout to withdrow");
		
		Scanner sc = new Scanner(System.in);
		
		float amount  = sc.nextFloat();
		
		if(amount>Balance) {
			System.out.println("Insufficient fund ");
			
		}else {
			Balance = Balance - amount;
			
			System.out.println("Money Withdrow Sucessful");
		}
		
		menu();
	}
	
	public void DepositMoney() {
		System.out.println("Enter the Amount");
		
		Scanner sc = new Scanner (System.in);
		float amount = sc.nextFloat();
		Balance = Balance + amount ;
		
		System.out.println("Money Deposit Sucessful");
		menu();
	}
	
}


public class ATMMachine {

	public static void main(String[] args) {
	
		 ATM obj = new ATM();
		 obj.checkpin();

	}

}
