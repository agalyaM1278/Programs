public class Infytq11 {
    public static boolean sixpresent(int n) {
        while(n!=0){
            int res=n%10;
            n=n/10;
            if(res==6){
                return true;
            }
        }
        return false;


        
    }
    public static int ChangetoNine(int n){
        int res;
      //  System.out.println(n);
        String r="";
        while(n!=0){
            int k=n%10;
           // System.out.println(k);
            if(k==6){
               // System.out.println(String.valueOf(9));
                r=r+String.valueOf(9);
            }else{
                r=r+String.valueOf(k);
            }
            //System.out.print(res);
            n=n/10;

        }
        res=Integer.valueOf(r);
        return res;
    }
    public static void main(String args[]) {
        int arr[]={43,66,225,76};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(sixpresent(arr[i])){
               // System.out.println(arr[i]);
                int k=ChangetoNine(arr[i]);
                //System.out.println(k);
                arr[i]=k;
                sum+=arr[i];
            }else{
                sum+=arr[i];
            }
        }
        double d=sum/arr.length;
        System.out.printf("%.1f",d);
        
    }
}
