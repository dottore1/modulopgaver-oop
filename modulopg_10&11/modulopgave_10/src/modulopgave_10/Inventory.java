package modulopgave_10;

import java.util.ArrayList;

public class Inventory {

    private final ArrayList<Item> items = new ArrayList<>();

    public Inventory(Item item) {
        items.add(item);
    }
   

    public void addItem(Item item) {
        items.add(item);

    }

    public void removeItme(Item item) {
        items.remove(item);
    }

    public double getInventoryValue() {
        double totalvalue = 0;
        for (Item item : items) {
            totalvalue += Double.parseDouble(item.getPrice());
        }
        
        return totalvalue;
    }

    public void printInventory() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
}
