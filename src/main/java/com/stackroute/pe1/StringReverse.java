package com.stackroute.pe1;

import java.util.*;
public class StringReverse{
/*    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String originalWord = scanner.next();
        StringReverse reverseObject=new StringReverse();
        reverseObject.reverse(originalWord);
    }*/

public String reverse(String word){
    if(word!=null){
        if(word.length()>1){
        String reverseWord="";
        for(int j=word.length()-1;j>=0;j--){
            reverseWord=reverseWord+word.charAt(j);
        }return reverseWord;}
        else return "Single value can't be reversed";
    }
    else return "Null Value Not Allowed";
}}