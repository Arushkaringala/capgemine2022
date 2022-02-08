package day8;

import java.util.ArrayList;
import java.util.List;


class MyArrayList<object> extends ArrayList<object> {
	@Override
	public boolean add(object e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}

public class OnlyNum {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(15);
			list.add(1.2F);
			list.add(3.1415D);
			list.add("Test");
		} catch (Exception e) {
			System.out.println("test");
			e.printStackTrace();
			System.out.println("test");
			
		}
		
		System.out.println(list);

	}
}

