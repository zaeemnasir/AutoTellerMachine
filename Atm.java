package application;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {

		// Declarations & Initializations
		Account acc1 = new Account();
		Account acc2 = new Account();
		Scanner input = new Scanner(System.in);
		int userKey1 ;


		//Set Values
		//Account #1
		acc1.setId(101);
		acc1.setCustomerName("Muhammad Nasir");
		acc1.setBalance(50);
		acc1.setAnnualInterestRate(5);

		//Account #2
		acc2.setId(102);
		acc2.setCustomerName("Leo DiCaprio");
		acc2.setBalance(1000);
		acc2.setAnnualInterestRate(5);

		//Ask user for Input
		System.out.print("Enter your ID: ");
		userKey1 = input.nextInt();



		//Using While loop if the user enters invalid ID
		while (userKey1 != 101 && userKey1 != 102) {
			System.out.print("Invalid ID. Enter your ID: ");
			userKey1 = input.nextInt();
		}
		if(userKey1==101){
			menu(acc1);
		}else
			menu(acc2);


	}//End of Main Method

	//Method Menu
	public static void menu (Account acc ){
		int userKey2 =0 ;
		Scanner input = new Scanner(System.in);

		while(true){
			System.out.println("\nMain Menu");
			System.out.println("1.  Account Info.");
			System.out.println("2.  Withdraw");
			System.out.println("3.  Deposit");
			System.out.println("4.  Exit");
			//Ask for input
			System.out.print("Please choose what you’d like to do: ");
			userKey2 = input.nextInt();

			//Use switch statements
			switch (userKey2){

			case 1:
				System.out.print(acc.toString());
				break;
			case 2:
				System.out.print("Enter the amount you want to withdraw: ");
				acc.withdraw(input.nextDouble());
				break;
			case 3:
				System.out.print("Enter the Amount you want to Deposit: ");
				acc.deposit(input.nextDouble());
				break;
			case 4:
				System.exit(0);


			default:
				System.out.println("Invalid Key!");

			}
			System.out.println();
		}//End of while loop



	}//End of Menu Method



}//End of ATM Class
