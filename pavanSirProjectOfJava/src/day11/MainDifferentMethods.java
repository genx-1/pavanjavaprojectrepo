package day11;

public class MainDifferentMethods {

	public static void main(String[] args) {
		DifferentMethods obj = new DifferentMethods();
		obj.m1();
		
		int var = obj.m2();
        System.out.println(var);
	
        obj.m3(250, 400);
        
        obj.m4(10.5f, 30.5f);
       System.out.println(obj.m4(10.5f, 30.5f));
       
       
       obj.m5();
       
       
       
       
       
       
       
}
}