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
public class NoBody {

    public static void main(String[] args) {
        int i, j;

        i = 100;
        j = 200;

        while (++i < --j);
        System.out.println("Midpoint is " + i);
    }
}
