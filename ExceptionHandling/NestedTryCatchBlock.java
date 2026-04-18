package ExceptionHandling;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try {
            System.out.println("Outer try block");

            int arr[] = {10, 20, 30};

            try {
                System.out.println("Inner try block");

                int a = 10 / 0;

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Arithmetic Error");
            }

            // This will cause ArrayIndexOutOfBoundsException
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array Error");
        }

	}

}
