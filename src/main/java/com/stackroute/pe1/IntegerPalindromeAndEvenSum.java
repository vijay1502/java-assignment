package com.stackroute.pe1;

import java.util.*;
public class IntegerPalindromeAndEvenSum {
    /*public static void main(String[] args){
        int number,temporary,reverse;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        number=sc.nextInt();
        temporary=number;
        reverse=palindromeOrNot(number);
        if(reverse==temporary)
            System.out.println(temporary+" is a palindrome number ");
        else
            System.out.println(temporary+" is not a palindrome number ");
    }*/
   public String palindromeChecker(int num) {
       String palindromeCheck="";
        int reverse=0,reminder;
        int temporary=num;
        while(num>0)
        {
            reminder=num%10;
            reverse =(reverse*10)+reminder;
            num/=10;
        }
        if(temporary==reverse) {
            palindromeCheck="Given number is a palindrome";
        }

          else { palindromeCheck= "Given number is not a palindrome";
        }

return palindromeCheck;
    }

public int evenNumberSum(int number){
        int reminder,sum=0;
        while (number>0){
        reminder=number%10;
        if(reminder%2==0){
            sum=sum+reminder;
        }
        number=number/10;
        }

return sum;}}

