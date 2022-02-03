package Day5;
public class StringFunctions {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="PatrickJane";
		String s2="TeresaLisbon";
		String s3="Jane";
		String s4="jane";
		char ch[]=new char[10];
		System.out.println("charAt() "+s1.charAt(0));
		System.out.println("charAt() "+s2.charAt(2));
		System.out.println("compareTo() "+s2.compareTo(s1));
		System.out.println(s1.concat(s2));
		System.out.println(s2+"   "+s1);
		System.out.println(s1.contains(s3));
		System.out.println(s1.endsWith(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println(String.format("akhil a no %d",1));
		System.out.println(s1.getBytes());
		s1.getChars(0, 5,ch, 2);
		for(char c:ch) {
			System.out.print(c+" ");
		}System.out.println();

		System.out.println(s1.indexOf("J"));
		String st1=new String("hello");  
		String st2="hello";  
		String st3=st1.intern();//returns string from pool, now it will be same as s2  
		System.out.println(st1==st2);//false because reference variables are pointing to different instance  
		System.out.println(st2==st3);//true because reference variables are pointing to same instance 
		System.out.println(s1.isEmpty());
		System.out.println(s1.join("#","pushpa","raj","jhukega nahi"));
		System.out.println(s2.lastIndexOf("e"));
		System.out.println(s2.length());
		System.out.println(st1.replace('h','c')+" replaced st1 c by h is "+st1);
		System.out.println(st1.replaceAll("h", "buff")+"    "+st1);
		 String str = "geekss@for@geekss";
	        String[] arrOfStr = str.split("@");
	 
	        for (String a : arrOfStr)
	            System.out.println(a);
	    
	    System.out.println(s1.startsWith("Patrick"));
	    System.out.println(s1.substring(0,5));
	    char[] newchararray=(s1.toCharArray());
	    for (char a : newchararray)
            System.out.println(a);
	    System.out.println("PATRICK".toLowerCase());
	    System.out.println("patrick".toUpperCase());
	    System.out.println("    RRRR      ".trim());
	    System.out.println(String.valueOf(1024));
	    
		

		

	}

}
