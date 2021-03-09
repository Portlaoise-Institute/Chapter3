package com.mycompany.chapter3_2020;

public class DoWhile {
  
    public static void main(String[] args) {

        //declare and init. counter variable
        int num =100; 
        
        //Output the current value of the counter
        //while it is below 10 
        
        //DO While will always execute at least
        //once whereas the while loop may/may not execute 
        
        do 
        {
            System.out.println("DoWhile Countup: "+num);
            num+=10;  // num = num + 10
        } 
        while (num<10);  // 110 <10 --> false 
        
        // 1. first iteration of the loop - num value =100 -->110
        // 2. because num (110) > 10 no second iteration of loop 
        
    } //end main 
    
} //end class 
