package day3;

public class ArthmaticOperator {

	public static void main(String[] args) {
		int a =10;
		int b = 20;
		int res = a+b;
       System.out.println(res);
       System.out.println(a+b);
       System.out.println(a-b);
       System.out.println(a*b);
       b=6;
       System.out.println(a/b*10);
       System.out.println(a%b);
       System.out.println(res);
       System.out.println(a+b);
       System.out.println(a-b);
       System.out.println(a*b);
       
       System.out.println((a*b)>(a-b));
       System.out.println((a*b)>=(a-b));
       System.out.println((a*b)<(a-b));
       System.out.println((a*b)<=(a-b));
       System.out.println((a*b)==(a-b));
       System.out.println((a*b)!=(a-b));
       System.out.println((a*b)<(a-b)&&(a*b)>(a-b));
       System.out.println((a*b)<(a-b)||(a*b)>(a-b));
       boolean x =a<b;
       System.out.println(!x);
       
       
       System.out.println((10<2)&&(100<2));
       System.out.println((10<2)||(100<2));
       System.out.println((10<200)&&(100<2));
       System.out.println((10<200)||(100<2));
       
       
	}

}
