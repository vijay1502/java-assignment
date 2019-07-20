package com.stackroute.pe1;

import java.util.*;
public class NumberRepeatingSequence {
 /*   public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int totalNumber = scanner.nextInt();
        NumberRepeatingSequence RepeatObject = new NumberRepeatingSequence();
        RepeatObject.repeatingNumberMethod(totalNumber);
    }*/

    public int[] repeatingNumberMethod(int number) {
    int calculate=0;
    int temp=number;
    for(int i=0;i<temp;i++){
        calculate=calculate+number;
    }
        int[] count =new int[calculate];
        for (int i = 1; i <number; i++) {
            for (int j = 1; j <= i; j++) {
                int temporary=(i);
                count[j]=temporary;
                }
        }

             return count;}
    }
