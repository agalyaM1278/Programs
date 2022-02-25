package zoho;

import java.util.*;

class GrandChildCount{
	
	//To recurse the method only once
	int flag=0;
		
	int findGrandChildCount(String[][] arr, String father){
		String child = "";
		HashMap<String,String> childFatherMap = new HashMap<String,String>();
		int arrLen = arr.length;
		for(int i=0; i<arrLen; i++){
			if(arr[i][1] == father){
				System.out.println(arr[i][0]);
				childFatherMap.put(arr[i][0],father);
				child = arr[i][0];
			}
		}
		
		//To recurse the method only once
		if(flag==0){
			flag++;
			return findGrandChildCount(arr,child);
		}
		return childFatherMap.size();
	}
	
}
public class NoOfGrandChild2 {
    public static void main(String[] args){
		
		String[][] strArr = {{"luke", "shaw"},{"wayne", "rooney"},{"rooney", "ronaldo"},{"shaw", "rooney"}};
		GrandChildCount obj = new GrandChildCount();
		String fatherName = "ronaldo";
		//String childName = "";
		int grandChildCount = obj.findGrandChildCount(strArr,fatherName);
		
		System.out.println("Grand Children count for "+fatherName+" is "+grandChildCount);
		
	}
}
