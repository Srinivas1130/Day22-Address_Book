package com.bridgelabz.day22;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC4 {
	String first_name;
	String last_name;
	String city;
	String state;
	String ph_number;
	String zip;
	String email;
	String Add    = "A";
	String Edit   = "E";
	String Delete = "D";	

	public AddressBookUC4(String first_name, String last_name, String city, 
			String state, String ph_number, String zip,String email){

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
		return "\n First_name = " +  first_name + "\n Last_name  = " + last_name + 
				"\n City       = " + city        + "\n State      = " +  state + 
				"\n Ph number  = " + ph_number   + "\n Zip        = " + zip + 
				"\n Email      = " + email;
	}

	public int get(int num) {

		return num;
	}
	static ArrayList<AddressBookUC4> alist = new ArrayList<AddressBookUC4>();

	public static void deleteAddr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to Delete..  :");
		String name = sc.next();

		if(name.equals("Srinivas")){

			System.out.println("Enter Index NO.......... : ");
			int num = sc.nextInt(); 

			alist.remove(num);
		}
		else{
			System.out.println("Entered name is not present in Array to delete....");
		} 
	}

	public static void editAddr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to edit  :");
		String name = sc.next();

		if(name.equals("Raju"))
		{
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

			System.out.println("Enter Index NO.......... : ");
			int num = sc.nextInt(); 

			alist.set(num, new AddressBookUC4(first_name, last_name, city,
					state, ph_number, zip, email));

		}
		else{
			System.out.println("Entered name is not present in Array to edit....");
		}  
	} 

	public static void addAddr(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name to check  :");
		String name = sc.next();

		if(name.equals("Raju")){
			System.out.println("Entered name is already present in Array....");
		}
		else{
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

			AddressBookUC4 addressBook = new AddressBookUC4(first_name, last_name, city,
					state, ph_number, zip,email);

			alist.add(addressBook);	
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Welcome to AddressBook Computation Program");

		AddressBookUC4 A =new AddressBookUC4("Raju    ", "D V", "HSD", "KA",
				"577527","8888888890", "raj@gmail.com    ");
		AddressBookUC4 B =new AddressBookUC4("Srinivas", "D  ", "BLR", "KA",
				"520101","8317335902", "srini@gmail.com  ");
		AddressBookUC4 C =new AddressBookUC4("Goutham ", "S T", "HSN", "KA",
				"527201","8643685678", "goutham@gmail.com");

		alist.add(A);
		alist.add(B);
		alist.add(C);

		System.out.println("Few Address details Added initially..");
		for(AddressBookUC4 Addr: alist){
			System.out.println(Addr);	
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Charecter. A --> Add, E --> Edit, D --> Delete :");
		String Ch = sc.next();
		switch(Ch)
		{
		case "A":
			addAddr();
			System.out.println("Total Address Details added..      " + alist);
			break;
		case "E":
			editAddr();
			System.out.println("After Editing Address Details..    " + alist);
			break;
		case "D":
			deleteAddr();
			System.out.println("After Deleting Address Details..   " + alist);
			break;
		default:
			System.out.println("Thank you for using Address Book");
		}
	}
}


