package com.bank;
import java.util.*;
public class HomeAddress {
	Scanner scan=new Scanner(System.in);
	private String doorNumber, street, locality, area, landMark, taluk, district, state, address, pinCode;
	private String homeAddress;
	public Scanner getScan() {
		return scan;
	}
	public void setHomeAddress() {
		this.homeAddress = setAddress();
	}
	public String getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}
	public String getDoorNumber() {
		return doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public String getLocality() {
		return locality;
	}

	public String getArea() {
		return area;
	}

	public String getLandMark() {
		return landMark;
	}

	public String getTaluk() {
		return taluk;
	}

	public String getDistrict() {
		return district;
	}

	public String getState() {
		return state;
	}

	public String getAddress() {
		return address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public String setAddress() {
		System.out.println("Enter Door Number");
		this.doorNumber=scan.nextLine();
		System.out.println("Enter Street name");
		this.street=scan.nextLine();
		System.out.println("Enter locality");
		this.locality=scan.nextLine();
		System.out.println("Enter Area");
		this.area=scan.nextLine();
		System.out.println("Enter Landmark");
		this.landMark=scan.nextLine();
		System.out.println("Enter Taluk");
		this.taluk=scan.nextLine();
		System.out.println("Enter District");
		this.district=scan.nextLine();
		System.out.println("Enter state");
		this.state=scan.nextLine();
		System.out.println("Enter Pin Code");
		this.pinCode=scan.nextLine();
		this.homeAddress=this.doorNumber+", "+this.street+"\n"+this.locality+"\n"+this.area+"\n"
		+this.landMark+"\n"+this.taluk+"\n"+this.district+"\n"+this.state+"\n"+this.pinCode;
		return address;
	}
	
}
