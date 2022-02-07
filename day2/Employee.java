package testpackage;

public class Employee extends Person {
	Employee(){
		
	}
	double annual_salary;
	String DOJ;
	String NIN;
	Employee(String name,double annual_salary,String DOJ,String NIN){
		super(name);
		this.annual_salary=annual_salary;
		this.DOJ=DOJ;
		this.NIN=NIN;
		
	}
	public void getter() {
		System.out.println("annual salary is "+annual_salary);
		System.out.println("DOJ is "+DOJ);
		System.out.println("NIN is "+NIN);
		System.out.println("name is "+name);
	}
	

}
