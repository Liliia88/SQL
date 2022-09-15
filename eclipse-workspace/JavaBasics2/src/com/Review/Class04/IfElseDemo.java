package com.Review.Class04;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName="Admin";
		/*
		 * when we have to check if a box contains a value or not
		 * we can use == or .equals()
		 * when the data type of primitive we use == like char int short,etc.
		 * when the datatypes are non-primitive like String we use .equals()
		 */
		String password="password123";
		if(password.equals("password123"))
		{
			System.out.println("Welcome "+userName);
		}else {
			System.out.println("Wrong password"+userName);
		}
	}

}
