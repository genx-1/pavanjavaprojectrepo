package day11;

public class GreetingMain {

	public static void main(String[] args) {
		// no parmeter no returnable
		Greetings gr = new Greetings();
		gr.m1();
 
		//no parameter returnable
		gr.m2();
		System.out.println(gr.m2());
		
		//parameter with no return 
		gr.m3("komal");
		
		//parameter with return type
		gr.m4("At Post Darphal");
		System.out.println(gr.m4("At Post Darphal"));
		
		
		
		
		
		
	}

}
