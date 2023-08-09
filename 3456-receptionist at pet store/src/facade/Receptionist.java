package facade;

import pets.Dog;
import pets.Cat;

/**
 * Receptionist at a pet center
 * Providing cat/dog bathing services to customers
 */
public class Receptionist {

    private final Dog dog;

    private final Cat cat;

    /**
     * When constructing, you need to initialize the Dog and Cat objects above.
     */
    public Receptionist() {
        // --- write your code here ---
    	this.dog = new Dog();
    	this.cat = new Cat();
    }

    /**
     * Bathing the dog specified by the client
     * @param name The name of a dog
     */
    public void dogDoBath(String name) {
        // --- write your code here ---
        dog.bath(name);
    }

    /**
     * Bathing the cat specified by the client
     * @param name The name of a cat
     */
    public void catDoBath(String name) {
        // --- write your code here ---
        cat.bath(name);
    }

}