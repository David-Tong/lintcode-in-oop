package abs;

public class CoffeeDecorator implements Coffee {

    protected final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        // --- write your code here ---
        return coffee.getCost();
    }

    @Override
    public String getIngredients() {
        // --- write your code here ---
        return coffee.getIngredients();
    }
}
