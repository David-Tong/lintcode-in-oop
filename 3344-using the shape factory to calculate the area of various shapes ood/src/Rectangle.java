public class Rectangle implements Shape {

    Integer width;

    Integer height;

    public Rectangle(Integer w, Integer h) {
        // --- write your code here ---
        this.width = w;
        this.height = h;
    }
    
    @Override
    public int shapeArea() {
        // --- write your code here ---
    	return width * height;
    }

    @Override
    public String shapeType() {
        // --- write your code here ---
        return "Rectangle";
    }

}