package pets;

import itf.Pet;

/**
 * Specific class of Pet - Cat
 */
public class Cat implements Pet {

    @Override
    public void bath(String name) {
        System.out.println("Cat: " + name + " -> Taking a bath.");
    }

}