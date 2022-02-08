package day8;
import java.util.List;
import java.util.*;
public class OnlyStringList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Harry");
		list.add("Ron");
		list.add("Hermione");
		
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

}
