package zoho;

public class FindFactorsofArray {
    public static int FindFactors(int n){
        int count=0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[]=new int[]{8, 2, 3, 12, 16};
        int arr2[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int c=FindFactors(arr[i]);
            System.out.println(arr[i]+" "+c);
        }
    }
}
