package factory;

import java.util.HashMap;
import java.util.Map;

public class WebsiteFactory {

    // Add attribute of pool.
    // --- write your code here ---
	Map<String, Template> pool = new HashMap<String, Template>();
	
    // Create website by username and return a Template object.
    public Template createWebsite(String username) {     
        // --- write your code here ---
    	if (!pool.containsKey(username)) {
    		pool.put(username, new ConcreteTemplate());
    	}
    	return pool.get(username);
    }

    // return the size of pool defined.
    public int getSize() {
        // --- write your code here ---
    	return pool.size();
    }

}