package day10;

public class ExecuteEmployeeInfo {

	
		public static void main(String[] args) {
			EmployeeInformation info = new EmployeeInformation();
			EmployeeInformation info1 = new EmployeeInformation();
			EmployeeInformation info2 = new EmployeeInformation();
			info.id=10;
			System.out.println(info.id);
			info.name="komal";
			System.out.println(info.name);
			info.salery=7.2f;
			System.out.println(info.salery);
			info.address="At post Darfal";
			System.out.println(info.address);
			info1.id=10;
			System.out.println(info1.id);
			info1.name="priya";
			System.out.println(info1.name);
			info1.salery=6.7f;
			System.out.println(info1.salery);
			info1.address="At post darfal";
			System.out.println(info1.address);
			info2.id=11;
			System.out.println(info2.id);
			info2.name="shital";
			System.out.println(info2.name);
			info2.salery=10.7f;
			System.out.println(info2.salery);
			info2.address="At post dahifal";
			System.out.println(info2.address);
			info.employeeInfo();
			info1.employeeInfo();
			info2.employeeInfo();		
		}

	}


