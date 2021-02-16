/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava.Array;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author DELL
 */
public class SortiingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);
        
        System.out.println("Before Sorting: "+number);
        
        System.out.println("Assending: ");
        Collections.sort(number);
        System.out.println(" "+number);
        
        System.out.println("Desending: ");
        Collections.sort(number,Collections.reverseOrder());
        System.out.println(" "+number);
    }
}
