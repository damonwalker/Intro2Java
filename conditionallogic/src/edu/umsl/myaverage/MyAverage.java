package edu.umsl.myaverage;


import java.util.*;
public class MyAverage 
{

    /**
     *
     * @param args 
     */
    public static void main(String args[])
    
{
    
{
     int num;
     int count = 0;
     int total = 0;
    
     Scanner kbd = new Scanner(System.in);
     
     do {
          System.out.print("Enter a whole number, and -99 to quit: ");
          num = kbd.nextInt();
          if(num!= -99)
          {// accept input
          count++; // increment counter 
          total += num; //accumulate the sum \
          }
        } while (num != -99); // test the condition
     float average = (float) total/count;
     System.out.println("You keyed in " + count + " numbers \n");
     System.out.println("The average  is: " + average);
}
}
}
