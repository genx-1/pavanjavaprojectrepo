package day15;
  class motiDog  {
	String color = "black";
}

  class GoluDog extends motiDog{
		String color = "white";
	}

  class johnDog extends GoluDog{
		String color = "pink";
	}

  class cocoDog extends johnDog {
	  String color = "red";
	  void showColor() {
			System.out.println("color of dog "+super.color);
		}
		
	}

public class ColorClassForSuper extends cocoDog {
	
		String color = "blue";
	
	void displayColor() {
		System.out.println("color of dog "+super.color);
	}
}
