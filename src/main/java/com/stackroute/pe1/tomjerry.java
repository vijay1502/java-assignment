package com.stackroute.pe1;

import java.util.*;
public class tomjerry {
    public static void main(String[] args){
        System.out.println("Enter an Integer :");
        Scanner sc= new Scanner(System.in);
        int x =sc.nextInt();
        if(x>20&&x<30){
            if(x%2==0){
                System.out.println("jerry");
            }
            else{
                System.out.println("tom");
            }
        }
    }
}
