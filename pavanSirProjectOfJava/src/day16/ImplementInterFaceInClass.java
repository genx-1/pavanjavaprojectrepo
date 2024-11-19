package day16;

public class ImplementInterFaceInClass extends ImplementInterFaceInClass2 implements  InterfaceProg2,InterfaceProg1{

	
	public void m2() {
		System.out.println(y);	
	}

	
	
	public void m1() {
		System.out.println(x);	
	}
	
	
	
	public static void main(String[] args) {
		ImplementInterFaceInClass obj = new ImplementInterFaceInClass();	
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
