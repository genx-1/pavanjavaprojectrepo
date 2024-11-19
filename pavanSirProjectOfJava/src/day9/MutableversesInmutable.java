package day9;

import java.util.Arrays;

public class MutableversesInmutable {

	public static void main(String[] args) {
		// mutable can change mutable means it changes it's value after any operation without making variable
		int a[] = {50, 40, 35, 60,100,10,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        
        
        String s = "komal";
        s.concat(" Vitthal Makke");
        System.out.println(s); //here value of string does not get change because it not saved in variable
        //so string is inmutable
        String concatstring = s.concat(" Vitthal Makke");
        System.out.println(concatstring);
        
        
        
        
        
        
        
        
        
	}

}
