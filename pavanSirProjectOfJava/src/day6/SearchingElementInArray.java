package day6;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int a []= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int search_element = 11;
		boolean status = false;
		/*for(int x:a) {
			if(x==search_element) {
				System.out.println("element get found");
				status=true;
				break;
			}*/
			
			
		for(int i=0; i<a.length; i++) {
			if (a[i]==search_element) {
				System.out.println("element get found");
				status = true;
				break;
			}
			
			
			
		}

		if(status==false) {
		System.out.println("element not found");
		
		}
		
		
		
		
		
		
		
		
	}

}
