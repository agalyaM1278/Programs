//SORTED STRING INDEX DIFFERENCE
import java.util.*;

public class Infytq10 {
    public static void main(String args[]) {
        String str="gt4r22w7e";
        String[] temp=str.split("");
        ArrayList<String> arr=new ArrayList<String>();
        ArrayList<Integer> numarr=new ArrayList<Integer>();
        int minindexstr=0;
        int maxindexstr=0;
        int numarrind[]=new int[2];
        for(int i=0;i<str.length();i++){
            String s="";
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                  s+=str.charAt(i);
                  arr.add(s);
                  s="";
            }else{
                s+=str.charAt(i);

                int k=Integer.valueOf(s);
                s="";
                //System.out.println(str.charAt(i));
                numarr.add(k);
            }
        } 
        Collections.sort(arr);
        Collections.sort(numarr);
        
       /* for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
        for(int i=0;i<numarr.size();i++){
            System.out.print(numarr.get(i));
        }*/
      

        for(int i=0;i<temp.length;i++){
           // System.out.println(temp[i]+" "+arr.get(0));
            if(temp[i].equals(arr.get(0))){
                
                minindexstr=i;
               
                  
            }if(temp[i].equals(arr.get(arr.size()-1))){
               
                        maxindexstr=i;
                    

            }
        }
       // System.out.println(minindexstr+" "+maxindexstr);
        
        for(int i=0;i<temp.length;i++){
           // System.out.println(temp[i]+" "+arr.get(0));
            if(temp[i].equals(String.valueOf(arr.get(0)))){
                numarrind[0]=i;

            }if(temp[i].equals(String.valueOf(arr.get(arr.size()-1)))){
                numarrind[1]=i;

            }
        }
        int maxi=Math.max(minindexstr,maxindexstr);
        int mini=Math.min(minindexstr,maxindexstr);
        int minnum=Math.min(numarrind[0], numarrind[1]);
        int maxnum=Math.max(numarrind[0], numarrind[1]);
        int strdiff=maxi-mini;
     //   System.out.println(strdiff+"strdiff");
        int numdiff=maxnum-minnum;
       // System.out.println(numdiff+"numdiff");

        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i));
        }
        System.out.print(strdiff+":");
        int sum=0;
        for(int i=0;i<numarr.size();i++){
            sum+=numarr.get(i);
        }
        System.out.print(sum+""+numdiff);


    }
}
