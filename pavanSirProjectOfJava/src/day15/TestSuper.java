package day15;





public class TestSuper  {
String color ="black";
}

class animal extends TestSuper{
	String color = "white";
	

	
		void displayColor() {
			
// super keyword refer variable of immediate parent class here immediate 
			//parent is black
			//System.out.println(super.color);
			
			System.out.println(color);//it gives variable of current class means white
			
		}

	}


