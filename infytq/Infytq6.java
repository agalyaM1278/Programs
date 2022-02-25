import java.util.*;
public class Infytq6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1[]=sc.next().split(",");
        String str2[]=sc.next().split(",");
        List<String> ls=new ArrayList<>();
        List<String> ls2=new ArrayList<>();
        for(int i=0;i<str1.length;i++)
        {
            String tp1=str1[i].toLowerCase().replaceAll("[a-z]", "");
            System.out.println(tp1+" "+"tp1");
            String tp2=str1[i].replaceAll("[0-9]", "");
            System.out.println(tp2+" "+"tp2");

            boolean b=true;
            for(int j=0;j<str2.length;j++)
            {
                if(str2[j].equals(tp1))
                {
                    b=false;
                }
            }
            if(b)
            {
                ls.add("NA");
                ls2.add("NA");
            }
            else
            {
                ls.add(tp1);
                ls2.add(tp2);
            }
        }
        for(int i=0;i<ls.size()-1;i++)
        {
            System.out.print(ls.get(i)+",");
        }
        System.out.println(ls.get(ls.size()-1));
        for(int i=0;i<ls2.size()-1;i++)
        {
            System.out.print(ls2.get(i)+",");
        }
        System.out.println(ls2.get(ls2.size()-1));
        sc.close();
    }
}