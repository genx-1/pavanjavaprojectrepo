package day9;

public class ReverseString {

	public static void main(String[] args) {
		//Approach1
		/*String rev = "";
		String s = "india";
		System.out.println(s.length());//for length we measure from 1
		System.out.println(s.charAt(1));//we measure char form "0"
		
		for (int i=s.length()-1; i>=0; i--) {
			 rev = rev + s.charAt(i);
		}
		System.out.print("Reverse of given string is: "+ rev);*/
		 
	/*	/*Approach 2
		String rev = "";
		String s = "komal";
		char a [] = s.toCharArray();
		for (int i=a.length-1; i>=0; i--) {
			rev = rev+(a[i]);
		}
		System.out.println("reverse of given string: "+rev);*/
		
		//Approach 3
		/*StringBuilder sb = new StringBuilder("komal");
		System.out.println("reverse string of given string : "+sb.reverse());*/
		
		
		
		
		
	/*	//Approach 4
		StringBuffer sb = new StringBuffer("komal");
		System.out.println("reverse string of given string : "+sb.reverse());*/
		
		StringBuffer sb = new StringBuffer("prakash");
		StringBuffer rev = sb.reverse();
		System.out.println(rev);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
