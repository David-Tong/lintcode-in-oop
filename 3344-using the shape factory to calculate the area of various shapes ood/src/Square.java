public class Square implements Shape {

    Integer width;

    public Square(Integer w) {
        // --- write your code here ---
        this.width = w;
    }

    @Override
    public int shapeArea() {
        // --- write your code here ---
    	return width * width;
    }

    @Override
    public String shapeType() {
        // --- write your code here ---
        return "Square";
    }

}