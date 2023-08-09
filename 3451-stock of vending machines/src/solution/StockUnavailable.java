package solution;

public class StockUnavailable implements Consumable {

    private int cooldown;

    StockUnavailable() {
        this.cooldown = 3;
    }

    @Override
    public void consume(VendingMachine machine) {
        // write your code here
    	System.out.println(String.format(
    			"consume failed: stock is empty, waiting for cooldown: %d", cooldown));
    	cooldown--;
    	if (cooldown == 0) {
    		machine.setConsumable(new StockAvailable());
    		machine.stock = 3;
    	}
    }
}
