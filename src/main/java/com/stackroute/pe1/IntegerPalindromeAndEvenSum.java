package com.stackroute.pe1;

import java.util.*;
public class IntegerPalindromeAndEvenSum {
    public static void main(String[] args){
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
    }
   public static int  palindromeOrNot(int num )
    {
        int reverse=0,reminder;
        while(num!=0)
        {
            reminder=num%10;
            reverse =(reverse*10)+reminder;
            num/=10;
        }
        return reverse;

    }

public int palindromeSum(int number){
        int reminder,sum=0;
        while (number>0){
        reminder=number%10;
        if(reminder%2==0){
            sum=sum+reminder;
        }
        number=number/10;
        }

return sum;}}

