package com.bridgelabz.day22;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookUC1 {
	String first_name,last_name,city,state,ph_number,zip,email;

	public AddressBookUC1(String first_name, String last_name, String city, 
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

		AddressBookUC1 book = new AddressBookUC1(first_name, last_name, city,
				state, ph_number, zip,email);

		ArrayList<AddressBookUC1> alist = new ArrayList<AddressBookUC1>();
		alist.add(book);
		System.out.println(alist);
	}
}


