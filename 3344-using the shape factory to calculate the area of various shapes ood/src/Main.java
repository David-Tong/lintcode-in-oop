import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            String inputPath = args[0];
            Scanner sc = new Scanner(new FileReader(inputPath));
            String shape = sc.nextLine();
            Integer[] params = new Integer[2];
            params[0] = sc.nextInt();
            if (sc.hasNextInt()) {
                params[1] = sc.nextInt();
            }
            ShapeFactory sf = new ShapeFactory();
            Shape s = sf.setShape(shape, params);
            System.out.println("Shape is: " + s.shapeType() + ".");
            System.out.println("Area is: " + s.shapeArea() + ".");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}