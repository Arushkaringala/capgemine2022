package demo;
//user defined exception
public class EH7 extends Exception{
	EH7(String s){
		super(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			throw new EH7("ud exception");
		}
		catch(EH7 e) {
			System.out.println(e);
		}

	}

}
