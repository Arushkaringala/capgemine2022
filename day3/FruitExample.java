package Day3.demo;

class Fruit
{
	void name()
	{
		System.out.println("Fruit name is ");
	}
	void taste()
	{
		System.out.println("Fruit taste is ");
	}
	void size()
	{
		System.out.println("Fruit size is ");
	}
	void eat()
	{
		System.out.println("fruit is eatable");
	}
}
class Apple extends Fruit
{
	public void eat() {
			System.out.println("Name of the fruit is APPLE and it Tasts SWEET");
	}
}
class Orange extends Fruit
{
	public void eat() {
		System.out.println("Name of the fruit is ORANGE and it Tasts TANGY");
}
}
public class FruitExample {

	public static void main(String[] args) 
	{
		
		Fruit fruit= new Apple();
		fruit.eat();

	}

}
