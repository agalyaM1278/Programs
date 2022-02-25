package zoho;

public class SumOfWeights {
    /*
    public static void main(String args[])
    {
        int[] numArray = {10,36,54,89,12};
        int numArraylen = numArray.length;
        
        for(int i=0; i<numArraylen; i++)
            for(int j=i+1; j<numArraylen; j++)
                if(numArray[i] > numArray[j])
                {
                    int temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
        int[] wegArray = new int[numArraylen];
        
        for(int i=0; i<numArraylen; i++)
        {
            wegArray[i] = 0;
            int sq =(int) Math.sqrt(numArray[i]);
            if((sq*sq) == numArray[i])
                wegArray[i] = wegArray[i] + 5;
     
            if(numArray[i]%4==0 || numArray[i]%6==0)
                wegArray[i] = wegArray[i] + 4;
     
            if(numArray[i]%2 == 0)
                wegArray[i] = wegArray[i] + 3;
            
        }
        
        for(int i=0; i<numArraylen; i++)
            System.out.print("<"+numArray[i]+","+wegArray[i]+">,");
    }*/

    public static void main(String args[]){ 
        int arr[]=new int[] {10,36,54,89,12};
         int temp;

for(int i=0;i<arr.length;i++){ 
    for(int j=0;j<arr.length;j++){ 
        if(arr[i]<arr[j]){ 
            System.out.println(arr[i]+" "+arr[j]+" "+i+" "+j);
            temp=arr[i];
             arr[i]=arr[j]; 
             arr[j]=temp; } }
}
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]);
}
System.out.println();

int wrr[] =new int[5];

for(int i=0;i<5;i++){ 
    wrr[i]=0; 
    double sqr=Math.sqrt(arr[i]);
     if((sqr*sqr)==arr[i]){
          wrr[i]=wrr[i]+5; 
        }

    if(arr[i]%4==0 && arr[i]%6==0){
        wrr[i]=wrr[i]+4;
     }

    if(arr[i]%2==0){ 
         wrr[i]=wrr[i]+3; } 
        }

for(int i=0;i<arr.length;i++){
     System.out.print("<"+arr[i]+ "," + wrr[i]+ "> ,"); }
}
}

