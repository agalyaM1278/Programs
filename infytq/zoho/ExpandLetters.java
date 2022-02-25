package zoho;
import java.util.*;
public class ExpandLetters {
    

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s+=",";
        int c=1;
        String ans="";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                c+=1;
            }
            else{
            ans=ans+s.charAt(i)+String.valueOf(c);
            c=1;}
        }
        System.out.println(ans);

    }
    
}

