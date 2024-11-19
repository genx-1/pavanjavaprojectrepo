package day2;

public class ArthmaticVariables {
	public static void main(String[] args) {
	int a =10;
	int b = 20;
	int res = a+b;
   System.out.println(res);//30
   System.out.println(a+b);//30
   System.out.println(a-b);//-10
   System.out.println(a*b);//200
   b=6;
   System.out.println(a/b*10);//(10/6*10)//yamadhe 1 ha bhaga kar aahe ani 1*10 =10
   System.out.println(a%b);//it gives baki
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
