package factory;

import impl.*;
import itf.*;

public class SugarFactory extends AbstractFactory {

    private final static int _THREE = 3;
    private final static int _FIVE = 5;
    private final static int _TEN = 10;

    // --- write your code here ---
    @Override
    public Sugar setSugar(int sugar) {
    	if (sugar == _THREE) {
    		return new ThreePoint();
    	} else if (sugar == _FIVE) {
    		return new FivePoint();
    	} else if (sugar == _TEN) {
    		return new TenPoint();
    	} else {
    		return new TenPoint();
    	}
    }

	@Override
	public Material setMaterial(String material) {
		// TODO Auto-generated method stub
		return null;
	}

}