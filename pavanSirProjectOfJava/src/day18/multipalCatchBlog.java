package day18;

public class multipalCatchBlog {

	public static void main(String[] args) {
		
			//syntax error error due error in writing code
			//logical error error due to error in logic
			System.out.println("Programe is started.....");
			int num= 100;
			String link = "welcome";
			String number = null;
			int a [] = {12,12,14};
		
		try 
		{
			//chose any one sentence in try block
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

	}


