package com.stackroute.pe1;

import java.util.Arrays;

public class SortAndSum{
    public String DescendingOrderSorting(int inputNumber){
        String string=Integer.toString(inputNumber);
        char[] temporary=new char[string.length()];
        for(int i=0;i<string.length();i++){
            for (int j=i;j<string.length();j++){
            if(string.charAt(i)>string.charAt(j)){
                temporary[i]=string.charAt(i);
            }
            else {
                temporary[i]=string.charAt(j);
            }
        }}
        String temporaryString=Arrays.toString(temporary);

    return temporaryString;}
}


        // initialize frequency of each digit to Zero

