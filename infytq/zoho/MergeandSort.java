package zoho;

import java.util.*;

public class MergeandSort {
   public static void main(String args[]){
       ArrayList<Integer> ar1=new ArrayList<Integer>(Arrays.asList(10,2,5,7,90));
       ArrayList<Integer> ar2=new ArrayList<Integer>(Arrays.asList(1,7,8,34,89));
       ArrayList<Integer> ar3=new ArrayList<Integer>();

       int len1=ar1.size();
       int len2=ar2.size();
       Collections.sort(ar1);
       Collections.sort(ar2);
       for(int p=0;p<ar1.size();p++){
           System.out.print(ar1.get(p)+" ");
           //System.out.print(ar2.get(i)+" ");
       }
       System.out.println();
       for(int p=0;p<ar2.size();p++){
        System.out.print(ar2.get(p)+" ");
        //System.out.print(ar2.get(i)+" ");
    }
    System.out.println();
       int i=0;
       int j=0;
       while(i<len1 && j<len2){
           System.out.println("Start"+ar1.get(i)+" "+ar2.get(j));
           if(ar1.get(i)<ar2.get(j)){
               System.out.println(ar1.get(i)+"i "+i);
               ar3.add(ar1.get(i));
               i++;

           }else if(ar1.get(i)>ar2.get(j)){
            System.out.println(ar2.get(j)+"j "+j);

               ar3.add(ar2.get(j));
               j++;
           }else{
               ar3.add(ar1.get(i));
               System.out.println(ar1.get(i));

               i++;
               j++;
           }
       }
       if(i<len1){
        for(int l=i;l<len1;l++){
            System.out.println("ar111111");
           ar3.add(ar1.get(l));
        }
    }
    if(j<len2){
        for(int y=j;y<len2;y++){
            System.out.println("ar22222");

            ar3.add(ar2.get(y));
        }
    }
       for(int k=0;k<ar3.size();k++){
           System.out.print(ar3.get(k)+" ");

       }
      


   } 
}
