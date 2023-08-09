public class ShapeFactory {

    public Shape setShape(String type, Integer[] params) {
        // --- write your code here ---
    	if (type.equals("Rectangle")) {
    		return new Rectangle(params[0], params[1]);
    	} else if (type.equals("Round")) {
    		return new Round(params[0]);
    	} else if (type.equals("Square")) {
    		return new Square(params[0]);
    	} else if (type.equals("Triangle")) {
    		return new Triangle(params[0], params[1]);
    	} else {
    		return null;
    	}
    }

}