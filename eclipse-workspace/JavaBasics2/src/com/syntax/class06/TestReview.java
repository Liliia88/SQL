package com.syntax.class06;

public class TestReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double discount;
		char code='C';
		
		switch (code) {
			
			case 'A':
				discount=0.0;
			case 'B':
				discount=0.1;
			case 'C':
				discount=0.0;
			default:
				discount=0.3;
		}
		System.out.println(discount);
	}

}
