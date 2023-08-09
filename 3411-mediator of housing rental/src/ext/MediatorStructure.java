package ext;

import abs.Mediator;
import abs.Person;

public class MediatorStructure extends Mediator {

    // Add the required properties.
    // Create Getters&Setters as needed.
    // --- write your code here ---
	private HouseOwner houseOwner;
    private Tenant tenant;
    
    public HouseOwner getHouseOwner() {
		return houseOwner;
	}

	public void setHouseOwner(HouseOwner houseOwner) {
		this.houseOwner = houseOwner;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}
    
    @Override
    public void contact(String msg, Person p) {
        // --- write your code here ---
    	if (p == houseOwner) {
    		tenant.getMessage(msg);
    	} else if (p == tenant) {
    		houseOwner.getMessage(msg);
    	}
    }

	

}