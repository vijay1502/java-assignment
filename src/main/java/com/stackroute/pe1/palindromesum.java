package com.stackroute.pe1;

import java.util.*;
public class palindromesum {
    public static void main(String[] args){

        System.out.println("Enter an Integer :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        palindromesum c= new palindromesum();
        c.palindromeChecker(a);
    }
    public int palindromeChecker(int b){
    int temp,rem,sum=0,x=0;
        while(b>0){
            rem=b%10;
            if(rem%2==0) {
                sum = sum + rem;
            }
            x=(x*10)+rem;
            b=b/10;
        }
        temp=b;
        if(x==temp){
            System.out.println("It is a Palindrome");
        }
        else{
            System.out.println("It is not a palindrome ");
        }
        System.out.println("Sum of even Numbers is"+sum);
        return temp;
    }}

