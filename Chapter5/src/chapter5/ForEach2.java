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
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int x: num){
            System.out.println("Value is: "+x);
            sum += x;
            if(x == 5)
                break;
        }
        System.out.println("Synnatiob of the first 5 number: "+sum);
    }
}
