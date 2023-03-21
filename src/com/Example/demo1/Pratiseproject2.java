package com.Example.demo1;

import java.util.Scanner;

public class Pratiseproject2 extends Object {
	
	void checkString()
	{
		String username="Rohit";
		String password="rohit124";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a username");
		String user = sc.next();
		
		System.out.println("Enter a password");
			String pass = sc.next();
		
		if(username.equals(user)&& password.equals(pass))
		{
			System.out.println("You enter correct Credentials");
		}
		else
		{
			System.out.println("You enter incorrect Credentials");
		}
		
		sc.close();
	}
	
	
	public static void main(String[] args) {
		
		Pratiseproject2 ps = new Pratiseproject2();
		ps.checkString();
		
	}
	

}
