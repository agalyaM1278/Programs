package zoho;
import java.io.*;
public class SubstringinString2 {
    //https://www.geeksforgeeks.org/check-string-substring-another/
    


public static int Substr(String s2, String s1){
		int counter = 0; //pointing s2
		int i = 0;
		for(;i<s1.length();i++){
			if(counter==s2.length())
				break;
			if(s2.charAt(counter)==s1.charAt(i)){
				counter++;
			}else{
				//Special case where character preceding the i'th character is duplicate
				if(counter>0){
					i -= counter;
				}
				counter = 0;
			}
		}
		return counter < s2.length()?-1:i-counter;
	}
	public static void main (String[] args) {
		String s1 = "geeksfffffoorrfoorforgeeks";
		//System.out.println(s2.indexOf("for"));
		System.out.println(Substr("for", s1));
	}
}


