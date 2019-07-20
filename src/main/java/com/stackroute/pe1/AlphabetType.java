package com.stackroute.pe1;
//importing util package for user input

import java.util.*;
//Class name is Alphabet Type and the output returns Whether the string inputs are vowel or consonant
public class AlphabetType {

    String[] alphabet;
    //  Input to enter a string
     /*   System.out.println("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String words= scanner.nextLine();
        //Creating an object for the class and calling a method to provide the output...
            AlphabetType alphabetObject= new AlphabetType();
            alphabetObject.vowelAndConsonant(words);*/

    //A method named vowelAndConsonant which has a formal parameter 'word' which replicates 'words' in main()...
    public String[] vowelAndConsonantFinder(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||word.charAt(i) == 'u'){
                //If any of the character is vowel, return it...else return consonant
               String words = ("vowel");
                alphabet[i]=words;
            }
            else{
               String words=("consonant");
                alphabet[i]=words;
            }
        }

    return alphabet;}
}




