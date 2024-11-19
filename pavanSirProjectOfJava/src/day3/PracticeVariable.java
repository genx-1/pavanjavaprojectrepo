package day3;

public class PracticeVariable {

	public static void main(String[] args) {
		//operator 1) arthematic 2)logical 3)assignment operator 4) relational
		
		//arthematic -> +,-,*,%,/,
		int a = 10;
		int b= 20;
		System.out.println(a+b); //30
		System.out.println(a-b);//-10
		System.out.println(a*b);//200
		System.out.println(b%a);//0
		System.out.println(b/a);//2
		//note result of arthmatic operator is integer type
		//*********************************************************************
		//logical operator
		//result of logical operator is always in boolean format (true or false)
		//==, !=, >, < ,<=, >= 
		int c = 10;
		int d = 20;
		System.out.println(c==d);//false
		System.out.println(c!=d);//true
		System.out.println(c<d);//true
		System.out.println(c>d);//false
		System.out.println(c<=d);//true
		System.out.println(c>=d);//false
				
		System.out.println((c+d)>(a+b));//false
		System.out.println((c+d)<(a+b));//false
		System.out.println((c+d)>=(a+b));//true
		System.out.println((c+d)<=(a+b));//true
		System.out.println((c+d)==(a+b));//true
		System.out.println((c+d)!=(a+b));//false
		
		//*************************************************************8
		//relational operator
		//a=10,b=20, c=10,d=20
		System.out.println((c+d)<(a+b)&&(c+d)<(a+b));//false
		System.out.println((c+d)>(a+b)||(c+d)>(a+b));//false
		System.out.println((c-d)>=(a*b)&&(c+d)>(a+b));//false
		System.out.println((c%d)<=(a+b)||(c-d)>(a+b));//true
		System.out.println((c*d)==(a%b)&&(c+d)>(a+b));//false
		System.out.println((c*b)!=(a*b)||(c+d)>(a+b));//false
		//result of relational operator is always in boolean format (true or false)
		//**************************************
		
		//Assignment operator1) preassignment 2) postassignment
		int e= 10;
		int f = e++;
		System.out.println(f);
		//int g += 5;
		a += 5;
		System.out.println(a);
		a -=7;
		System.out.println(a);
		a *=5;
		System.out.println(a);
		a /=10;
		System.out.println(a);
		
		int h  = 15;
		int g = h--;
		System.out.println(g);
		
		
		
	}

}
