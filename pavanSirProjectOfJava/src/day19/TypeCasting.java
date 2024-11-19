package day19;

public class TypeCasting {

	public static void main(String[] args) {
		//upcasting ;-> assigning smaller deta into large detatype
		//example 1
		int a =10;
		long b = a;
		System.out.println(b);
		
		//example 2(possible)
		float f = 10.5f;
		double g = f;
		
		
		//downcasting :-> assigning higher detatype to lower detatype
    long d = 10l;
     int e = (int) d; //downcasting
	}

	//example 2(possible)
			double g = 15.5;
			float f =(float) g; //downcasting
}
