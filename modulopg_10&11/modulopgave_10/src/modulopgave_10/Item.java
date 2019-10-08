package modulopgave_10;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;

        this.price = price;

    }

    public String getName() {
        return this.name;
    }

<<<<<<< HEAD:modulopg_10/modulopgave_10/src/modulopgave_10/Item.java
    public double getPrice() {
        return this.price;
=======
    public String getPrice() {

        return String.valueOf(price);
>>>>>>> 021b4a242bc05040f84cf6750f20ae79241398f3:modulopg_10&11/modulopgave_10/src/modulopgave_10/Item.java
    }

}
