package day15;

 class Bank {

	double roi(double a) {
		return a;
	}

	double roi(double d, double e) {
		// TODO Auto-generated method stub
		return d*e;
	}
 }
 
public  class ProgmethodOverriding extends Bank{
	
		double roi(double a) {
			double num = a*a;
			return num;
			
		}  
	
		
	public static void main(String[] args) {
	
		Bank ProgmethodOverriding = new ProgmethodOverriding();
		//roi(12.5);
		//System.out.println(ProgmethodOverriding.roi(12.5));
		//System.out.println(ProgmethodOverriding.roi(12.5,10.5));
		
		Bank b = new Bank();
		//b.roi(15.5);
		System.out.println(b.roi(15.5));
		System.out.println(b.roi(12.5,10.5));
		
	}

}
