package day9;

public class palindromString {

	public static void main(String[] args) {
		//Approach1
				String rev = "";
				String s = "madam";
				//System.out.println(s.length());
				//System.out.println(s.charAt(1));
				
				for (int i=s.length()-1; i>=0; i--) {
					 rev = rev + s.charAt(i);
				}
				if(s.equals(rev)) {
					System.out.println("String is palindrom");
				}
				else {
					System.out.println("String is not palindrom");
				}
				//System.out.print("Reverse of given string is: "+ rev);
				

	}

}
