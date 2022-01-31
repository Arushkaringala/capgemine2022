package testpackage;

public class Patient{
	Patient(){
		
	}
	String name;
	double height,weight;
	Patient(String name,double height,double weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	double BMI(){
		return ((weight)/(height*height))*703;
		
	}

}
