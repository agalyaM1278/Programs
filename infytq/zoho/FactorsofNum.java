package zoho;
import java.util.*;
public class FactorsofNum {
    // A O(sqrt(n)) java program that prints all divisors
// in sorted order




	// method to print the divisors
	static void printDivisors(int n)
	{
		// Vector to store half of the divisors
		ArrayList<Integer> v = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {

				// check if divisors are equal
				if (n / i == i)
					System.out.printf("%d ", i);
				else {
					System.out.printf("%d ", i);

					// push the second divisor in the vector
					v.add(n / i);
				}
			}
		}

		// The vector will be printed in reverse
		for (int i = v.size() - 1; i >= 0; i--)
			System.out.printf("%d ", v.get(i));
	}

	// Driver method
	public static void main(String args[])
	{
		System.out.println("The divisors of 2 are: ");
		printDivisors(2);
	}
}

/*Time Complexity : O(sqrt(n)) 
Auxiliary Space : O(sqrt(n))*/
