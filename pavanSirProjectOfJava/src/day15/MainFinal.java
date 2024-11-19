package day15;
// final class can not extend
public class MainFinal extends Final {

	//final method cannot override
	void m1() {
		System.out.println("");
	}
	
	
	
	
	public static void main(String[] args) {
		MainFinal obj = new MainFinal();
		//value final variable cannot change
		obj.a=200;
         
	}

}
