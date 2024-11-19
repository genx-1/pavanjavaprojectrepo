package day12;

public class Prog1MethodOverloading {
	//Simple approach
	//int v,w,x,y,z;
	/*void addTwoNumber(int x,int y) {
		System.out.println("addition of two number: "+(x+y));
	}
void addThreeNumber(int w, int x, int y) {
	System.out.println("addition of three number: "+(w+x+y));
}
void addFourNumber(int z, int w, int x,int y) {
	System.out.println("addition of four number: "+(w+y+x+z));
}
void addFiveNumber(int v,int w, int y, int z, int x) {
	System.out.println("addition of five number: "+(v+w+x+y+z));
}*/
	
	//Method Overloading
	void add(int x,int y) {
		System.out.println("Addition of number: "+(x+y));
	}
	
	void add(int x, int y, int z) {
		System.out.println("addition of three number :"+(x+y+z));
	}
	 
	void add (int x, double y) {
		System.out.println("addition of two number with different detatype :"+(x+y));
	}
	
	void add (double y, int x) {
		System.out.println("addition of two number having same deta type but different sequence :"+(x+y) );
	}
	
	
	
	
	
	
	
	
	
	
}
