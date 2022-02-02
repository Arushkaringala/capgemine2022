package demo;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=args[0];
		try {
			int t=Integer.parseInt(s);
			System.out.println("The square value is: " + t * t);
			System.out.println("The work has been done successfully");
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("Java Entered input is not a valid format for an integer.");
		}

	}

}
