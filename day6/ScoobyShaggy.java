package day6;

public class ScoobyShaggy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread("Scooby") {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		Thread t2=new Thread("Shabby") {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				
			}
		};
		t1.setName("ghg");
		t1.start();

	}

}
