package com.elasticconcept.java.ifswitch;

public class Main {

	public static void main(String[] args) {
		
//		int num = 15;
//		
//		if (num > 10) {
//			System.out.println("The number is greater than 10");
//		
//		} else if (num < 10) {
//			System.out.println("The number is less than 10");
//		
//		} else {
//			System.out.println("The number is 10");
//			System.out.println("The number is 10 even!");
//		}
		
		int num = 10;
		
		switch (num) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("The number is 1, 2, 3 4 or 5");
			break;
		case 10:
			System.out.println("The number is 10");
			break;
		case 15:
			System.out.println("The number is 15");
			break;
		default:
			System.out.println("The number is other");
			break;
		}
	}

}
