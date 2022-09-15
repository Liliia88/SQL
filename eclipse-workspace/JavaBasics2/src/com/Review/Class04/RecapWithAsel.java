package com.Review.Class04;

public class RecapWithAsel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * windows: ctrl+shift+o
		 * mac: cmd+shift+o
		 */

		        boolean allergy = true;
		        String allergyType = "pollen";

		        if (allergy) {
		            System.out.println("Let's check what allergy you have");

		            if (allergyType.equalsIgnoreCase("Pollen")) {
		                System.out.println("Try to stay indoors when trees are blloming");
		            } else if (allergyType.equals("Peanut")) {
		                System.out.println("Please stay away from peanuts");
		            } else if (allergyType.equals("Dairy")) {
		                System.out.println("Stay away from dairy produtcs");
		            }else {
		                System.out.println("We need to do some test");
		            }

		        } else {
		            System.out.println("You are lucky");
		        }
		 
		}
		﻿
	}

