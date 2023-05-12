package Lecs;
import java.util.HashMap;
public class practise {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		HashMap<Integer,Integer> m=new HashMap<>();
		m.put(2,1);
		m.put(2,m.get(2)+1);
		m.put(3,m.get(2)+1);
		System.out.println(m.get(3));
		m.put(2,m.get(2)+1);
		m.put(2,m.get(2)+1);
		System.out.println(m.size());	
		m.put(2,1);
		m.put(3,m.get(2)+1);
		
		if(m.containsKey(2)){
//			System.out.println(m.get(2));
		}
		System.out.println(m.get(3));
		System.out.println(m.size());
	}

}
