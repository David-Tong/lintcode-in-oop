package impl;

import abs.Coffee;

public class SimpleCoffee implements Coffee {

    /**
     * Cost of a regular cup of coffee
     * @return cost
     */
    @Override
    public double getCost() {
        // --- write your code here ---
        return 2;
    }

    /**
     * Get Ingredients of a cup of coffee
     * @return "Plain Coffee"
     */
    @Override
    public String getIngredients() {
        // --- write your code here ---
        return "Plain Coffee";
    }
}
