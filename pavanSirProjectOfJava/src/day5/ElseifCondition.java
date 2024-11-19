package day5;

public class ElseifCondition {

	public static void main(String[] args) {
		int day =11;
		if(day==1) {
			System.out.println("Sunday");
		}
		else if (day==2) {
			System.out.println("Tuesday");
		}
		else if (day==3) {
			System.out.println("wedensday");
		}
		else if (day == 4) {
			System.out.println("Thurseday");
		}
			else if (day ==5) {
				System.out.println("Friday");
			}
			else if (day == 6) {
				System.out.println("Saturday");}
			else if (day == 7) {
				System.out.println("Sunday");
		}
			else
			{
				System.out.println("this is not week day");
			}
		
		
		if (false) {
			System.out.println("abc");
		}
		else if (false) {
			System.out.println("PQR");
		}
		else {
			System.out.println("123");
		}
		
		
		int m =33;
		if (m%2==0) {
			System.out.println(m+" is even number");
		}
		else {
			System.out.println(m+" is odd number");
		}
		
		
		for (int i=0; i<=10; i++) {
			
			if (i%2==0) {
				System.out.println("even number is "+ i+"  ");
			}
			
			if(i%2!=0) {
				System.out.println( "odd number are "+i+"  ");
			}
		}
		
		int a =1000;
		int b = 2000;
		int c = 300;
		if ((a>b)&& (a>c)) {
			System.out.println("a is greater number");
		}
		else if ((b>a)&&(b>c)) {
			System.out.println("b is greater number");
		}
		else {
			System.out.println("c is greater number");
		}
		
		
		int p= 1000;
		int q =2100;
		int r = 300;
		if ((p<q)&&(p<r)){
			System.out.println("p is smaller number");
		}
		else if ((q<p)&&(q<r)) {
			System.out.println("q is smaller number");
		}
		else {
			System.out.println("r is smaller number");
		}
		
		System.out.print("Square of 1 to 20 :->");
	    for (int i=1; i<=20; i++) {
		System.out.print( i*i+",");
	    }
		
	    System.out.println();
		int num = 0;
		if(num>0) {
			System.out.println(num+" Number is positive");
		}
		else if (num<0) {
			System.out.println(num+" Number is negative");
		}
		
		else {
			System.out.println(num+" numer is zero");
		}
		
		
		int x =101;
		int y =102;
		int z = 103;
		if ((x>y)&&(x>z)) {
			System.out.println("x is greater number");
		}
		else if ((y>x)&&(y>z)) {
			System.out.println("y is greater number");
		}
		else {
			System.out.println("z is greater number");
		}
		
		
		
		
		
		
		
	}

}
