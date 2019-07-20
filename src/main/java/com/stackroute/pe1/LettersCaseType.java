package com.stackroute.pe1;
import java.util.*;
public class LettersCaseType {

   /* public static void main(String[] args){
        System.out.println("Enter Character");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        LettersCaseType lettersCaseType=new LettersCaseType();
    lettersCaseType.letterTypeMethod(string);}*/

    public String[] letterCaseMethod(String alphabetCase){
        String[] output=new String[alphabetCase.length()];
        for(int i=0;i<alphabetCase.length();i++){
            int asciiValue=(int)alphabetCase.charAt(i);
            if(asciiValue>=65&&asciiValue<=90){
                output[i]="Capital Letter";
            }
            else if(asciiValue>=97&&asciiValue<=122) {
                output[i]="Small Letter";

            }
            else{
                output[i]="Given String is not an alphabet";
              }
        }
    return output;}
}