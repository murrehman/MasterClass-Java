import java.util.*;

public class Main {
 
	public static void main(String[] args) {
		
		int[] sorted = sortArray(getIntegers());
		printArray(sorted);

	}
	
	public static int[] getIntegers() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 5 integers: ");
		
		
		int array[] = new int[5];
		for(int i = 0; i<5; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
		
	}
	
	public static int[] sortArray(int[] array) {
		
		int temp=0;
		for(int i=0; i<4;i++) {
			for(int j =i+1 ; j<array.length;j++) {
			if(array[i]<array[j]) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
			}
				
		}
		return array;
	}
	
	public static void printArray(int[] array) {

		for(int i=0;i<5;i++) {
			System.out.println(" index " + i + " value " + array[i]);
		}
		
	}

}
