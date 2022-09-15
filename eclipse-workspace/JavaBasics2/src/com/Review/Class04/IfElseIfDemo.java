package com.Review.Class04;

public class IfElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * if we need one outcome based on if conditions we use
		 * if if the outcomes are two we use if else if outcomes are more than that we can
		 * use if else if
		 * whenever you have to check more than 2 conditions always use if else if conditions
		 * 
		 */
		int number=12;
		if(number>0) {
		System.out.println("number is positive");	
		}
		if (number<0) {
			System.out.println("number is negative");	
		}
		if (number==0) {
			System.out.println("number is 0");	
		}
		
		if(number>0) {
			System.out.println("number is positive");	
			}
		else if (number<0) {
				System.out.println("number is negative");	
			}
		else  {
				System.out.println("number is 0");	
			}
		
	}

}
