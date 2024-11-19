package day13;

public class ThisKeyword {

	//public static void main(String[] args) {
		int x;
		int y;
		
	/*	ThisKeyword(int x, int y){
		this.x=x;
		this.y=y;
		}
		
		 void m1 () {
			
			System.out.println(x);
			System.out.println(y);
		}
		 public static void main(String[] args) {
			 ThisKeyword obj = new ThisKeyword(12,23);
			 obj.m1();*/
		 
		 void setData (int x, int y) {
			 this.x=x;
			 this.y=y;
		 }
		 
		 void display() {
			 System.out.println(x);
				System.out.println(y);	
		 }
				 public static void main(String[] args) {
					 ThisKeyword obj = new ThisKeyword();
					 obj.setData(10, 10);
					 obj.display();
		 
		 }
	}


