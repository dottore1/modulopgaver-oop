package modul.opgave.pkg4;

public class ModulOpgave4 {

    public static void main(String[] args) {
    int[] radius = {1,3,5};
    for(int i : radius){
        double area = (i*i)*Math.PI; 
        System.out.println(area);
    }
       

    }
}
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
