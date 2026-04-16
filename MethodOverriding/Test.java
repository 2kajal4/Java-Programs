package MethodOverriding;

public class Test {
	
	 static void showDetails(Employee e) {
	        System.out.println(e.toString());
	        e.showDetails(); 
	        System.out.println("----------------------");
	    }

	    public static void main(String[] args) {

	        Employee m = new Manager(23,"kajal",40.0,30.0,2.4,3.6);
	        Employee me = new MarketingExecutive(2, "Alice", 40000, 100);

	        showDetails(m);
	        showDetails(me);
	    }
}
