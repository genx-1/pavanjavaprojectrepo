package day15;

 class parent {
	void p() {
		System.out.println("This is parent method");
	}
}


public class pro2MethodOverriding extends parent{

	void c () {
		System.out.println("This is child method");
	}
	
	void p() {
		System.out.println("This is overrided parent method");
	}
	public static void main(String[] args) {
		pro2MethodOverriding obj = new pro2MethodOverriding();
				obj.c();
		        obj.p();

		   System.out.println("**********************************");     
		        parent p = new parent();
		        p.p();
		        
	}

}
