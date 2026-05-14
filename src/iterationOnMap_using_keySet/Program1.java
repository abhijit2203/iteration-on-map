package iterationOnMap_using_keySet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Program1 {
	public static void main(String[] args) {
		Map<Integer, Integer> m1=new HashMap<Integer, Integer>();
		m1.put(10, 2);
		m1.put(12, 5);
		m1.put(20, 3);
		
		//2. iteration on Map using keySet()
	    Set<Integer> set= m1.keySet();
	    
	    for(Integer key:set) {
	    	System.out.println(key+"-->"+m1.get(key));
	    }
	    
	    System.out.println("=========OR==========");
	    
	    for(Integer key:m1.keySet()) {
	    	System.out.println(key+"-->"+m1.get(key));
	    	
	    }
	}

}
