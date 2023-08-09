package solution2;
public class StockAvailable implements Consumable {
	
	private int stock;
	
	StockAvailable() {
		stock = 3;
	}

    @Override
    public void consume(VendingMachine machine) {
        // write your code here
    	stock--;
    	System.out.println(String.format(
    			"consume succeed: %d remaining", stock));
    	if (stock == 0) {
    		machine.setConsumable(new StockUnavailable());
    	}
    }
}
