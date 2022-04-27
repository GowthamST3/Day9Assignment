package com.Bridgelabz_Day9Assignment;

import java.util.Scanner;

public class AddressBookUC2 {
	 String firstName;
	 String lastName;
	 String address;
	 String city;
	 String state;
	 int zip;
	 String phoneNo;
	 String mail;
    
	 public AddressBookUC2(String firstName,String lastName,String address,String city,
    		                   String state,int zip,String phoneNo,String mail){
    	 this.firstName=firstName;
    	 this.lastName=lastName;
    	 this.address=address;
    	 this.city=city;
    	 this.state=state;
    	 this.zip=zip;
         this.phoneNo=phoneNo;
         this.mail=mail;  
    }
    
	public static void Welcome(){
		System.out.println("Welcome to Address Book Program ");
	}
		
    public void AddressBook(){
    	System.out.println("First name is    : " +firstName);
		System.out.println("Last name is     : " +lastName);
		System.out.println("Address is       : " +address);
		System.out.println("City name is     : " +city);
		System.out.println("State name is    : " +state);
		System.out.println("Zip numbre is    : " +zip);
		System.out.println("Phone Number is  : " +phoneNo);
		System.out.println("Mail ID is       : " +mail);
    }
	

	public static void main(String[] args) {
		
		AddressBookUC2.Welcome();
		
		Scanner scanner=new Scanner(System.in);
 	    
 	    System.out.println("Enter the First name");
 	    String firstName=scanner.next();
 	    System.out.println("Enter the Last name");
 	    String lastName=scanner.next();
 	    System.out.println("Enter the Adress");
 	    String address=scanner.next();
 	    System.out.println("Enter the City name");
 	    String city=scanner.next();
 	    System.out.println("Enter the State name");
 	    String state=scanner.next();
 	    System.out.println("Enter the ZIP ID");
 	    int zip=scanner.nextInt();
 	    System.out.println("Enter the Phone Number");
 	    String phoneNo=scanner.next();
 	    System.out.println("Enter the Mail name");
 	    String mail=scanner.next();
 	    
		AddressBookUC2 addressBookUC2=new AddressBookUC2(firstName, lastName, address, city,
	                                                      state, zip,phoneNo, mail);
 	   
		addressBookUC2.AddressBook();
		
   }
}


