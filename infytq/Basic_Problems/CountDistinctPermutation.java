package Basic_Problems;

public class CountDistinctPermutation {
    // Java implementation of the
// above approach

    // Function to find the factorial
    // of a number
    static int fact(int a)
    {
        int i, f = 1;
    
        // Loop to find the factorial
        // of the given number
        for(i = 2; i <= a; i++)
            f = f * i;
        System.out.println(f+" "+a);
        return f;
    }
    
    // Function to find the number
    // of permutations possible
    // for a given String
    static int permute(int n, int r)
    {
        int ans = 0;
      //  System.out.println(n);
        ans = (fact(n) / fact(n - r));
        return ans;
    }
    
    // Function to find the total
    // number of combinations possible
    static int findPermutations(int n)
    {
        int sum = 0, P;
        for(int r = 1; r <= n; r++)
        {
            P = permute(n, r);
            sum = sum + P;
        }
        return sum;
    }
    
    // Driver Code
    public static void main(String[] args)
    {
        String str = "xz";
        int result, n;
        n = str.length();
    
        System.out.print(findPermutations(n));
    }
    }
    
    // This code is contributed by Amit Katiyar
    

