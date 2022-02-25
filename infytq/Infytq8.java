//MINIMUM SWAP REQUIRED
import java.util.*;


public class Infytq8 {
    static int minSwaps(int arr[], int n) {

        int noOfOnes = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1)
            noOfOnes++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        //System.out.println("NoofOnes"+noOfOnes);
        int x = noOfOnes;
        int maxOnes = Integer.MIN_VALUE;
        int preCompute[] = new int[n];
        if (arr[0] == 1)
            preCompute[0] = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == 1) {
              //  System.out.println(preCompute[i]+"***");
            preCompute[i] = preCompute[i - 1] + 1;
            } else
            preCompute[i] = preCompute[i - 1];
        }
        for(int i=0;i<preCompute.length;i++){
            System.out.print(preCompute[i]+" ");
        }
        System.out.println();
        for (int i = x - 1; i < n; i++) {
            if (i == (x - 1))
            noOfOnes = preCompute[i];
            else
            noOfOnes = preCompute[i] - preCompute[i - x];
            
            if (maxOnes < noOfOnes)
            maxOnes = noOfOnes;
        }
        int noOfZeroes = x - maxOnes;
        
        return noOfZeroes;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]=sc.next().split(",");
        int arr[]=new int[str.length];
        for(int i=0;i<str.length;i++)
        {
            if(str[i].equals("A"))
            {
                arr[i]=1;
            }
        }
        int con=minSwaps(arr, arr.length);
        if(con==0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(con);
        }
        sc.close();
    }
}
