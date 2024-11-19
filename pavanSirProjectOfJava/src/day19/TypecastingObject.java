package day19;


class Parent{
	String name = "john";
	void m1() {
		System.out.println("this is parent method");
	}
}

class child extends Parent{
	int id = 12;
	void m2() {
		System.out.println("this is child method");
	}
}
public class TypecastingObject {

	public static void main(String[] args) {
		/*child c = new child();
		c.m1();
		c.m2();
		System.out.println(c.id);
		System.out.println(c.name);*/
		
		
		/*Parent p = new child();
		//p.name
		System.out.println(p.name);
		p.m1();*/
		//System.out.println(p.id);//cannot access
		//p.m2()//cannot access
		
		//rule 1  c, d has any relation 
		//if not satisfy rule1 gives compile time error.
		//rule 2 C must either same or child of A
		//if not satisfy rule 2 gives compile time error.
		//rule 3 z(underline object d means z) is either same or child of c
		//if not satisfy rule 3 gives run time error.
		//x  y =  new   z            use for rule no 3 
		//A   b    C    d
		Parent P = new Parent();
		child c = (child)P; //invalid rule 3 so gives run time error
		
		
		c.m1();
		c.m2();
		System.out.println(c.id);
		System.out.println(c.name);

	}

}
