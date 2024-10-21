package RemoveDupliBy_Hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Launch {
public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<>();
    map.put(1, "Mahesh");
    map.put(2, "sham");
    map.put(3, "Mahesh"); // Duplicate name
    
    Set<String>hm=new HashSet<>(map.values());
    for(String name :hm) {
    	System.out.println(name);
    }
}
}
