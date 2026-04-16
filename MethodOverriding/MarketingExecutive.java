package MethodOverriding;

public class MarketingExecutive extends Employee {
	int kmTravelled;
    double tourAllowance;
    double telephoneAllowance = 1500;
    
    public MarketingExecutive(int empId,String name,double basicSalary,int km) {
    	super(empId,name,basicSalary);
    	
    	this.kmTravelled=km;
    	tourAllowance=km*5;
    }
    
   public double calculateGross() {
        return basicSalary + tourAllowance + telephoneAllowance;
    }

    public String toString() {
        return "Marketing Executive Details";
    }

}
