/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamidlevel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author DELL
 */
public class CurrentDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        
        DateFormat dateformat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateformat.format(date);
        System.out.println("Current Date: "+currentDate);
    }
}
