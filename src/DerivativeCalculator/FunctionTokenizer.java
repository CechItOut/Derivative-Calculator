package DerivativeCalculator;


import java.util.*;
import javax.swing.*;
public class FunctionTokenizer 
{
    public FunctionTokenizer(String function)
    {
        String thistoken;
        Stack<Double> derivative = new Stack();
        
        StringTokenizer tokens = new StringTokenizer(function);
    
       //arrange string in postfix notation
       //although we will arrange the string as a binary tree later,
       //this will make it so that each parent in the tree is a function
    while (tokens.hasMoreTokens())
    {
        thistoken = tokens.nextToken();
        
        switch (thistoken)
        {
            case "+":
                
            
                
                if (derivative.size() == 1)
                {
                    JOptionPane.showMessageDialog(null, 
                            "Error:\nToo many operators "
                            + "and not enough operators.", thistoken, 1);
                }
                
                break;
            
            
            default: break;
        }
        
    }
        System.out.println("Test");
    }
}
