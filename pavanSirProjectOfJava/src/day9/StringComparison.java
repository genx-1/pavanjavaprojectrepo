package day9;

public class StringComparison {

	public static void main(String[] args) {
	/*String s1 = "welcome";
	String s2 = "welcome";
	//case 1
	System.out.println(s1==s2);//true
	System.out.println(s1.equals(s2));//true*/
	
	/*case2
	String s1 = new String ("welcome");
	String s2 = new String ("welcome");
	System.out.println(s1==s2);//false because it compaire object and when we use new we create another object so now both 
	//object are different so it gives false
	System.out.println(s1.equals(s2)); //true because it compaire value of object and when we use new we create another object but value of another object is "welcome"so now both 
	//object are different but values are same  so it gives true*/
	
	/*case 3
	String s1 = "abc";
	String s2 = new String("abc");
	System.out.println(s1==s2);//false
	System.out.println(s1.equals(s2));//true*/
	
	
	//case 4 
		String s1 = "abc";
		String s2 = new String("abc");
		String s3=s2;
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
	  System.out.println(s2==s3);//true
	System.out.println(s2.equals(s3));//true
	System.out.println(s1.equals(s3));//true
	
	
	
	
	
	

	}

}
