package factory;

import client.Demand;

import java.util.Map;

public class ConcreteTemplate extends Template {

    public ConcreteTemplate() {
        // --- write your code here ---

    }
    
    // Override the create() method in Template.
    // --- write your code here ---
	@Override
	public void create(Demand demand) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Type of Website: " + demand.getType());
		System.out.println("Client user: " + demand.getUsername());
		Map<String, String> content = demand.getContent();
		for (String key: content.keySet()) {
			System.out.println(key + ": " + content.get(key));
		}
	}
  
}