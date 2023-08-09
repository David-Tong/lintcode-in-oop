import abs.Coffee;

import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            String inputPath = args[0];
            Scanner sc = new Scanner(new FileReader(inputPath));

            int milk = sc.nextInt();
            int sugar = sc.nextInt();

            CoffeePack pack = new CoffeePack(milk, sugar);
            Coffee coffee = Solution.makeCoffee(pack);

            System.out.println("Cost for this coffee is: " + coffee.getCost());
            System.out.println("Ingredients for this coffee is: " + coffee.getIngredients());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}