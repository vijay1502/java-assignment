package com.stackroute.pe1;
import java.util.*;
public class LettersCaseType {
    public static void main(String[] args){
        System.out.println("Enter Character");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        char character = string.charAt(0);
        int asciiValue = (int)character;
        if (asciiValue>= 65 && asciiValue <= 90) {
            System.out.println("Capital Letter");
        } else {
            System.out.println("Small Letter");
        }
    }
}
