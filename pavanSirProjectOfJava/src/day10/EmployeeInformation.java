package day10;

public class EmployeeInformation {
	//protected int id ;
	
	/* we cannot use access specifier in particular method
	 void EmployeeDeta() {
		//protected int id ;
		//public String name;
		//default int id;
		 String address;
}*/

	
	public int id =23;
	public String name = "omkar";
	public float salery = 6.9f;
	public String address = "at post osmanabad";
	
	public void employeeInfo() {
		System.out.println(id +" "+name +" "+salery+" "+address);
	}	
}


