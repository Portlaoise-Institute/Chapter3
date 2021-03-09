
package com.mycompany.chapter3_2020;


public class Switch {


    public static void main(String[] args) {

        // Feb 2018 
        int month = 2, year =2018, num =31;
        
        //Output how many days are in the month
        switch (month)
        {
            //April, June, Sept, Nov
            case 4: case 6: case 9: case 11:
                num = 30;
                break;
            //Feb
            case 2:
                // year =2018
                // year%4 ->>  2018%4 = 2 (remainder)
                // 2 == 0 -->  false
                // num =28 
                num = (year % 4 == 0) ? 29 : 28;
                break; 
            //Jan, March, May, July, Aug, Oct, Dec
            case 1: case 3: case 5: case 7: case 8:
            case 10: case 12: 
                num=31;
                break;
            default: 
                System.out.println("Error "
                        + "incorrect month!");
        } //end switch statement 
        
        
        //Only output this line of code if 
        //the month is between 1 and 12 inclusive 
        if (month>=1 && month <=12) 
        {
            //Output the month, year and num days
            System.out.println(month+"/"+year+": "+num+" days");
        } //end if 

    } //end main 
} //end class 
