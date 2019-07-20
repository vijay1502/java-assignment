package com.stackroute.pe1;
//importing util package for user input

import java.util.*;
//Class name is Alphabet Type and the output returns Whether the string inputs are vowel or consonant
public class AlphabetType{

   char[] alphabet;
   String[] result;
   String temporary;
    //  Input to enter a string
     /*   System.out.println("Enter a string :");
        Scanner scanner = new Scanner(System.in);
        String words= scanner.nextLine();
        //Creating an object for the class and calling a method to provide the output...
            AlphabetType alphabetObject= new AlphabetType();
            alphabetObject.vowelAndConsonant(words);*/

    //A method named vowelAndConsonant which has a formal parameter 'word' which replicates 'words' in main()...
    public String[] vowelAndConsonantFinder(String word) {


            for(int j=0;j<word.length();j++){
                if(word.charAt(j)=='a'||word.charAt(j)=='e'||word.charAt(j)=='i'||word.charAt(j)=='o'||word.charAt(j)=='u'||
                        word.charAt(j)=='A'||word.charAt(j)=='E'||word.charAt(j)=='I'||word.charAt(j)=='O'||word.charAt(j)=='U') {
                    temporary="vowel";
                    result[j]=temporary;
                }
                else {
                    temporary="consonant";}
                    result[j]=temporary;
            }
        return result;}
}




