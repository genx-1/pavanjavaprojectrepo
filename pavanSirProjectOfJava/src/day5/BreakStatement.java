package day5;

public class BreakStatement {

	public static void main(String[] args) {
		
		/*for (int i=1; i<=10; i++) {
			{
				if(i==5) {
					break;
					//System.out.println(i); //it gives syntax erroe (unreachable code) because after break it exit from loop no any satatement 
					//get execute
				}
					System.out.println(i);
				
			}
		}*/
		//so in result it give 1,2,3,4 then after break it comes out from for loop
		for (int i=1; i<=10; i++) {
			{
				if((i==5)||(i==3)) {
					break;
					//System.out.println(i); //it gives syntax erroe (unreachable code) because after break it exit from loop no any satatement 
					//get execute
				}
					System.out.println(i);
				
			}
		}
			
		for (int i=1; i<=10; i++) {
			{
				if((i==5)&&(i==3)) {
					break;
					//System.out.println(i); //it gives syntax erroe (unreachable code) because after break it exit from loop no any satatement 
					//get execute
				}
					System.out.println(i);
				
			}
		}
		
	//	if we want to break loop we use break condition
		
		
		
		
		
		
		
		
		
		

	}

}
