package com.stackroute.pe1;
import java.util.*;
public class reversestring{
    public static void main(String[] args){
        String x="";
        System.out.println("Enter a string to revere it: ");
        Scanner sc = new Scanner(System.in);
        String g = sc.nextLine();
        for(int j=g.length()-1;j>=0;j--){
            x=x+g.charAt(j);
        }System.out.println(x);
    }
}
