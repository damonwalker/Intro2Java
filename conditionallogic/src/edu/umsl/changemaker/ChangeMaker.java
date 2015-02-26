/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.changemaker;
//import java.text.NumberFormat;
import java.util.*;
public class ChangeMaker 


{

    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your dollar amount: ");
        double amount = sc.nextDouble();
        int remaining = (int)(amount * 100);// casting the expression (amount*100) as an integer
        int D = remaining / 100;
        remaining = remaining % 100;
        int q = remaining / 25;
        remaining = remaining % 25;
        int d = remaining / 10;
        remaining = remaining % 10;
        int n = remaining / 5;
        remaining = remaining % 5;
        int p = remaining;
        
        /*double[ ] aryNums = { .25, .10, .05, .01 };
        
        */
        
//        if (cash>.25){   
//            amount = cash - .25; 
//            q++;
//        }
//        else if (cash > .10){
//            amount = cash - .10;
//            d++;
//           }    
//        else if (cash > .05){
//            amount = cash -.05;
//            n++;
//        }
//        else if (cash > .01){
//            amount = cash - .01;
//            p++;
        System.out.println("Dollars: " + D);
        System.out.println("Quarters: " + q);
        System.out.println("Dimes: " + d);
        System.out.println("Nickels: " + n);
        System.out.println("Pennies: " + p);
        }
}
    


