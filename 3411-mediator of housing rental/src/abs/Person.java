package abs;

public abstract class Person {

    // Add the required properties.
    // --- write your code here ---
	protected String name;
	protected Mediator mediator;
    

    // Create a Constructor.
    // --- write your code here ---
    public Person(String name, Mediator mediator) {
    	this.name = name;
    	this.mediator = mediator;
    }
}