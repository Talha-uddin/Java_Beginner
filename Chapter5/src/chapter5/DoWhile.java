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
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        
        do{
            System.out.println("tick "+n);
            n--;
        }while(n>0);
    }
}
