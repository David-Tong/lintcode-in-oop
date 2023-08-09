package ext;

import abs.Mediator;
import abs.Person;

public class HouseOwner extends Person {

    public HouseOwner(String name, Mediator mediator) {
        // --- write your code here ---
    	super(name, mediator);
    }

    public void contact(String msg) {
        // --- write your code here ---
    	mediator.contact(msg, this);
    }

    public void getMessage(String msg) {
        // --- write your code here ---
    	System.out.println(String.format(
    			"House owner %s get Message: %s", name, msg));
    }

}