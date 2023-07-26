package impl;

import itf.Material;

public class Coconut implements Material {
	
	private final static String material = "Coconut Milk Tea";
	
    @Override
    public String getMaterial() {
        // --- write your code here ---
        return material;
    }
    
}