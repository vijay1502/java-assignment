package com.stackroute.pe1;
import java.util.*;
public class LettersCaseType {
    public static void main(String[] args){
        System.out.println("Enter Character");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        LettersCaseType lettersCaseType=new LettersCaseType();
    lettersCaseType.letterTypeMethod(string);}
    public String letterTypeMethod(String alpha){
        Scanner scanner=new Scanner(System.in);
        alpha=scanner.next();
        char character = alpha.charAt(0);
        int asciiValue = (int)character;
        if (asciiValue>= 65 && asciiValue <= 90)
            return System.out.println("Capital Letter");
         else
          return   System.out.println("Small Letter");

    }
}
