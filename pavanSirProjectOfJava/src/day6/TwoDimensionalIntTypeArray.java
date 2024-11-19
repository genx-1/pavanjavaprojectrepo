package day6;

public class TwoDimensionalIntTypeArray {

	public static void main(String[] args) {
		/*int a [][] = new int [2][3];
		System.out.println(a.length);
		System.out.println(a[0].length);
		a[0][0]=10;
		a[1][2]=23;
		a[0][1]=19;
		a[0][2]=44;
		a[1][0]=33;
		a[1][1]=21;
		
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[0].length; c++) {
				System.out.print(a[r][c]+",  ");
			}
			System.out.println();
		}*/
		//*************************************************************************************
		int a [][] = { {100,200,500}, {300,250,600}, {700,400,700},{350,450,600},{900,1000,900},{350,450,600},{300,310,920},{810,910,900}};
		/*for(int r=0; r<a.length; r++){
			for (int c=0; c<a[0].length; c++) {
				System.out.print(a[r][c]+", ");
			}
			System.out.println();
		}*/
		
		for (int c[]:a) { //"c[]" it takes elements 1 row
			for(int x:c) {//row element pass to c then c pass value one by one into x
				System.out.print(x+", ");//x print that value
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
