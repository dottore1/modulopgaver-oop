package opgave14;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Opgave14 {

    public static void main(String[] args) throws FileNotFoundException {
        File myfile = new File("C:\\Users\\Nichlas\\Desktop\\helloworld1.csv");
        Scanner reader;
        PrintWriter writeradd;
        PrintWriter writerdelete;
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        try {
            //read document, split each element in sequence by ","
            reader = new Scanner(myfile).useDelimiter(",");

            while (reader.hasNext()) {
                list.add(reader.next());
            }

            System.out.println("Your file has " + list.toString());

            reader.close();
            //What to do?
            System.out.println("what do you want to:\n0. delete\n1. add");
            int todo = input.nextInt();
            
            
            writerdelete = new PrintWriter(myfile);
            //delete
            if (todo == 0) {
                System.out.println("what index do you want to delete?");
                for (String items : list) {
                    System.out.println(list.indexOf(items) + "." + " " + items);
                }
                int delete = input.nextInt();

                list.remove(delete);

                for (int k = 0; k < list.size(); k++) {
                    if (k == list.size() - 1) {
                        writerdelete.print(list.get(k));

                    } else {
                        writerdelete.print(list.get(k) + ",");
                    }
                }

                writerdelete.close();

                System.out.println("Your file now consist: " + list.toString());
                
                //add
            } else {

                writeradd = new PrintWriter(myfile);
                System.out.println("What do you want to add?");
                String add = input.next();
                System.out.println("At what index?");
                for(String item : list){
                    System.out.println(list.indexOf(item) + "." + " " + item);
                }
                int index1 = input.nextInt();
                list.add(index1, add);
                for (int i = 0; i < list.size(); i++) {
                    if (i == list.size() - 1) {

                        writeradd.print(list.get(i));
                    } else {
                        writeradd.print(list.get(i) + ",");
                    }
                }

                System.out.println("Your file now consists" + list.toString());

                writeradd.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Opgave14.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("File not found");
        }

    }
    
        
    
}
