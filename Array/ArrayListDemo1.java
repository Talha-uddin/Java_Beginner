/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigginerjava.Array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DELL
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        
        //adding element
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3,40);
        
        //System.out.println(number);
        for(int x : number){
            System.out.print(" "+x);
        }
        /*Iterator itr = number.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }*/
        System.out.println();
        System.out.println("size = "+number.size());
        
        //removing elements
        number.remove(2);
        System.out.println("After removing Arraylist contains: "+number);
        
        /*number.removeAll(number);
        System.out.println("After removing all: "+number);*/
        number.clear();
        System.out.println("After clear ArrayList cotains: "+number);
    }   
     
}
