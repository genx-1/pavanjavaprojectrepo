package day6;

import java.util.Scanner;

public class TakeMultipalDetaFromScannerOrKeyboard {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		/*System.out.println("enter first number");
		int num1 = s.nextInt();
		System.out.println("Enter second number");
		int num2 = s.nextInt();
		System.out.println("Addition of two number is: "+(num1+num2));*/
		
		
		System.out.println("enter first name");
		String name = s.next();
		System.out.println("Your name is "+name);
		System.out.println("enter first age");
		int age = s.nextInt();
		System.out.println("Your age is "+age);
		
		System.out.println("enter first mobile number");
		int mobile_number = s.nextInt();
		System.out.println("your mobile number is "+mobile_number);
		
	
		
	}

}
