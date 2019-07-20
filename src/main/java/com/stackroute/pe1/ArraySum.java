package com.stackroute.pe1;

import java.util.Arrays;
import java.util.Scanner;
//In this program, the output should be the sum of addition of input elements.,,
public class ArraySum{

/*        public static void main(String[] args) {
//Scanner is used to consider an input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            int ArrayElements = scanner.nextInt();
            //create an object for the method. and its input is given by user.
            ArraySum arrayObject=new ArraySum();
            arrayObject.ArraysumMethod(ArrayElements);

        }
        //Creating method named ArraysumMethod with an input as integer*/

        public String arraySumMethod(int[] input){

            int sumOfElements = 0;

            //input the elements
            for (int i = 0; i < input.length; i++)
            {
            sumOfElements=sumOfElements+input[i];}

              return ("SUm of array Elements is "+sumOfElements);
        }

    }


