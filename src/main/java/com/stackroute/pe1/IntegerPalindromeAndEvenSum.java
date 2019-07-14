package com.stackroute.pe1;

import java.util.*;
public class IntegerPalindromeAndEvenSum {
    public static void main(String[] args){

        System.out.println("Enter an Integer :");
        Scanner scanner = new Scanner(System.in);
        int palindromeNumber = scanner.nextInt();
        IntegerPalindromeAndEvenSum palindromeObject= new IntegerPalindromeAndEvenSum();
        palindromeObject.palindromeAndSumMethod(palindromeNumber);
    }
    public int palindromeAndSumMethod(int formalNumber){
    int temporary,reminder,sum=0,reverse=0;
        while(formalNumber>0){
            reminder=formalNumber%10;
            if(reminder%2==0) {
                sum = sum + reminder;
            }
            reverse=(reverse*10)+reminder;
            formalNumber=formalNumber/10;
        }
        temporary=formalNumber;
        if(reverse==temporary){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome ");
        }
        System.out.println("Sum of even Numbers is"+sum);
        return temporary;
    }}

