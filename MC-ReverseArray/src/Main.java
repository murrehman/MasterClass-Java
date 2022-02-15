
// -----------MY CODE--------------------------------

public class Main {

	public static void main(String[] args) {
		reverse();
		

	}
	
	public static void reverse() {
		int[] array = {1,2,3,4,5};
		for(int k=0; k<array.length; k++) {
			System.out.print(array[k]);
		}
		System.out.println();
		
		int[] reverseArray = new int[array.length];
		int j=0;
		for(int i=array.length-1; i>=0; i--) {
			if(j<reverseArray.length) {
				reverseArray[j] = array[i];
				System.out.print(reverseArray[j]);
				j++;
			}
			
		}
		
		
	}

}
