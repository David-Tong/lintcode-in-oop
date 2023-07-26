package impl;

import itf.Material;

public class Pearl implements Material {
	
	private final static String material = "Pearl Milk Tea";
	
    @Override
    public String getMaterial() {
        // --- write your code here ---
    	return material;
    }

}