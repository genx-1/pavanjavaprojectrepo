package day12;

public class MainProg1MethodOverloading {

	public static void main(String[] args) {
		//Simple approach
		/*Prog1MethodOverloading pro1 = new Prog1MethodOverloading();	
		pro1.addFiveNumber(10,20,30,40,50);
		pro1.addFourNumber(10,20,30,40);
		pro1.addThreeNumber(10,20,30);
		pro1.addTwoNumber(10,20);*/
		
		
		//Method Overloading
		Prog1MethodOverloading pro1 = new Prog1MethodOverloading();
		
		pro1.add(10, 10.5);
		pro1.add(10, 10);
		pro1.add(15.5, 10);
		pro1.add(10, 10, 10);
		
		
		
		
		
		
		
		
	}

}
