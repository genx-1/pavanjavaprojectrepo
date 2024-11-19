package dat7;

public class StringClass {

	public static void main(String[] args) {
		     String s1 = "_!@#$%^&*()_+=-0987654321<>?/.,:'{}][";
				String s2 = "darphal";
				String s3 = "Osmanabad";
				 
				//find length of string while giving length of string it consider alhabet uppercase, lowercase, 
				// special character ,underscore, spaces,
				System.out.println(s1.length());
				System.out.println(s2.length());
				System.out.println(s3.length());
				
				String s4 = "   komal    ";//12
				System.out.println(s4);
				System.out.println(s4.length());//
				String s5 = s4.trim();
				
				System.out.println(s5.length());//5
				// in equal method consider spaces
				System.out.println("   komal    ".equals(s4));//false
				
				//we can use concat method multipal times to connect string. 
				System.out.println(s1.concat (" ").concat(s2).concat(" ").concat(s3));
				 String s8 = "_!@#$%^&*()_+=-0987654321<>?/.,:'{}][";
                System.out.println(s8.charAt(5)); //% //for string index start from 0
       
				 System.out.println(s8.charAt(8));
				 String s9 = " komal";
				 String s10 = "komal";
				 System.out.println(s9.equals(s10));
				 String s11= "komal";
				 String s12 = "Komal";
				 System.out.println(s11.equals(s12));
				 System.out.println(s11.equalsIgnoreCase(s12));//equalIgnorecase consider spaces but ignore upper or 
				 //lower case (case sensitivity)
				 
				 String s13 = "I am student, with style, smile , shine and smart";
				 System.out.println(s13.replace('s', 'k'));
				 
				 System.out.println(s13.replace('s', 'm').replace('l', 't').replace('m', 'w'));
				 
				 System.out.println(s13.replace("sm", "xyz"));
				 String s14 = "I am student, with style, smile , shine and smart";
				 System.out.println(s14.substring(10, 25));
				 
				 String s15 = "I am student, with style, smile , shine and smart";
				 System.out.println(s15.toLowerCase());
				 System.out.println(s15.toUpperCase());
				 String s16 = "I am st_udent, with @style, smile# , shine a?nd smart";
				String a[]= s16.split("@");
				 System.out.println(a[0]);
				 System.out.println(a[1]);
				 //?, *.{, [, ( are not allow for split method
				 String b[] = s16.split("?");
				 System.out.println(b[0]);
				 System.out.println(b[1]);
				 
				 
				 
				 
				 
	}

}
