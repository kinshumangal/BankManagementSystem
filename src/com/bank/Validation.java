package com.bank;

import java.util.*;

public class Validation{
	public static boolean isChar(char c) {
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
			return true;
		}
		return false;
	}
	public static boolean validateAccountNumber(String accountNumber, ArrayList<BankAccount> database) {
		if(accountNumber.length()==13) {
			for(int i=0;i<accountNumber.length();i++) {
				if(accountNumber.charAt(i)>='0'&& accountNumber.charAt(i)<='9') {
					continue;
				}else return false;
			}
			for(int i=0;i<database.size();i++) {
				if(database.get(i).getAccountNumber().equalsIgnoreCase(accountNumber)) {
					return false;
				}
			}
		}else return false;
		return true;
	}
	public static boolean validatePassword(String password) {
		int c1=0,c2=0,c3=0;
		if(password.length()<8) {
			return false;
		}
		for(int i=0;i<password.length();i++) {
			if(password.charAt(i)>='A'&&password.charAt(i)<='Z') {
				c1++;
			}
			else if(password.charAt(i)>='a'&&password.charAt(i)<='z') {
				c2++;
			}else c3++;
		}
		if(c1>=1&&c2>=1&&c3>=1) {
			return true;
		}
		return false;
	}
	public static boolean validateEmail(String email) {
		if((!isChar(email.charAt(0))&&!Character.isDigit(email.charAt(0)))||(!isChar(email.charAt(email.length()-1)))) {
			return false;
		}
		int count = 0;
		boolean flag =false;
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i)=='@') {
				flag=true;
				if(flag&&email.charAt(i)=='.') {
					count++;
				}
			}
		}
		if(count >0) {
			return true;
		}
		return false;
	}
	public static boolean validatePhoneNumber(String phoneNumber) {
		if(phoneNumber.length()<=13 && phoneNumber.length()>=10) {
			for(int i=0;i<phoneNumber.length();i++) {
				if(phoneNumber.charAt(i)>='0'&& phoneNumber.charAt(i)<='9') {
					continue;
				}else return false;
			}
		}else return false;
		return true;
	}
}
