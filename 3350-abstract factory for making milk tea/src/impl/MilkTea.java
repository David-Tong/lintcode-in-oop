package impl;

import itf.Material;

public class MilkTea implements Material {
	
	private final static String material = "Milk Tea";
	
    @Override
    public String getMaterial() {
        // --- write your code here ---
        return material;
    }
    
}