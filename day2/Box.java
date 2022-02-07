package testpackage;

public class Box {
	int w;
	int h;
	double d;
	Box(int width,int height,double depth){
		 w=width;
		 h=height;
		 d=depth;
	}
	double volume() {
		return this.w*this.h*this.d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b=new Box(10,20,30);
		System.out.println(b.volume());

	}

}
