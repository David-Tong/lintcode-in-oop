import java.io.FileReader;
import java.util.Scanner;

import facade.Receptionist;

public class Main {

    public static void main(String[] args) {

        try {
            String inputPath = args[0];
            Scanner sc = new Scanner(new FileReader(inputPath));

            String dog = sc.nextLine();
            String cat = sc.nextLine();
            Receptionist receptionist = new Receptionist();
            receptionist.dogDoBath(dog);
            receptionist.catDoBath(cat);
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}