package day16;

interface shap {
	
	int length =10; //bydefault variable is static and default
	int width = 20; //bydefault variable is static and default
	//int x =1000;
	//int y =2000;
	// inteface have only abstracted method and from java 8 it allow static and default method
	
	 void circle();//abstract method //we do not provide any access specifier then it take default we can not reduce visubility (means we do not make
	 //public to default but we can make default to public so we make abstracted method is public in child class)
	 
	 
	default void square() { //method do not provide body or make method default (default method means provide defaut as access specifier or static
		System.out.println("This is square");
	}
	
	
	 static void rectangle() { //method do not provide body or make method default (default method means provide defaut as access specifier or static
		System.out.println("This is rectangle");
	}
	
}

  public class InterfaceDemo implements shap {
	  
   public  void circle ()
   {
	System.out.println("This is circle");
   }
	
	//now interfaceDemo class have circle square and rectangle methods and traingle which it's own
    // through object of interface method so can not access through 
   public  void traingle ()
   {
	System.out.println("This is traingle");
   }
	 int x =1000;//this is variable of class are not satic bydafault
	 int y =2000;//this is variable of class are not satic bydafault
	
	public static void main(String[] args) {
		//senario one
		InterfaceDemo obj = new InterfaceDemo();
		obj.circle();
		shap.rectangle();
		obj.square();
		obj.traingle();
		System.out.println(length);
		System.out.println(width);
		// System.out.println(x);
		// System.out.println(y);
		
		//senario one
				shap sh = new InterfaceDemo();//we can make object for interface (like shap) but we can initiate interface
				sh.circle();
				shap.rectangle();
				sh.square();
				//sh.traingle();//not access through object of interface because 
			//	System.out.println(x);
			//	System.out.println(y);
			
	}

}
