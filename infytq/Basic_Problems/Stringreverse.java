package Basic_Problems;

public class Stringreverse {
    public static void main(String args[]){
        //o/p----> three two one
        String str="one two three";
        String arr[]=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //o/p----> eerht owt eno
        String str1="one two three";
        String arr1[]=str.split("");
        for(int i=arr1.length-1;i>=0;i--){
            System.out.print(arr1[i]+"");
        }
    }
}
