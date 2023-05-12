package Lecs;
import java.util.*;
public class removeDuplicates {
    
	public static ArrayList<Integer> removeduplicates(int a[]){
	
	ArrayList<Integer> ans=new ArrayList<>();
	HashMap<Integer,String > seen=new HashMap<>();
	
	for(int i=0;i<a.length;i++) {
	if(!seen.containsKey(a[i])){
	ans.add(a[i]);
	seen.put(a[i],"a");
	}}	
	return ans;	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {1,2,1,2,3,4,55,33,2,66,77};
    ArrayList<Integer> ans=removeduplicates(a);
    for(int i=0;i<ans.size();i++){
    System.out.println(ans.get(i));	
    }
	}

}
