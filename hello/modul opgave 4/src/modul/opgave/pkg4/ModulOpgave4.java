package modul.opgave.pkg4;

import java.util.Scanner;

public class ModulOpgave4 {

    public static void main(String[] args) {
         //number generator for array
                int[][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for(int x = 0 ; x < 9; x++){
                array[i][x] = (int)(Math.random() * 9 + 1);
            }
        }
        // output area
        for (int j = 0; j < 9; j++) {
            System.out.println();
            for (int k = 0; k < 9; k++) {
                System.out.print(array[j][k]);
            }
       
    }
       for(int row=0;row<9;row++)
      for(int col=0;col<8;col++)
      if(array[row][col]==array[row][col+1]){
      return;}
     //Verifies rows

    for(int col2=0;col2<9;col2++)
      for(int row2=0;row2<8;row2++)
      if (array[row2][col2]==array[row2+1][col2])
      System.out.println
    //verifies columns

    
       
       
   }
}

















/*

        Scanner line = new Scanner(System.in);
        System.out.println("Enter index of a random month: ");
        int monthIndex = line.nextInt();
        
        int[] days_month = {30,28,31,30,31,30,31,30,31,30,31,30};
        System.out.println(days_month[monthIndex]);

*/
/*
        double[] array = {21.5, 23.7, 19.5, 22.5, 25.3, 21.7, 18.9};

        for (int i = 0; i < 7; i++) {
            int k = 1;
            double differenceTempature = Math.abs(array[k] - array[i]);
            System.out.println(differenceTempature);
            k++;
            if (k == 8) {
                break;
            }
        }
 */
 /*
         
         
   
                     int[][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for(int x = 0 ; x < 9; x++){
                array[i][x] = x + 1;
                System.out.println(array[i][x]);
            }
        }
 */
 /*
            int[][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for(int x = 0 ; x < 9; x++){
                array[i][x] = x + 1;
            }
        }

        for (int j = 0; j < 9; j++) {

            for (int k = 0; k < 9; k++) {
               
                System.out.println(array[j][k]);
            }
        }
 */
 /*
  public static void main(String[] args) {
        int[] radius = {1, 3, 5};
        for (int i : radius) {
            double area = (i * i) * Math.PI;
            System.out.println("The area computed " + area + " with a radius of " + i);
        }

 */
 /*
        int[][] array = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for(int x = 0 ; x < 9; x++){
                array[i][x] = x + 1;
            }
        }

        for (int j = 0; j < 9; j++) {

            for (int k = 0; k < 9; k++) {
                System.out.println(array[j][k]);
            }
        }
 */
 /*
        int array_length = 12;
        int[] array = new int[12];

        for (int i = 0; i < array.length; i += 1) {
            array[i] = (int) (Math.random() * 100);

        }
        for (int a : array) {
            if (a % 3 == 0) {
                System.out.println(a + " The number is in 3 tabellen");

                
            } else {
                System.out.println(a + " The number is not in 3 tabellen");
            }
        }
 */
 /*
            for (int i : array){
                if (i >= value) {
                    System.out.println(i);
                    
         
    }
}
 */

 /*
        // opgave 1 
        int[] hiArray = {12, 44, 55, 12, 55, 66, 99, 1, 2, 4};
        int maxInt = hiArray[0];
        for (int i : hiArray) {
            if (i > maxInt) {
                maxInt = i;
            }
        }
        System.out.println(maxInt);
 */
