package day3;

public class AssignmentOperator {
	public static void main(String[] args) {
		int a =10;
		int b = 20;
		System.out.println(a);
	//want to increase a by 5
		 //a += 5 ; how can i do
		//solution is preincrement
		a += 5;
		System.out.println(a);
		a -= 5;
		System.out.println(a);
		a *=10;
		System.out.println(a);
		a /= 5;
		
		System.out.println(a);
		a %=5;
		
		//Preincrement
		
	//postincrement and decrement first it display variable like res, result and then take increment and decrement
	int m = 2;
	int res = m++;
		System.out.println(res);
		System.out.println(m);
		
		
		int p = 10;
		int result = p--;
		System.out.println(result);
		System.out.println(p);
				
	}
}
