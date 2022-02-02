package demo;

public class EH4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = args.length;
	
		
				
		int[] arr = new int[n];

		int sum = 0;
		double avg = 0;
		
		try {
			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(args[i]);
			
			for (int i = 0; i < n; i++)
				sum += arr[i];
			
			avg = sum / n;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);

	}

}
