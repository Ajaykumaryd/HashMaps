package Lecs;
import java.util.HashMap;
import java.util.Set;
public class Mapuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	HashMap<String,Integer> map=new HashMap<>();
	map.put("abc",8);
	map.put("def",2);
	map.put("abc2",1);
	map.put("def2",2);
//	System.out.println(map.size());
	
	//Presense
	if(map.containsKey("abc")) {
		System.out.println("yes has abc");
	}
	
	if(map.containsKey("abc1")) {
		System.out.println("yes has abc");
	}
	
	//get value
	
	int v=map.get("abc");
	System.out.println(v); //prints 1
	
//	int w=map.get("abc1");
//	System.out.print(v); //prints 1
	
	
	int w=2;
	if(map.containsKey("abc1")){
	v=map.get("abc1");	
	}
	System.out.println(w);
	 
//remove	
	int s=map.remove("abc");
	System.out.println(s);
    
	int e=map.remove("abc2");
	System.out.println(e);
	

//iteration
	  
	Set<String> keys=map.keySet();
	
	}

}
