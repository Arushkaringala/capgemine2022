package Day5;

public class Split {
	public static void main(String[] args) {
		String str = "ab*cd";
		String s="Patrick*Jane*teresa*lisbon*JOhn";
		
		String[] strs = s.split(".\\*.");
		
		StringBuffer sb = new StringBuffer();
		
		for (String x : strs)
			sb.append(x);
		
		System.out.println(sb);

	}

}
