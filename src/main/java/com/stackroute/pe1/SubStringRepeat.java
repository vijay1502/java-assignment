package com.stackroute.pe1;
import java.util.*;
public class SubStringRepeat {
    public static void main(String[] args){
        int length;
        Scanner scanner= new Scanner(System.in);
        String word= scanner.next();
        Scanner scanned= new Scanner(System.in);
        int repeatNumber= scanned.nextInt();
        String repeatingSubString ="";

        length=word.length();
        for(int i=0;i<repeatNumber;i++){
            for(int j=length-repeatNumber;j<word.length();j++)
            {

                repeatingSubString=repeatingSubString+(word.charAt(j));}

        }
        System.out.println(word+repeatingSubString);

    }
}