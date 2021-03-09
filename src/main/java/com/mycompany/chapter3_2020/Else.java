
package com.mycompany.chapter3_2020;


public class Else {

    public static void main(String[] args) {
       
        int hrs = 21;  //current time
        //test 1: 11    //test 3: 15     test 5: 19 
        //test 2: 13    //test 4: 18     test 6: 20
        //test 7: 21 
        
        //Output a greeting depending on the 
        //current time 
        if (hrs < 13)
        {
            System.out.println("Good morning: "+hrs);
        }
        else if (hrs < 18)
        {
            System.out.println("Good Afternoon: "+hrs);
        }
        else if (hrs < 20) 
        {
            System.out.println("Good Evening: "+hrs);
        }
        else
        {
            System.out.println("Goodnight: "+hrs);
        }
        
        
        
    }//end main 
    
}//end class 
