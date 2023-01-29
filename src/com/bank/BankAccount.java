
package com.bank;
import java.text.SimpleDateFormat;
import java.util.*;
public class BankAccount extends HomeAddress {
	private String firstName, lastName, phoneNumber, email, password, accountNumber, branch, ifscCode, accountType;
	private boolean hasCredit, hasDebit;
	private float balance=0.0f;
	private float minBalance=0.0f;
	private Date date =new Date();
	ArrayList<String>transaction=new ArrayList<String>();
	public ArrayList<String> getTransaction() {
		return transaction;
	}
	public void setTransaction(ArrayList<String> tansaction) {
		this.transaction = tansaction;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getBranch() {
		return branch;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public boolean getHasCredit() {
		return hasCredit;
	}
	public boolean getHasDebit() {
		return hasDebit;
	}
	public float getBalance() {
		return balance;
	}
	public float getMinBalance() {
		return minBalance;
	}
	public Date getDate() {
		return date;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public void setHasCredit(boolean hasCredit) {
		this.hasCredit = hasCredit;
	}
	public void setHasDebit(boolean hasDebit) {
		this.hasDebit = hasDebit;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public void setMinBalance(float minBalance) {
		this.minBalance = minBalance;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void credit(BankAccount account, float value) {
		float finalBalance=account.getBalance()+value;
		account.setBalance(finalBalance);
		//System.out.println(getBalance());
		SimpleDateFormat formatter=new SimpleDateFormat("ddMM yy HH mm ss");
		Date currentDate=new Date();
		String transId="C"+account.getAccountNumber().substring(0, 4)+(formatter.format(currentDate).replace(" ",""));
		transaction.add("Transaction ID: "+transId+" Credited Rs."+value+" CLRBal Rs."+finalBalance+" Date: "+currentDate);
		System.out.println("Your account has been credited Rs."+value+" CLRBal: Rs."+finalBalance+". Transactionn id is "+transId+".\nThank You.\n");
	}
	public void debit(BankAccount account, float value) {
		if(value>account.getBalance()) {
			System.out.println("Invalid amount!");
		}else {
		float finalBalance=account.getBalance()-value;
		account.setBalance(finalBalance);
		SimpleDateFormat formatter=new SimpleDateFormat("ddMM yy HH mm ss");
		Date currentDate=new Date();
		String transId="D"+account.getAccountNumber().substring(0, 4)+(formatter.format(currentDate).replace(" ",""));
		transaction.add("Transaction ID: "+transId+" Debited Rs."+value+" CLRBal Rs."+finalBalance+" Date: "+currentDate);
		System.out.println("Your account has been Debited Rs."+value+" CLRBal: Rs."+finalBalance+". Transactionn id is "+transId+".\nThank You.\n");
		if(account.getAccountType().equalsIgnoreCase("current")){
<<<<<<< HEAD
//			finalBalance=account.getBalance()-50;
//			account.setBalance(finalBalance);
//		    currentDate=new Date();
//			transId="D"+account.getAccountNumber().substring(0, 4)+(formatter.format(currentDate).replace(" ",""));
//			transaction.add("Transaction ID: "+transId+" Debited Rs."+50.0f+" CLRBal Rs."+finalBalance+" Date: "+currentDate);
//			System.out.println("Your account has been Debited Rs."+50.0f+" CLRBal: Rs."+finalBalance+". Transactionn id is "+transId+".\nThank You.\n");
=======
			//finalBalance=account.getBalance()-50;
			/account.setBalance(finalBalance);
		 //   currentDate=new Date();
		//	transId="D"+account.getAccountNumber().substring(0, 4)+(formatter.format(currentDate).replace(" ",""));
			//transaction.add("Transaction ID: "+transId+" Debited Rs."+50.0f+" CLRBal Rs."+finalBalance+" Date: "+currentDate);
			//System.out.println("Your account has been Debited Rs."+50.0f+" CLRBal: Rs."+finalBalance+". Transactionn id is "+transId+".\nThank You.\n");
>>>>>>> 7bfc9bcc4f59437eae5dfa78bfc940aad7c9562c
		}
		if(finalBalance<account.getMinBalance()) {
			if(account.getAccountType().equalsIgnoreCase("saving")){
				finalBalance=account.getBalance()-20;
				account.setBalance(finalBalance);
			    currentDate=new Date();
				transId="D"+account.getAccountNumber().substring(0, 4)+(formatter.format(currentDate).replace(" ",""));
				transaction.add("Transaction ID: "+transId+" Debited Rs."+20.0f+" CLRBal Rs."+finalBalance+" Date: "+currentDate);
				System.out.println("Your account has been Debited Rs."+20.0f+" CLRBal: Rs."+finalBalance+". Transactionn id is "+transId+".\nThank You.\n");
			}else {
				finalBalance=account.getBalance()-20;
				account.setBalance(finalBalance);
			    currentDate=new Date();
				transId="D"+account.getAccountNumber().substring(0, 4)+(formatter.format(currentDate).replace(" ",""));
				transaction.add("Transaction ID: "+transId+" Debited Rs."+20.0f+" CLRBal Rs."+finalBalance+" Date: "+currentDate);
				System.out.println("Your account has been Debited Rs."+20.0f+" CLRBal: Rs."+finalBalance+". Transactionn id is "+transId+".\nThank You.\n");
			}
		}
		}
	}
}
