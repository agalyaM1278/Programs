import java.util.HashSet;

//‘M’ LARGEST NUMBERS FROM 2 ARRAYS

//find the common integers of arr1 and arr2 
//find the smallest among common integers
//if the smallest element is of more than one digit ..we should add it consecutively 
//Then find a m numbers of largest elements from arr1 and arr2 
import java.util.*;

public class Infytq9 {
    public static void main(String args[]) {
        int arr1[]={101,610,101,610,447,389};
        int arr2[]={610,4,101,4,101};
        int min;
        Set <Integer> l=new HashSet<Integer>();
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr1[j]);
                l.add(arr1[i]);
                

            }
        }
        
        for(int i:l){
            System.out.println(i);
        }

        
        
        
    }
}
