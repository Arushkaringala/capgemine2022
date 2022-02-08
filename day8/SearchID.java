package day8;
import java.util.*;
class Employee1 {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee1(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class SearchID {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<>();
		
		list.add(new Employee1(101, "emma", "ireland", 20000.0));
		list.add(new Employee1(102, "harry", "england", 30000.0));
		list.add(new Employee1(103, "watson", "British columbia", 25000.0));
		list.add(new Employee1(104, "jane", "california", 40000.0));
		
		Iterator<Employee1> it = list.iterator();
		int searchId = 102;
		while (it.hasNext()) {
			Employee1 emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}
