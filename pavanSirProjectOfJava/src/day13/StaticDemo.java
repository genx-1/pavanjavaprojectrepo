package day13;

public class StaticDemo {

	static int a = 10;
			int b = 20;
			 static void m1() {
				 System.out.println("m1 is static method");
			 }
	
	void m2() {
		System.out.println("m2 is nonstatic method");
	}
	
	 public static void main(String[] args) {
		 StaticDemo obj = new StaticDemo();
		 System.out.println(a);
		// System.out.println(b);
		 m1();
		 System.out.println(obj.b);
		 obj.m2();
		 
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
	
	
}
