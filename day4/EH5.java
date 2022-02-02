package demo;
import java.util.*;
public class EH5 {

	public static double division(int a, int b) throws ArithmeticException {
		return a / b;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			double r = division(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

	}

}
