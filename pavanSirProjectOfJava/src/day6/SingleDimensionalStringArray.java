package day6;

public class SingleDimensionalStringArray {

	public static void main(String[] args) {
	String s [] = new String [10];
	s[0]="komal";
	s[1]="shital";
	s[2]="komal";
	s[3]="snehal";
	s[4]="omkar";
	s[5]="payal";
	s[6]="Pradnya";
	s[7]="bhakti";
	s[8]="yogesh";
	s[9]="vitthal";
	//System.out.println(s.length);
  //  System.out.println(s[4]);
	System.out.print("Elements of array :->  {");
	/*for (int i =1; i<s.length; i++) {
		System.out.print(s[i]+",  ");
	}
	System.out.print("}");
	*/

	for (String x:s)
	{
		System.out.print(x+",  ");
	}
	System.out.println();
	//*******************************************************************************************
	//Approach Second
	String q []= {"komal","kiran","pratik","ravi","Raj","prakash","anmol","sunil","komal","furquan", "dharmishta"};
	System.out.print("String present in string type array ;->  ");
			for(String r:q) {
				System.out.print(r+", ");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}}
