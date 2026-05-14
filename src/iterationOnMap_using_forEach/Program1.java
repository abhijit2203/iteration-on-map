package iterationOnMap_using_forEach;

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
		
		//3. iteration on Map using forEach()
	    
	    m1.forEach((key,value)->System.out.println(key+"-->"+value));
	    
	    
	}

}
