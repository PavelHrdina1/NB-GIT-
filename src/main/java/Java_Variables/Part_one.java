package Java_Variables;
/**
 *
 * @author Me
 */
public class Part_one {
    
    public static void main(String[] args){
        
       int lastNumber;
    
         /* Whole numbers (8, 10, 12..) are stored using the int
         variable.(The int stands for integer.)
         
         Floating point numbers like 8.4, 10.5, 12.8, etc, are stored using the 
         double variable. You do the storing with an equals sign ( = )
         */
         
         lastNumber = 10;
         
         /* to store somthing in the variable (lastNumber)
            type equals sign and then the value.
         */
         
         int firstNumber = 12;
         System.out.println("Variables");
         
         // you can do all this on one line
         
         // to see this in action, change println to this
         
         System.out.println(firstNumber + lastNumber);
         
         // Or
         
         System.out.println("first Number = " + firstNumber);
         
         // Output = Variable, 22, first Number = 12
   }
}
