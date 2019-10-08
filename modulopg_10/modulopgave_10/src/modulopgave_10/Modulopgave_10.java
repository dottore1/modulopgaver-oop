package modulopgave_10;

import java.util.*;

public class Modulopgave_10 {

    public static void main(String[] args) {
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
        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null) {
                System.out.println(foods[i].toString());
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
        for (int i = 0; i < nonfoods.length; i++) {
            if (nonfoods[i] != null) {
                System.out.println(nonfoods[i].toString());
            }
        }
        Object[] ob = new Object[10];
    }

}
