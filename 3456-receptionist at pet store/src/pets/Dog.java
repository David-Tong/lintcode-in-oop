package pets;

import itf.Pet;

/**
 * Specific class of Pet - Dog
 */
public class Dog implements Pet {

    @Override
    public void bath(String name) {
        System.out.println("Dog: " + name + " -> Taking a bath.");
    }

}