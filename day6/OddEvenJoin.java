package day6;

public class OddEvenJoin extends Thread {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread te=new Thread() {
			public void run() {
				for(int i=2;i<=20;i+=2)
					System.out.println(i);
			}
			
		};
		Thread to =new Thread() {
			public void run() {
				for(int i=1;i<=20;i+=2)
					System.out.println(i);
			}
		};
		te.start();
		try {
			//te.join();
		}
		catch(Exception e) {
			System.out.println("dsfd");
		}
		to.start();

	}

}
