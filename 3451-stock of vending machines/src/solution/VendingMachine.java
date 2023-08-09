package solution;

public class VendingMachine {

    int stock;
    Consumable available;

    VendingMachine() {
        // write your code here
    	this.stock = 3;
    	this.available = new StockAvailable();
    }
    
    public void setConsumable(Consumable newConsumable) {
    	available = newConsumable;
    }

    public void consume() {
        // write your code here
    	if (available instanceof StockAvailable && stock == 0) {
    		setConsumable(new StockUnavailable());
    	}
    	available.consume(this);   	
    }
}
