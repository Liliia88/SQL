package com.Review.Class04;

public class NestedIfdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	boolean studyHard=true;
		
		if(studyHard) {
			System.out.println("we get the job in first few weeks");
			
			boolean goodCommunicationSkills=true;
			if(goodCommunicationSkills) {
				System.out.println("can might get job in Apple,Amazon,etc");
			}else {
				System.out.println("we need to work on our communication skills");
			}
		}
		else {
			System.out.println("It might take a little longer to get the job");
		}
	}

}
