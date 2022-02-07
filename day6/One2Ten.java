package day6;

public class One2Ten implements Runnable {
	
	
	public static void main(String[] args) {
		One2Ten o = new One2Ten();
		Thread t1 = new Thread(o);
		t1.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i == 6)
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(i);
		}		
	}

}
