package com.stackroute.pe1;


import java.util.*;
public class alphatype {
    public static void main(String[] args) {
        int j=0;
        System.out.println("Enter a string :");
        Scanner sc = new Scanner(System.in);
        String words= sc.nextLine();
            alphatype b= new alphatype();
            b.vowelcons(words);
    }

        public static String vowelcons(String word) {

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                    System.out.println(word.charAt(i) + " is vowel");
                } else {
                    System.out.println(word.charAt(i) + " is consonant");
                }
            }
            return word;
        }
}
