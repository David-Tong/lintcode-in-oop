package factory;

import impl.*;
import itf.*;

public class MaterialFactory extends AbstractFactory {

    private final static String _PEARL = "Pearl";
    private final static String _COCONUT = "Coconut";
    private final static String _HONEY_BEAN = "HoneyBean";

    // --- write your code here ---
    @Override
    public Material setMaterial(String material) {
    	if (material.equalsIgnoreCase(_PEARL)) {
    		return new Pearl();
    	} else if (material.equalsIgnoreCase(_COCONUT)) {
    		return new Coconut();
    	} else if (material.equalsIgnoreCase(_HONEY_BEAN)) {
    		return new HoneyBean();
    	} else {
    		return new MilkTea();
    	}
    }

	@Override
	public Sugar setSugar(int sugar) {
		return null;
	}

}