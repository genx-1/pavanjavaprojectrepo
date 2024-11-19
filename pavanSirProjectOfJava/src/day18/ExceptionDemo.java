package day18;

public class ExceptionDemo {

	public static void main(String[] args) {
		//syntax error error due error in writing code
		//logical error error due to error in logic
		System.out.println("Programe is started.....");
		int num1= 100;
		String link = "welcome";
		String number = null;
		int a [] = {12,12,14};
	/*	// approach 1
	try 
	{
		System.out.println(num/0);
		System.out.println(Integer.parseInt(link));
		System.out.println(number.length());
		System.out.println(a[3]);
	}
	
	
	catch (ArithmeticException b) {
		System.out.println("invalid data1");
	}
	catch (NumberFormatException c) {
		System.out.println("invalid data2");
	}
			
	catch (NullPointerException n) {
		System.out.println("invalid data3");
	}	
		
	catch (ArrayIndexOutOfBoundsException n) {
		System.out.println("invalid data3");
	}	
		
		System.out.println("Programe is complted....");
		System.out.println("Programe is exited....");

	}
/*
 //we can not write multipal try block
  * if we write multipal invali sentence in try block it then it handle only first sentence
 //we can write multipal catch block
  * 
 */
		//Approach 2
		System.out.println("Programe is started.....");
		//int num1= 100;
		try 
		{
			//System.out.println(num/0);
			//System.out.println(Integer.parseInt(link));
			//System.out.println(number.length());
			System.out.println(a[3]);
		}
		//actually exception handled by "Exception" class which present in catch block
		//if we get confusion exactly which line of code have problem then we can write multiple sentence in try block
		//we can handle any type of exception by using "Exception" because Exception is a main class of all type 
		// exception like ArithmeticException, NullPointerException,ArrayIndexOutOfBoundsException, 
		catch (Exception e) {
			System.out.println("invalid data1");
		}
		finally 
		{
			System.out.println("You entered finally block");
		}
		
	}}		
		
		
		
		
		
		
		
		
		
		
		

