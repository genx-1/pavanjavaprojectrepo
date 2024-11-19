package day15;

class p{
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2 (int b) {
		System.out.println(b);
	}
}

public class prog2MethodOverriding extends p {
	void m1(int a,double b) {
		System.out.println(a*b);
	}
	
	void m1(int a) {
		System.out.println(a*a);
	}

	void m2 (int b) {
		System.out.println(b*b);
	}
	void m2 (int a, int b, int c) {
		System.out.println(a*b*c);
	}
	public static void main(String[] args) {
		
		prog2MethodOverriding obj = new prog2MethodOverriding();
		obj.m1(10);
		obj.m2(20);
		obj.m2(10, 10, 10);
		obj.m1(10, 10.5);
		
		p obj1 = new p();
		obj1.m1(100);
		obj1.m2(50);
		
	}

}
