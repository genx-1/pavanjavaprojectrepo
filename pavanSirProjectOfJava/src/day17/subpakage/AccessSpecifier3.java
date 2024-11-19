package day17.subpakage;

import day17.AccessSpecifier1;

public class AccessSpecifier3 extends AccessSpecifier1{

	public static void main(String[] args) {
		AccessSpecifier1 obj = new AccessSpecifier1();
		
		/*//default not able to access in another package
		obj.m2();
		System.out.println(obj.b);*/

	/*	//protected access specifier can access in another package through inheritance
		AccessSpecifier3 obj1 = new AccessSpecifier3();
		obj1.m3();
		System.out.println(obj1.c);*/
	
		
		obj.m4();
		System.out.println(obj.d);
		
		
		
		
	}

}
