package StaticVariableMethods;

public class StaticBlock {
	static String appName;
    static int version;
    
    static {
        appName = "MyApp";
        version = 1;
        System.out.println("Static block executed");
    }


	public static void main(String[] args) {
		 System.out.println(StaticBlock.appName);
	     System.out.println(StaticBlock.version);

	}

}
