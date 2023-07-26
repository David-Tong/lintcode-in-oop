package factory;

import itf.*;

public abstract class AbstractFactory {

    public final static String _MATERIAL_FACTORY = "MaterialFactory";

    public final static String _SUGAR_FACTORY = "SugarFactory";

    // --- write your code here ---
    public abstract Material setMaterial(String material);
    
    public abstract Sugar setSugar(int sugar);

}