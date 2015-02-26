/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * * @author Colin
 */
package edu.umsl.kbdinput;
import java.util.*;
public class ASG4

{
   public static void main(String [] args) 
   {
	int  input;
        int sumA;
        int sumB;
        int sumC;
        int sumD;
        int sumF;
	sumA=sumB=sumC=sumD=sumF=0;
	
        System.out.println("Please enter your grade [ e.g. 75, 95 etc.... -99 to quit]:");
	Scanner kbd = new Scanner(System.in);
	input = kbd.nextInt();
        System.out.println(input);

	if(input==-99) System.exit(1);

	while(input != -99){

            if(input>=90){
                ++sumA;
                System.out.println(input + "      A");
	    }
            else if(input >= 70){
                ++sumB;
                System.out.println(input + "      B");
            }
            else if(input >= 50){
                ++sumC;
                System.out.println(input + "      C");
            }
            else if(input >= 35){
                ++sumD;
                System.out.println(input + "      D");
            }
            else{
                ++sumF;
                System.out.println(input + "      F");
            }
            System.out.print("Please enter another grade [-99 to quit]:");
            input = kbd.nextInt();
        }
        
        System.out.println("The total number of A's is " + sumA);
        System.out.println("The total number of B's is " + sumB);
        System.out.println("The total number of C's is " + sumC);
        System.out.println("The total number of D's is " + sumD);
        System.out.println("The total number of F's is " + sumF);
   } 
}

