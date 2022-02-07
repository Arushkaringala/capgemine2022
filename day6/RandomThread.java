package day6;
import java.util.Random;
public class RandomThread implements Runnable {
	public void run() {
		Random random = new Random();
		String colours[] = {"white", "blue", "black", "green", "red", "yellow"};
		int index;
		
		while ((index = random.nextInt(6)) != 4) {
			System.out.println(colours[index]);
		}	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomThread t=new RandomThread();
		Thread t1 = new Thread(t);
		t1.start();
		
	}

}
