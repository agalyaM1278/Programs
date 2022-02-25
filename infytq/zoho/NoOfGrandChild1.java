package zoho;
import java.util.*;
public class NoOfGrandChild1 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Dim[][] = {{"luke","wayne"},{"wayne","rooney"},{"rooney","ronaldo"},{"shaw","rooney"}};
	    String childRonaldo = "";
	    int count = 0;
	    //Sting childRonaldo;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter Name");
		String str = in.nextLine();
	    
		
		 for (int i=0;i<Dim.length;i++)
		 {
			// System.out.println("name entered: " + str);
				 if (Dim[i][1].equals(str))
					 {
							 //System.out.println(Dim[i][0]);
							 childRonaldo = Dim[i][0];
							 System.out.println("Child of " + str + " : " + childRonaldo);
							 break;
							 
					 }
			
		 }
		 for (int k=0;k<Dim.length;k++)
			 {
				 
				 if (Dim[k][1]== childRonaldo)
				 {
					 count++;
					 
					 
				 }
				 
			 }
		 System.out.println("No: of Grand children " + str + " : " + count);
  }
}
