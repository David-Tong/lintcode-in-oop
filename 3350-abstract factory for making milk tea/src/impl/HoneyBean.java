package impl;

import itf.Material;

public class HoneyBean implements Material {
	
	private final static String material = "Honey Bean Milk Tea";
	
    @Override
    public String getMaterial() {
        // --- write your code here ---
        return material;
    }

}