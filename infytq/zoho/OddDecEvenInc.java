package zoho;
import java.util.*;
public class OddDecEvenInc {
    public static void main(String args[]){
        int arr[]=new int[] {1,2,3,4,5,6,7,8,9
        };
        ArrayList<Integer> oddnum=new ArrayList<Integer>();
        ArrayList<Integer> evenum=new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                evenum.add(arr[i]);
            }else{
                oddnum.add(arr[i]);
            }
        }

        Collections.sort(evenum,Collections.reverseOrder());
        Collections.sort(oddnum);
        

        for(int i=0;i<evenum.size();i++){
             System.out.print(evenum.get(i)+" ");
            // System.out.print(oddnum.get(i)+" ");
        }
        System.out.println();
        for(int i=0;i<oddnum.size();i++){
           // System.out.print(evenum.get(i)+" ");
            System.out.print(oddnum.get(i)+" ");
       }
       System.out.println();
       ArrayList<Integer> res=new ArrayList<Integer>();
      int  ec=0;
       int oc=0;
       int i=0;
       while(i<arr.length){
            if(ec<evenum.size()){
                res.add(evenum.get(ec));
                ec++;
                i++;

            }if(oc<oddnum.size()){
                res.add(oddnum.get(oc));
                oc++;
                i++;
            }

           
       }

       for(int k=0;k<res.size();k++){
           System.out.print(res.get(k)+" ");
       }
    }
}
