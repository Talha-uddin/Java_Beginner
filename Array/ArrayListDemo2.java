/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava.Array;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        System.out.println("ArrayList contains: "+number);
        System.out.println();
        System.out.println("size = "+number.size());
        
        //check the list is empty or not
        boolean check = number.isEmpty();
        System.out.println("ArrayList empty: "+check);
        
        //check if the list contains given value
        boolean contain = number.contains(30);
        System.out.println("30 is in the list"+contain);
        
        // finding index
        int pos = number.indexOf(40);
        System.out.println("The index of 40 is "+pos);
        
        //replace the numebr from list
        number.set(3, 50);
        System.out.println("After setting : "+number);
        
        //find the index 
        int x = number.get(0);
        System.out.println("index 0 = "+x);
    }
}
