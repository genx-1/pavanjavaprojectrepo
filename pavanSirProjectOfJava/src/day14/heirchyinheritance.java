package day14;
class animal  {
	void a() {
		System.out.println("this is animal class");
	}
}

class dog extends animal{
	void d() {
		System.out.println("This is dog class");
	}
}

class cat extends animal {
	void c () {
		System.out.println("This is cat class");
	}
}

class rat extends animal{
	void r() {
		System.out.println("This is rat class");
	}
}



public class heirchyinheritance {

	public static void main(String[] args) {
		animal a = new animal();
       a.a();
       
       dog d = new dog();
       d.a();
       d.d();
       
       cat c = new cat();
       c.a();
       c.c();
       
       rat r = new rat();
       r.a();
       r.r();
       
       
       
       
       
       
       
       
	}

}
