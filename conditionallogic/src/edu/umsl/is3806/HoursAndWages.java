/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl.is3806;


public class HoursAndWages 
{
    public static void main(String agrs[]) 
    {
double hours;
double rate;
double ot;
double wages;

hours = 45;
rate = 10;
ot = hours - 40;
wages = hours * rate + (ot * rate * 1.5);

System.out.println("Your wages are: " + wages);
        
    }
}

