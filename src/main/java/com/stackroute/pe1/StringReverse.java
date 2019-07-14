package com.stackroute.pe1;

import java.util.*;
public class StringReverse{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String originalWord = scanner.next();
        StringReverse reverseObject=new StringReverse();
        reverseObject.reverse(originalWord);
    }

        public String reverse(String word){
        String reverseWord="";
        for(int j=word.length()-1;j>=0;j--){
            reverseWord=reverseWord+word.charAt(j);
        }System.out.println(reverseWord);
    return reverseWord;}
}