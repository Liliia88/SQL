package com.Review.Class04;

public class IfElseIfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Nested if-conditions are conditions which are dependent on each other 
		 * if outer condition not true
		 * inner-condition is never checked inner-condition is only checked when
		 *  outer-condition is passed
		 * 
		 * 
		 */
		int money=12;
		if(money>10) { //outer conditions
			System.out.println("Let's buy some eggs");
			int noOfEggs=2;
			if (noOfEggs>0) {
				System.out.println("Let's boil the eggs");
			}
			
			
			
		}
		
		
		
		
	}

}
