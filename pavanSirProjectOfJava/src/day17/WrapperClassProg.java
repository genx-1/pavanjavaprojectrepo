package day17;

public class WrapperClassProg {
	public static void main(String[] args) {
	//int, double, byte , short, char, float, char, long => String
	//String => int, double, byte , short, char, float, char, long
	String a=  "12";
	String b = "14";
	//System.out.println(a+b);
	System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
	String c=  "12.50";
	String d = "14.50";
	//System.out.println(c+d);
	System.out.println(Double.parseDouble(c)+Double.parseDouble(d));
	
     //can not convert car to string because char contain one char 
	//and string multiple char it is not possible to convert one char to multiple
	//char  f = '15.50';
	
	//string to float
	String bool = "true";
	System.out.println(Boolean.parseBoolean(bool));
	String bool1 = "welcome";
	System.out.println(Boolean.parseBoolean(bool1));
	
	//Too convert int, double, byte , short, char, float, char, long => String
	int l= 14;
	int l1 =15;
	System.out.println(l+l1);
	double m= 10.5;
	char n = 'g';
	boolean o = true;
	
	String num1 = String.valueOf(l);
	System.out.println(num1);
	
	String num2 = String.valueOf(l1);
	System.out.println(num2);
	
	System.out.println(num1+num2);
	
	String num11 = String.valueOf(m);
	System.out.println(num11);
	
	String status = String.valueOf(o);
	System.out.println(status);
	
	String gender = String.valueOf(n);
	System.out.println(gender);
	
	// only primitive detatype have wrper class . Wrapper class used to convert primitive deta into String Type deta
/*premitive    wrapper
detatype       class
int  =         Integer;
boolean =      Boolelan
double =       Double
float =        Float
long =         Long
short =        Short*/

	// we use wrpper class for collection
//	ArryList arr = new ArrayList(); it can save hetrogeneous deta like int, object , char, string
//	ArryList <Integer> arr = new ArrayList <Integer> (); it can save only integer type deta 
//	ArryList <Integer> arr = new ArrayList <Integer> (); it is not valid primitive datatype not used instead of that we use wrapper class
	
	
	
	//packages 1)build in package util (java.util.Arrays)package
	//user defind package
	//if we want to run metod of one package into another e have to import that package.
	
	
	//subpackages
	
	
	
	
	
	
	
	
	
	}

}
