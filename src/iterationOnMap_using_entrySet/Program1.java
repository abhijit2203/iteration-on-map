package iterationOnMap_using_entrySet;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Program1 {
	
	public static void main(String[] args) {
		Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
		m1.put(10, 2);
		m1.put(12, 5);
		m1.put(20, 3);
		
		//1. iteration on Map using entrySet()
	    Set<Map.Entry<Integer,Integer>> ent= m1.entrySet();
	    
	    for(Entry<Integer,Integer> e:ent) {
	    	System.out.println(e.getKey()+"-->"+e.getValue());
	    }
	    
	    System.out.println("=========OR==========");
	    
	    for(Map.Entry<Integer,Integer> e:m1.entrySet()) {
	    	System.out.println(e.getKey()+"-->"+e.getValue());
	    	
	    }
	}

}
