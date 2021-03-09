
package com.mycompany.chapter3_2020;


public class For {


    public static void main(String[] args) {
      
        //Declare and initialise an integer variable
        //to count the total overall number of iterations 
        
        int num = 0;
        
        //Add a for loop to perform 3 iterations 
        //Display the current value of its counter variable i
        //for each iteration of the loop
        for (int i=1; i<4; i++)
        {
            System.out.println("Outer Loop i= "+i);
                
            //Insert a nested for loop to also perform
            //three iterations, display the current value of its
            //counter variable j and total overall number of iterations 
            for (int j=1; j<4; j++)
            {
                System.out.println("\tInner Loop j= "+j);
                System.out.println("\t\tTotal num= "+ (++num));
            } //end of inner for loop 
            
        } //end outer for loop
        
    } //end main 
    
} //end class 
