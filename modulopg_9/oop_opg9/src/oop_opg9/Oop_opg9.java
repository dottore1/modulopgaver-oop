
package oop_opg9;

import java.util.*;

public class Oop_opg9 {

    public static void main(String[] args) {
        Fan fn = new Fan();
        Fan fn1 = new Fan("Yellow", 10.0, true, 2);
        Date time = new Date();

        System.out.println(fn1.toString(time));

    }

}
