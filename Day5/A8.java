package Day5;

public class A8 {
	public static void main(String[] args) {
		String str1 = "Wipro";
		String str2 = "X";
		int separator = 3;
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0 ; i < separator; i++) 
			sb.append(str1);
		
		System.out.println(sb);
	}
}