package day14;
// in the inheritance package we can not use class name duplicate
class G  {
	void g()
	{
		System.out.println("this is grandparent method");
	}
}

class P extends G{
	void p() {
		System.out.println("this is parent method");
	}
}

class C extends P {
	void c () {
		System.out.println("this is child method");
	}
}

class GC extends C{
	void gc ()  {
		System.out.println("this is grand child method");
	}
}


public class multilevelInheretance {
	public static void main(String[] args) {
		
		G obj = new G();
		obj.g();
		
	P obj1 = new P();
	obj1.p();
	obj1.g();
		

	C obj2 = new C();
	obj2.p();
	obj2.g();
	obj2.c();
		
	GC obj3 = new GC();
	obj3.c();
	obj3.g();
	obj3.gc();
	obj3.p();
		
		
	
	}
	}
