package com.stackroute.pe1;
import java.util.*;
public class LettersCaseType {
    String[] output;
   /* public static void main(String[] args){
        System.out.println("Enter Character");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        LettersCaseType lettersCaseType=new LettersCaseType();
    lettersCaseType.letterTypeMethod(string);}*/

    public String letterCaseMethod(String alphabetCase){

        for(int i=0;i<alphabetCase.length();i++){
            int asciiValue=(int)alphabetCase.charAt(i);
            if(asciiValue>=65&&asciiValue<=90){
                String temporary="Capital Letter";
                output[i]=temporary;
            }
            else if(asciiValue>=97&&asciiValue<=122) {
                String temporary="Small Letter";
                output[i]=temporary;
            }
            else{
                String temporary="Given String is not an alphabet";
                output[i]=temporary;
            }
        }
   return Arrays.toString(output); }
}