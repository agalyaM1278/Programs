package zoho;
import java.util.*;
public class MiddlePattern {
    static void printPattern(String s)
{
    //Your code here
    ArrayList<String> st=new ArrayList<String>();
    String str="";
    int n = s.length()/2;
    String newString = s.substring(n,s.length())+s.substring(0,n)+"";
    
    for(int i = 0;i<s.length();i++){
        str = "";
        str += newString.substring(0,i+1);
       st.add(str);
    }
     int k=0;
    for (int i = s.length(); i >= 1; i--)
        {
            // print '*' i times
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                
            }
            System.out.print(st.get(k));
            k++;
            
            System.out.print(System.lineSeparator());
           
        }
}
    public static void main(String args[]){
        String s="Program";
        printPattern(s);

    }
}
