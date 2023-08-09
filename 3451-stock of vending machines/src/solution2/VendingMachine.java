package solution2;
public class VendingMachine {

    Consumable consumable;

    VendingMachine() {
        // write your code here
    	this.consumable = new StockAvailable();
    }
    
    public void setConsumable(Consumable newConsumable) {
    	consumable = newConsumable;
    }

    public void consume() {
        // write your code here
    	consumable.consume(this);   	
    }
}
