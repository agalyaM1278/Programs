package Patterns;

public class NumberPatter6 {
    public static void main(String args[]) {
        int n=6;
        int c=n;
        for(int i=1;i<=n;i++){
            int k=i;
            //int p=n;
            for(int j=0;j<c;j++){
                System.out.print(k+" ");
                k=k+(n-j);
            }
            c--;
            System.out.println();
        }
        
    }
}
