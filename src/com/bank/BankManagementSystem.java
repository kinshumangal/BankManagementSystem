package com.bank;
import java.util.*;

public class BankManagementSystem  extends Validation{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<BankAccount> database=new ArrayList<BankAccount>();
		Scanner scan=new Scanner(System.in);
		boolean t=true;
		while(t) {
			System.out.println("1. Enter 1 for Create new Account");
			System.out.println("2. Enter 2 for Display Account Details");
			System.out.println("3. Enter 3 for Debit");
			System.out.println("4. Enter 4 for Credit");
			System.out.println("5. Enter 5 for List All Transaction");
			System.out.println("6. Exit");
			int choice=scan.nextInt();
			switch (choice) {
			case 1:
			{
				scan.nextLine();
				BankAccount newAccount = new BankAccount();
				System.out.println("Enter First Name");
				newAccount.setFirstName(scan.nextLine());
				System.out.println("Enter Last Name");
				newAccount.setLastName(scan.nextLine());
				System.out.println("Enter Phone Number");
				String phoneNum=scan.nextLine();
				while(!validatePhoneNumber(phoneNum)) {
					System.out.println("Invalid Phone Number\nEnter again");
					phoneNum=scan.nextLine();
				}
				newAccount.setPhoneNumber(phoneNum);
				System.out.println("Enter Home Address");
				System.out.println("--------------------------------------------");
				newAccount.setAddress();
				System.out.println("Enter Email ID");
				newAccount.setEmail(scan.next());
				System.out.println("Enter Password \nPassword should have at least 1 uppercase, 1 lowercase, 1 special character, atleast 8 character long.");
				String password=scan.next();
				while(!validatePassword(password)) {
					System.out.println("Invalid Password\nEnter again");
					password=scan.next();
				}
				newAccount.setPassword(password);
				System.out.println("Enter Account Number");
				String accountNumber=scan.next();
				while(!validateAccountNumber(accountNumber ,database)) {
					System.out.println("Invalid Account Number \nPlease Enter again");
					accountNumber=scan.next();
				}
				newAccount.setAccountNumber(accountNumber);
				System.out.println("Enter Branch");
				newAccount.setBranch(scan.next());
				System.out.println("Enter account type (Saving/Current)");
				newAccount.setAccountType(scan.next());
				System.out.println("Enter IFSC Code");
				newAccount.setIfscCode(scan.next());
				System.out.println("Enter minimum balance");
				newAccount.setMinBalance(scan.nextFloat());
				System.out.println("Has Debit Card? \nEnter true or false");
				newAccount.setHasDebit(scan.nextBoolean());
				System.out.println("Has Credit Card? \nEnter true or false");
				newAccount.setHasCredit(scan.nextBoolean());
				database.add(newAccount);
				System.out.println();
			}
			break;
			case 2:
			{
				System.out.println("Enter Account number");
				scan.nextLine();
				String accountNumber=scan.nextLine();
				System.out.println("Enter Account Type");
				String accountType = scan.nextLine();
				int k=0;
				for( k=0;k<database.size();k++) {
					if(database.get(k).getAccountNumber().equalsIgnoreCase(accountNumber) && database.get(k).getAccountType().equalsIgnoreCase(accountType)) {
						System.out.println("==========================================================");
						System.out.println("First Name - "+database.get(k).getFirstName());
						System.out.println("Last Name - "+database.get(k).getLastName());
						System.out.println("Phone Number - "+database.get(k).getPhoneNumber());
						System.out.println("Address - "+database.get(k).getHomeAddress());
						System.out.println("Email ID - "+database.get(k).getEmail());
						System.out.println("Account Number - "+database.get(k).getAccountNumber());
						System.out.println("Account Type - "+database.get(k).getAccountType());
						System.out.println("Branch - "+database.get(k).getBranch());
						System.out.println("IFSC Code - "+database.get(k).getIfscCode());
						System.out.println("Date of opening - "+database.get(k).getDate());
						System.out.println("Has credit card?   "+database.get(k).getHasCredit());
						System.out.println("Has debit card?   "+database.get(k).getHasDebit());
						System.out.println("Balance -  "+database.get(k).getBalance());
						System.out.println("Minimum balance -  "+database.get(k).getMinBalance());
						System.out.println("Account type(Savings or Current)");
						System.out.println("Total transaction done - "+database.get(k).getTransaction().size());
						System.out.println("==========================================================");
						System.out.println();
					}
				}
				if(k>database.size()) {
					System.out.println("This Account is not present in this bank");
					System.out.println();
				}
			}
			break;
			case 3:
			{
				System.out.println("Enter Account Number");
				String accountNumber=scan.next();
				System.out.println("Enter Account Type");
				String accountType = scan.next();
				int k=0;
				for(k=0;k<database.size();k++) {
					if(database.get(k).getAccountNumber().equalsIgnoreCase(accountNumber) && database.get(k).getAccountType().equalsIgnoreCase(accountType)) {
						System.out.println("Enter Amount");
						float value =scan.nextFloat();
						database.get(k).debit(database.get(k), value);
					}
				}
				if(k>database.size()) {
					System.out.println("This Account is not present in this bank");
					System.out.println();
				}
			}
			break;
			case 4:
			{
				System.out.println("Enter Account Number");
				String accountNumber=scan.next();
				System.out.println("Enter Account Type");
				String accountType = scan.next();
				int k=0;
				for(k=0;k<database.size();k++) {
					if(database.get(k).getAccountNumber().equalsIgnoreCase(accountNumber) && database.get(k).getAccountType().equalsIgnoreCase(accountType)) {
						System.out.println("Enter Amount");
						float value =scan.nextFloat();
						database.get(k).credit(database.get(k), value);
					}
				}
				if(k>database.size()) {
					System.out.println("This Account is not present in this bank");
					System.out.println();
				}
			}
			break;
			case 5:
			{
				System.out.println("Enter account Number");
				String accountNumber = scan.next();
				System.out.println("Enter account type");
				String accountType=scan.next();
				int k=0;
				for(k=0;k<database.size();k++) {
					if(database.get(k).getAccountNumber().equalsIgnoreCase(accountNumber) && database.get(k).getAccountType().equalsIgnoreCase(accountType)) {
						BankAccount account=database.get(k);
						for(int g=0;g<account.getTransaction().size();g++) {
							System.out.println(g+1+". "+ account.getTransaction().get(g));
						}
						System.out.println();
					}
				}
				if(k>database.size()) {
					System.out.println("This Account is not present in this bank");
					System.out.println();
				}
			}
			break;
			case 6:
				t=false;
				break; 
			default:
				System.out.println("!!! INVALID INPUT !!!");
			}
			
		}

	}

}
