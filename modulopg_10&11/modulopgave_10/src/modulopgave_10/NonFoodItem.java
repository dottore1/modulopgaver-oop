package modulopgave_10;

import java.util.ArrayList;
import java.util.Arrays;

public class NonFoodItem extends Item {

    private final ArrayList<String> materials = new ArrayList<String>();

    public NonFoodItem(String name, double price, String material1) {
        super(name, price);
        this.materials.add(material1);

    }

    public void addMaterials(String material) {
        this.materials.add(material);
    }

    public ArrayList getMaterials() {

        return this.materials;
    }

    @Override
    public String toString() {
        String text = ("Name: " + super.getName() + ", Price: " + super.getPrice() + ", Materials: " + this.materials.toString());
        return text;
    }

}
