package day3;

public class RelationalOperator {

	public static void main(String[] args) {
		/*boolean var = 10<100;
		System.out.println(var);
		
		boolean var1 = 10<=100;
		System.out.println(var1);
		
		boolean var2 = 10>100;
		System.out.println(var2);
		
		boolean var3 = 10>=100;
		System.out.println(var3);
		
		boolean var4 = 10==100;
		System.out.println(var4);
		
		boolean var5 = 10!=100;
		System.out.println(var5);*/
		
		System.out.println(10<100);
		System.out.println(100<10);
		System.out.println(100==10);
		System.out.println(100!=10);
		System.out.println(100<=10);
		System.out.println(100>=10);

		System.out.println((10<100)||(100<10));
		System.out.println((10==100)&&(100<10));
		System.out.println((10!=100)&&(100>10));
		System.out.println((10<100)&&(100<10));
		System.out.println((10==100)&&(100!=10));
		System.out.println((10<=100)&&(100!=10));
		
	}

}

