/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author DELL
 */
public class ForEachSearch {
    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int value = 5;
        
        boolean found = false;
        
        for(int x : nums){
            if(x == value){
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Value found!");
    }
}
