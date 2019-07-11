package com.stackroute.pe1;

import java.util.*;
public class palindromesum {
    public static void main(String[] args){
        int x=0,temp,rem,sum=0;
        System.out.println("Enter an Integer :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        temp=a;
        while(a>0){
            rem=a%10;
            if(rem%2==0) {
                sum = sum + rem;
            }
            x=(x*10)+rem;
            a=a/10;
        }
        if(x==temp){
            System.out.println(temp +" is  a Palindrome");
        }
        else{
            System.out.println(temp+" is not a palindrome ");
        }
        System.out.println("Sum of even Numbers is"+sum);
    }
}
