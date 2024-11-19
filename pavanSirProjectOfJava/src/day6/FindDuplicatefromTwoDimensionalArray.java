package day6;

public class FindDuplicatefromTwoDimensionalArray {

	public static void main(String[] args) {
	
			int a [][] = { {100,200,500}, {300,250,600}, {900,400,700},{350,450,600},{900,1000,900},{350,450,600},{300,310,920},{810,910,900}};
			/*for(int r=0; r<a.length; r++){
				for (int c=0; c<a[0].length; c++) {
					System.out.print(a[r][c]+", ");
				}
				System.out.println();
			}*/
			int num = 900;
		 int count=0;
			for (int c[]:a) { 
				for(int x:c) {
					if (x==num) {
						count++;
					}
						
				}
					}
			System.out.println(count);
		
 
	}

}
