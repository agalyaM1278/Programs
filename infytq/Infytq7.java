import java.util.*;
public class Infytq7 {
    static boolean checkPerfectSquare(double number)    
    {     
        double sqrt=Math.sqrt(number); 
        System.out.println(sqrt+" "+Math.floor(sqrt)+" "+number);  
        return ((sqrt - Math.floor(sqrt)) == 0);   
    }   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> ls=new ArrayList<>();
        int m=0;
        String tar[]=new String[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            tar[i]=sc.nextLine();
        }
        m=tar[0].split(",").length;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            String tp[]=tar[i].split(",");
            for(int j=0;j<m;j++)
            {
                arr[i][j]=Integer.parseInt(tp[j]);
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"+++");
                for(int j=0;j<m;j++)
                {
                    sum+=arr[i][j];
                    if(checkPerfectSquare(sum))
                    {
                        ls.add(sum);
                        sum=0;
                    }
                }
            }
            else
            {
                for(int j=m-1;j>=0;j--)
                {
                    sum+=arr[i][j];
                    if(checkPerfectSquare(sum))
                    {
                        ls.add(sum);
                        sum=0;
                    }
                }
            }
        }
        sc.close();
        if(ls.size()==0)
        {
            System.out.println(-1);
            return;
        }
        System.out.println(Collections.max(ls));
        
    }
}