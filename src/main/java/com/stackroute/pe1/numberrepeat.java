package com.stackroute.pe1;

import java.util.*;
public class numberrepeat {
    public static void main(String[] args){
        int i,j;
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.println(i);
            }
        }
    }
}
