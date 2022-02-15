import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		int[] x = readIntegers(count);
		int minInt = findmin(x);
		System.out.println(minInt);
		
		

	}
	
	public static int[] readIntegers(int count) {
		
		int array[] = new int[count];
		System.out.println("Enter "+ count + " Integers: ");
		for(int i=0; i<array.length;i++) {
			array[i] = scanner.nextInt();
		}
		
		return array;
		
	}
	
	public static int findmin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++) {
			if(array[i]<min)
				min = array[i];
		}
		
		return min;
	}

}
