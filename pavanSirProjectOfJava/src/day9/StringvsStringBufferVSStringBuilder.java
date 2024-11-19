package day9;

public class StringvsStringBufferVSStringBuilder {

	public static void main(String[] args) {
		//String inmutable
		/*String s = "welcome";
		s.concat(" to java");
		System.out.println(s);//String does not get change/update without storing in any varible so that string is inmutable.*/

		/*StringBuffer is mutable 
		StringBuffer s = new StringBuffer("welcome");
		s.append(" to java");
		System.out.println(s);*///stringbuilder can change value without storing in variable so it is mutable
		
		
		//StringBuilder is mutable 
		StringBuilder s = new StringBuilder("welcome");
		s.append(" to java");
		System.out.println(s);//stringbuffer can change value without storing in variable so it is mutable
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
