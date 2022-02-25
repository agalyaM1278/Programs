package zoho;

public class test {
    public static void main(String args[]){
        String str="aga piri mom";
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            char c=arr[i].charAt(0);
            System.out.println(c);
        }
    }
}
