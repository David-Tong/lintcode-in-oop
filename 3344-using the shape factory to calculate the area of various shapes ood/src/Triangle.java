public class Triangle implements Shape {

    Integer base;

    Integer height;

    public Triangle(Integer b, Integer h) {
        // --- write your code here ---
        this.base = b;
        this.height = h;
    }

    @Override
    public int shapeArea() {
        // --- write your code here ---
    	return base * height / 2;
    }

    @Override
    public String shapeType() {
        // --- write your code here ---
        return "Triangle";
    }

}