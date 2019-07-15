package com.stackroute.pe1;

import java.util.*;
public class ConditionBasedOutput {
    public static void main(String[] args){
        System.out.println("Enter an Integer :");
        Scanner scanner= new Scanner(System.in);
        int number =scanner.nextInt();
        ConditionBasedOutput t=new ConditionBasedOutput();
        t.compareCondition(number);
    }

        public String compareCondition(int formalNumber){
        if(formalNumber>20&&formalNumber<30) {
            if (formalNumber % 2 == 0)
                return ("jerry");

            else
                return ("tom");
        }

    else return("The input is not in the given bound");        }
}
