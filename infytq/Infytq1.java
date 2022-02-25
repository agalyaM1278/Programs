//STRING ARRAY COMPARE WITH CHARACTER ARRAY
import java.util.*;

public class Infytq1 {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    String str[]=sc.next().split(",");
    Set<String> set=new HashSet<>();
    List<String> ls=new ArrayList<>();
    String res="";
    for(int i=0;i<str.length;i++)
    {
            int con1=0,con2=0,con3=0;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==s.charAt(i))

                {
                   // System.out.println(s.charAt(i)+"*********");
                    con1++;
                    if(str[i].equals(str[j]))
                    {
                        con2++;
                    }
                }
                if(str[i].equals(str[j]))
                {
                    con3++;
                }
            }
            if(con1==con2 && con1==con3)
            {
                res+=s.charAt(i);
            }
    }
    for(int i=0;i<res.length();i++)
    {
        set.add(res.charAt(i)+"");
        if(ls.size()<set.size())
        {
            ls.add(res.charAt(i)+"");
        }
    }
    if(ls.size()==0)
    {
        System.out.println("NA");
    }
    else{
        for(int i=0;i<ls.size();i++)
            System.out.print(ls.get(i));
    }
    sc.close();
}
}