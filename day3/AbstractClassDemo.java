package Day3.demo;

abstract class ABC {
	// contructor
	ABC() {
	}
	// non abstract method
	void show() {
		System.out.println(" this show   abc class");
	}
	// non abstract method
	abstract void show1();
	//static methods
	static void show3() {
	    
	    System.out.println("static method stuff");
	}
}
// this is my concreate class
class xyz extends ABC{
  //overrid is happening here

	void show1() {
		System.out.println(" this show1 written in xyz class not ABC class");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {

		ABC a = new xyz();
		a.show1();
		ABC.show3();
	}

}