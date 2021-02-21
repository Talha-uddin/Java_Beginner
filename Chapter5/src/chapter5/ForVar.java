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
public class ForVar {

    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for (; !done;) {
            if (i == 10) {
                done = true;
            }
            i++;
        }
    }
}
