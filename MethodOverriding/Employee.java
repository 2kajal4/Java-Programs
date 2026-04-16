package MethodOverriding;

public class Employee {
	private int empId;
	private String name;
	protected double basicSalary;
	
	public  Employee(int empId,String name,double basicSalary) {
		this.empId=empId;
		this.name=name;
		this.basicSalary=basicSalary;
	}

	public double calculateGross() {
		return basicSalary; 
	}
	
	double calculateNet() {
        double pf = 0.12 * basicSalary;
        return calculateGross() - pf;
    }
	
	public void showDetails() {
		System.out.println("Employyee Id: "+empId);
		System.out.println("Name:" +name);
		System.out.println("basicSalary:" +basicSalary);
		System.out.println("Gross salary:"+calculateGross());
		System.out.println("Net Salary"+calculateNet());
	}
	
	
}
