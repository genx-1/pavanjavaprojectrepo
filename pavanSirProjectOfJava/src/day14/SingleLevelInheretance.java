package day14;

//we can write multiple class in one file but we write only one public class in file 
 class parent  {
	 void display() {
	System.out.println("This is parent class");
}
 }

class child extends parent{
	void show() {
		System.out.println("This is child method");
	}
}


public  class SingleLevelInheretance {

	public static void main(String[] args) {
		parent obj = new parent();
		obj.display();
		
		child ch = new child();
		ch.show();
		ch.display();
	}

}
