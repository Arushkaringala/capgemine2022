package day8;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class LLSaveEvenNumbers {
private LinkedList<Integer> list = new LinkedList<Integer>();
	
	public LinkedList<Integer> LLsaveEvenNumbers(int N) {
		list = new LinkedList<Integer>();
		
		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0) list.add(i);
		}
		
		return list;
	}
	
	public LinkedList<Integer> printEvenNumbers() {
		LinkedList<Integer> newList = new LinkedList<Integer>();
		
		for (int item : list) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}
		
		return newList;
	}

	public static void main(String[] args) {
		LLSaveEvenNumbers asg = new LLSaveEvenNumbers();
		asg.LLsaveEvenNumbers(10);
		asg.printEvenNumbers();
		

	}

}
