import factory.AbstractFactory;
import itf.Material;
import itf.Sugar;

import java.io.FileReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
        	/*
            String inputPath = args[0];

            String m = "";
            int s = 0;
            Scanner sc = new Scanner(new FileReader(inputPath));
            if (sc.hasNextLine()) {
                m = sc.nextLine();
            }
            if (sc.hasNextInt()) {
                s = sc.nextInt();
            }*/
        	
        	String m = "Pearl";
        	int s = 3;

            AbstractFactory materialFactory = Solution.setFactory("MaterialFactory");
            AbstractFactory sugarFactory = Solution.setFactory("SugarFactory");
            assert materialFactory != null;
            Material material = materialFactory.setMaterial(m);
            assert sugarFactory != null;
            Sugar sugar = sugarFactory.setSugar(s);

            System.out.println("Ordered A " + material.getMaterial() + " with " + sugar.getSugar() + ".");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}