
package com.mycompany.chapter3_2020;


public class While {

  
    public static void main(String[] args) {
       
        //initialise the counter for our while loop
        int num =-200;  //num = 100 
        
        //while loop to display the num
        //variable's current value while it remains
        //above zero
        while (num>0) 
        {
            System.out.println("While Countdown: "+num);
            num -=10;  // num = num -10
        } //end while       
                
    } //end main 
    
} //end class
