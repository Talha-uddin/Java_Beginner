/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter4;

/**
 *
 * @author DELL
 */
public class MultiplyByTwo {
    public static void main(String[] args) {
        int i; 
        int num = 0xFFFFFFE;
        
        for(i=0; i<4; i++){
            num = num << 1;
            System.out.println(num);
        }
    }
}
