package com.stackroute.pe1;
import java.util.*;
public class SubStringRepeat {
  /*  public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);
        String word= scanner.next();
    SubStringRepeat subStringRepeat=new SubStringRepeat();
    subStringRepeat.stringRepeatingMethod(word);}*/

    public String stringRepeatingMethod(String word,int repeatNumber){
        Scanner scanner= new Scanner(System.in);
        repeatNumber= scanner.nextInt();
        if(word!=null){
        String repeatingSubString ="";
        int length=word.length();
        for(int i=0;i<repeatNumber;i++){
            for(int j=length-repeatNumber;j<word.length();j++)
            {
                repeatingSubString=repeatingSubString+(word.charAt(j));}
        }
        System.out.println(word.concat(repeatingSubString));
        return word.concat(repeatingSubString);
    }else return "null is not allowed";}
}