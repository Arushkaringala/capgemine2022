package day8;

public class EmployeeQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(101, "Emma", "Watson@gmail.com", 'F', 25000);
		Employee emp2 = new Employee(102, "Olivia", "Olisaa@gmil.com", 'F', 30000);
		
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		

		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(102);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(103));

	}

}
