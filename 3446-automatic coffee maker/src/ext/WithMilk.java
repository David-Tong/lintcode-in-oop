package ext;

import abs.Coffee;
import abs.CoffeeDecorator;

public class WithMilk extends CoffeeDecorator {

    /**
     */
    public WithMilk(Coffee coffee) {
        // --- write your code here ---
    	super(coffee);
    }

    /**
     * get total cost. Each additional serving of milk requires an increase of 0.5
     * @return cost += 0.5
     */
    @Override
    public double getCost() {
        // --- write your code here ---
        return super.getCost() + 0.5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Milk";
    }
}
