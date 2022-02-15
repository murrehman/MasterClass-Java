import java.util.Arrays;

public class TimsCode { 
	
	public void Tim(String[] args)
	{
	int[] array = {1,11,55,88,77};
	System.out.println("Array = " + Arrays.toString(array));
	
	reverse(array);
	
	System.out.println("Reversed Array = " + Arrays.toString(array));
	}
	
	
	public void reverse(int[] array) {
		int maxIndex = array.length-1;
		int halfLength = array.length/2;
		for(int i=0;i<halfLength;i++) {
			int temp = array[i];
			array[i] = array[maxIndex - i];
			array[maxIndex - i] = temp;
		}
	}
}
