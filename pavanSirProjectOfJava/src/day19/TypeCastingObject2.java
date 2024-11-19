package day19;

class Animal{
	void m1 () {
		System.out.println("Animal");
	}
}

class Dog extends Animal{
	void m2 () {
		System.out.println("Dog");
	}
	
}
class Cat extends Animal{
	void m3 () {
		System.out.println("Cat");
	}
}

public class TypeCastingObject2 {

	public static void main(String[] args) {
		//rule 1  c, d has any relation 
		//if not satisfy rule1 gives compile time error.
		//rule 2 C must either same or child of A
		//if not satisfy rule 2 gives compile time error.
		//rule 3 z(underline object d means z) is either same or child of c
		//if not satisfy rule 3 gives run time error.
		//x  y =  new   z            use for rule no 3 
		//A   b    C    d
		
		/*Animal an = new Dog();
        Cat ct = (Cat)an; //valid as per rule 1, 2*/
        
    	//Animal an = new Dog();
       // Cat ct = (Dog) an; //invalid as per rule 2
        
        
		//Animal an = new Dog(); //invalis as per rule 3
		// Cat ct = (Cat)an;
        
		Animal an = new Dog(); //valis as per rule 1, 2, 3
		 Dog dg = (Dog) an; //dg is referance variable of dog so it belong method of same class or it's parent class
        dg.m1();
        dg.m2();
        
        
        
        
	}

}
