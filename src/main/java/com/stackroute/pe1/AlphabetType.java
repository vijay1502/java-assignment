package com.stackroute.pe1;


import java.util.*;
public class AlphabetType {
    public static void main(String[] args) {

        System.out.println("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String words= scanner.nextLine();
            AlphabetType alphabetObject= new AlphabetType();
            alphabetObject.vowelAndConsonant(words);
    }

        public String vowelAndConsonant(String word) {

            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u')
                    return ("vowel ");
                else
                   return ("consonant ");}

    return word;}
}
