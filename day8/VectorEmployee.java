
package day8;
import java.util.Vector;
import java.util.*;
public class VectorEmployee {
	public static void main() {
	Vector<Employee1> list = new Vector<>();
	
	list.add(new Employee1(101, "Bob", "123 street, India", 20000.0));
	list.add(new Employee1(102, "Alice", "234 street, India", 30000.0));
	list.add(new Employee1(103, "John", "345 street, India", 25000.0));
	list.add(new Employee1(104, "Stuart", "456 street, India", 40000.0));
	
	Iterator<Employee1> it = list.iterator();
	while (it.hasNext()) 
		System.out.println(it.next());
	}

}



