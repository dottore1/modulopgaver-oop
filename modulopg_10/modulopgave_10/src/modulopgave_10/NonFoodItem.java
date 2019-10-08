package modulopgave_10;

import java.util.Arrays;

public class NonFoodItem extends Item {
   private String[] materials;
   
   public NonFoodItem(String name, double price, String[] materials){
       super(name, price);
       this.materials = materials;
   }
    
   public String[] getMaterials(){
       return this.materials;
   }
   @Override
   public String toString(){
       String text = ("Name: " + super.getName() + ", Price: " +  super.getPrice() + ", Materials: " + Arrays.toString(this.getMaterials()));
       return text;
   }
    
}
