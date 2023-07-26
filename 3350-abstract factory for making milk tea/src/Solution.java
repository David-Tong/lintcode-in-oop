import factory.*;

public class Solution {

    public static AbstractFactory setFactory(String fa) {

        // --- write your code here ---
        if (fa.equals(AbstractFactory._MATERIAL_FACTORY)) {
        	return new MaterialFactory();
        } else if (fa.equals(AbstractFactory._SUGAR_FACTORY)) {
        	return new SugarFactory();
        } else {
        	return null;
        }
    }

}