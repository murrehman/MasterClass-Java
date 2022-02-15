
public class PrimeNumbers {

	public static void main(String[] args) {
	//isPrime(55);
	System.out.println(isPrime(23));
		

	}
	
	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

}
