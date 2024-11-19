package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
	// how to declere array
		//we can not declere arraylength 10 and putting 11 element for aaray
		int a [] = new int [11];
		a [0]=12;
		a [2]=34;
		a [1] =23;
		a[3] = 34;
		a[4] = 45;
		a[5]=46;
		a[6]=90;
		a[8]=67;
		a[9]=50;
		a[10]=69;
		//System.out.println(a.length);
		System.out.print("number present in int type array ;-> ");
		/*for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}*/
//if we do not assign value for array element then it take 0 value
		for (int x :a) {
			System.out.print(x+", ");
		}
		System.out.println();
	//*******************************************************************************************************	
		//second Approach
		int m []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.print("number present in int type array ;-> ");
		for (int y:m) {
			System.out.print(y+", ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
