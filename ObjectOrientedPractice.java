import java.util.Scanner;
//import package.Account;
public class Lab6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String username, accountNumber;
		double balance;
		System.out.println("Please Enter Username:");
		username = scan.next();
		System.out.println("Please Enter Account Number:");
		accountNumber = scan.next();
		System.out.println("Please Enter Initial Account Balance ");
		balance = scan.nextDouble();
		
		
		final int DISPLAY_BALANCE = 0;
		final int MODIFY_NAME = 1;
		final int DEPOSIT = 2;
		final int WITHDRAW = 3;
		final int QUIT = 4;
		Scanner input = new Scanner(System.in);
		Account account = new Account(username, accountNumber, balance);
		
		
		
		int choice = 0;
		do {
			System.out.println("This Program Does The Following:");
			System.out.println("Press 0 to Display User Accout Information.");
			System.out.println("Press 1 to Modify User Name.");
			System.out.println("Press 2 to Make a Deoposit.");
			System.out.println("Press 3 to Make a Withdrawal.");
			System.out.println("Press 4 to Quit.");
		choice = scan.nextInt();
		switch(choice)
		{
			case 0:
				System.out.println("User Account Information is : ");
				System.out.println("Name is :"+ username);
				System.out.println("Account number is :"+ accountNumber);
				System.out.println("Balance is: "+ balance);
				break;
			case 1:
				System.out.println("Please enter new Name : ");
				String newName = scan.next();
				account.changeName(newName);
				System.out.print("Name is :");
				System.out.println(account.username);
				System.out.println("Account number is :"+ accountNumber);
				System.out.println("Balance is: "+ balance);
				break;
			case 2:
				System.out.println("Please enter Deposit Amount");
				double x_money = scan.nextDouble();
				account.depositMoney(x_money);
				System.out.println("Name is :"+ username);
				System.out.println("Account number is :"+ accountNumber);
				System.out.print("Balance is: ");
				System.out.println(account.curBalance);
				break;
			case 3:
				System.out.println("Please enter Withdrawal Amount");
				double money = scan.nextDouble();
				account.withdrawMoney(money);
				System.out.println("Name is :"+ username);
				System.out.println("Account number is :"+ accountNumber);
				System.out.print("Balance is: ");
				System.out.println(account.curBalance);
				break;
			case 4:
				System.out.println("Thank You. Have a nice day!");
				break;
			default:
				System.out.println("Please enter a valid Option");
				break;
		}
		}while(choice != 4);
	}
}
