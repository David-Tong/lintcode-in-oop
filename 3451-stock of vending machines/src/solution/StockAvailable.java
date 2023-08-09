package solution;

public class StockAvailable implements Consumable {

    @Override
    public void consume(VendingMachine machine) {
        // write your code here
    	machine.stock--;
    	System.out.println(String.format(
    			"consume succeed: %d remaining", machine.stock));
    }
}
