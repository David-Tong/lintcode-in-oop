public class Round implements Shape{

    Integer r;

    private static final int PI = 3;

    public Round(Integer r) {
        // --- write your code here ---
        this.r = r;
    }
    
    @Override
    public int shapeArea() {
        // --- write your code here ---
    	return PI * r * r;
    }

    @Override
    public String shapeType() {
        // --- write your code here ---
        return "Round";
    }

}