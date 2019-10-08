package modulopgave_10;

import java.util.*;

public class Modulopgave_10 {

    public static void main(String[] args) {

        FoodItem fi = new FoodItem("Banana", 9.95, new Date());
        FoodItem fi1 = new FoodItem("grapes", 12.95, new Date());
        NonFoodItem nfi = new NonFoodItem("T-shirt", 199.95, "small");
        NonFoodItem nfi1 = new NonFoodItem("Jeans", 199.95, "small");
        nfi.addMaterials("Medium");
        nfi.addMaterials("Latge");

        Inventory in = new Inventory(fi);
        System.out.println("------------------------------");
        System.out.println("Test of ValueOfInventory");
        System.out.println("------------------------------");

        System.out.println(in.getInventoryValue());
        in.addItem(nfi);
        in.addItem(nfi1);
        in.addItem(fi1);
        System.out.println(in.getInventoryValue());
        System.out.println("------------------------------");
        System.out.println("Test of PrintInventory");
        System.out.println("------------------------------");

        in.printInventory();
        System.out.println("------------------------------");
        System.out.println("Test of toString() at NonFoodItem");
        System.out.println("------------------------------");

        System.out.println(nfi.toString());

        /*
        Date expire = new Date(10000000);
        FoodItem fi = new FoodItem("Banan", 100, expire);

        String[] materials = {"Twix", "Nars", "Bounty", "KitKat"};

        NonFoodItem nfi = new NonFoodItem("Chokolade", 199, materials);

        System.out.println(nfi.toString());
        System.out.println("---------------");

        //opgave 2
        FoodItem[] foods = new FoodItem[10];

        for (int i = 0; i < foods.length; i++) {
            String name = "Food" + i;
            FoodItem food = new FoodItem(name, 199, new Date(119, 9, i + 9));

            if (foods[i] == null) {
                foods[i] = food;

            } else {
                break;

            }

        }
        for (FoodItem food : foods) {
            if (food != null) {
                System.out.println(food.toString());
            }
        }

        System.out.println("--------------");
        //opgave 3 
        NonFoodItem[] nonfoods = new NonFoodItem[10];
        for (int i = 0; i < nonfoods.length; i++) {
            String name = "NonFood " + i;
            double price = i + 5 * i + 5 * i;
            String[] items = {"Small", "Medium", "Large"};
            NonFoodItem nonfood = new NonFoodItem(name, price, items);

            if (nonfoods[i] == null) {
                nonfoods[i] = nonfood;
            } else {
                break;
            }

        }
        for (NonFoodItem nonfood : nonfoods) {
            if (nonfood != null) {
                System.out.println(nonfood.toString()); 
            }
        }
    
         */
    }
}
