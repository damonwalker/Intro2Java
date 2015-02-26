
package conditionallogic;
import java.text.NumberFormat;
import java.util.*;
public class IFStatements 

{
    
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
                
        System.out.print("Enter your hours worked: ");
        double hours = kb.nextInt();
//        String user = hours;
        System.out.print("Please enter your wage rate: ");
        double rate = kb.nextInt();
        
        double overtime_hours = rate * 1.5;
        
        if(hours <= 40) 
        {
            System.out.println("Your wages are " + rate * hours);
        }
        else if (hours > 40) {
            Locale mylocale = new Locale("en","US");
            Currency mycurrency = Currency.getInstance(mylocale);
            NumberFormat nf = NumberFormat.getCurrencyInstance(mylocale);
            System.out.println("Your wages are " + nf.format(rate * 40) + " Overtime hours " + nf.format(overtime_hours * (hours-40)));
        }
//        else if (user > 18 && user < 40){
//            System.out.println("User is between than 19 and 39");
//                }
//        else{
//            System.out.println("User is older than 40");
//        switch (user){
//            case 18:
//                System.out.println("You're 18");
//                break;
//            case 19: 
//                System.out.println("You're 19");
//                break;
//            case 20:
//                System.out.println("You're 20");
//                break;
//            default:
//                System.out.println("You're not 18, 19, or 20");
      
    }
       
    
}
