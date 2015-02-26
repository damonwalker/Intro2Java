package stringvars;

import javax.swing.JOptionPane;

public class StringVariables {
    public static void main(String[] args) {
        
    String first_name;
    first_name = JOptionPane.showInputDialog("First Name","Enter Your First Name");
    
    String family_name;
    family_name = JOptionPane.showInputDialog("Family", "Enter Your Family Name");
    
    String full_name;
    full_name = "You are " + first_name + " " + family_name;
    
    JOptionPane.showMessageDialog(null, full_name, "Name", JOptionPane.INFORMATION_MESSAGE);
    System.exit(0);
    }
}
