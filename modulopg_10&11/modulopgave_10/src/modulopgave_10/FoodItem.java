package modulopgave_10;

import java.util.*;

public class FoodItem extends Item {

    private Date expires;

    public FoodItem(String name, double price, Date expire) {
        super(name, price);
        this.expires = expire;

    }

    public Date getExpires() {
        return this.expires;
    }

    @Override
    public String toString() {
        String text = ("Name: " + super.getName() + ", Price: " + super.getPrice() + ", Expires: " + this.expires);
        return (text);
    }
}
