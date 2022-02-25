package Patterns;

public class NumPattern3 {
    public static void main(String args[]){
        int n=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(n-j+" ");
            }
            System.out.println();
        }

        System.out.println("_________________");

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                  System.out.print(n-j);
                }
                else{
                 System.out.print(" ");
                }
            }
            
            System.out.println();
        }

        System.out.println("_________________");

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>=j){
                  System.out.print(n-j);
                }
                else{
                 System.out.print(" ");
                }
            }
            
            System.out.println();
        }

        System.out.println("_________________");

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<=n-1){
                  System.out.print(n-j);
                }
                else{
                 System.out.print(" ");
                }
            }
            
            System.out.println();
        }

        System.out.println("_________________");

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n-1){
                  System.out.print(n-j);
                }
                else{
                 System.out.print(" ");
                }
            }
            
            System.out.println();
        }

    }
}
