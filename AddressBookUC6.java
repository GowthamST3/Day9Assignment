package com.Bridgelabz_Day9Assignment;
   import java.util.ArrayList;
	import java.util.Scanner;

	public class AddressBookUC6 {
		String first_name,last_name,city,state,ph_number,zip,email;

		public AddressBookUC6(String first_name, String last_name, String city, 
				              String state, String ph_number, String zip,String email) 
		{
			this.first_name = first_name;
			this.last_name  = last_name;
			this.city       = city;
			this.state      = state;
			this.ph_number  = ph_number;
			this.zip        = zip;
			this.email      = email;
		}
		
		@Override
		public String toString() {
			return "First_name = " + first_name + ", Last_name = " + last_name + ", City = " + city + ", "
				   + "State = " + state + ", Phone number = " + ph_number + ", Zip = " + zip + ", Email = " + email;
		}
		
		public void editAddr(){
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Name to edit  :");
			String name = sc.next();
			
			if(name.equals(first_name))
			{
				System.out.println("Enter First Name:");
				first_name = sc.next();
				System.out.println("Enter Last Name:");
				last_name=sc.next();
				System.out.println("Enter City : ");
				city = sc.next();
				System.out.println("Enter State: ");
				state = sc.next();
				System.out.println("Enter Phone Number: ");
				ph_number = sc.next();
				System.out.println("Enter Zip: ");
				zip = sc.next();
				System.out.println("Enter Email: ");
				email = sc.next();
				AddressBookUC6 A = new AddressBookUC6(first_name, last_name, city,
	                    state, ph_number, zip,email);

	            ArrayList<AddressBookUC6> alist1 = new ArrayList<AddressBookUC6>();
	            alist1.add(A);
	            System.out.println(alist1);
	            
	            ///Delete logic
	    			Scanner sc1 = new Scanner(System.in);
	    			System.out.println("Enter Name to Delete :");
	    			String dtName = sc1.next();
	    			if(dtName.equals(first_name))
	    			{
	    				alist1.clear();
	    				
	    				System.out.println("Successfully deleted..." + alist1);
	    	     	}
	    	       else
	    		    {
	    			   System.out.println("Entered name is not present in Array to delete....");
	    		    }	
			}
			else
		    {
			   System.out.println("Entered name is not present in Array to edit....");
		    }
			}
		
	        public static void main(String[] args)
	        {
	        	
	        System.out.println("Welcome to AddressBook Computation Program");
	        
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter First Name  :");
			String first_name = sc.next();
			System.out.println("Enter Last Name   :");
			String last_name = sc.next();
			System.out.println("Enter City        : ");
			String city = sc.next();
			System.out.println("Enter State       : ");
			String state = sc.next();
			System.out.println("Enter Phone Number: ");
			String ph_number = sc.next();
			System.out.println("Enter Zip         : ");
			String zip = sc.next();
			System.out.println("Enter Email       : ");
			String email = sc.next();

			AddressBookUC6 A = new AddressBookUC6(first_name, last_name, city,
					                                 state, ph_number, zip,email);
			
			ArrayList<AddressBookUC6> alist = new ArrayList<AddressBookUC6>();
			alist.add(A);
	     	System.out.println(alist);
	     	
	     	A.editAddr();
	     	
	}
}



