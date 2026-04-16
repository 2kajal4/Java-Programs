package MethodOverriding;

public class Manager extends Employee
{

   private double petrolAllowance;
   private double foodAllowance;
   private double otherAllowance;
   
   public Manager(int empId,String name,double basicSalary,double petrolAllowance,double foodAllowance, double otherAllowance) {
	   super(empId,name,basicSalary);
	   
	   petrolAllowance=0.10*basicSalary;
	   foodAllowance=0.3*basicSalary;
	   otherAllowance=0.13*basicSalary;
	   
   }
   
   public double calculateGross() {
		return basicSalary+petrolAllowance+foodAllowance+otherAllowance; 
	}
   
   public String toString() {
       return "Manager Details";
   }
}
