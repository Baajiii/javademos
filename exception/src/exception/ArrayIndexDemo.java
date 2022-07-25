package exception;


public class ArrayIndexDemo{

	public static void main(String[] args) {
		
		int[] arr = { 10, 20, 30 };
		System.out.println("Length of Array: " + arr.length);
		System.out.println("Elements of the array are: ");
		try {
		for (int i = 0; i <= arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("it is index out of bound exception");
		}
		System.out.println("\nElements are Printed");
		
	}
	
}