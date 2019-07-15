package com.stackroute.pe1;

import java.util.Scanner;
//In this program, the output should be the sum of addition of input elements.,,
public class ArraySum {

        public static void main(String[] args) {
//Scanner is used to consider an input from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            int ArrayElements = scanner.nextInt();
            //create an object for the method. and its input is given by user.
            ArraySum arrayObject=new ArraySum();
            arrayObject.ArraysumMethod(ArrayElements);

        }
        //Creating method named ArraysumMethod with an input as integer

        public int ArraysumMethod(int numberOfElements){
            Scanner scanner= new Scanner(System.in);
            int sumOfElements = 0;
            int a[] = new int[numberOfElements];
            //input the elements
            System.out.println("Enter all the elements:");
            //
            for (int i = 0; i < numberOfElements; i++) {
                a[i] = scanner.nextInt();
                sumOfElements = sumOfElements + a[i];
            }
            System.out.println(sumOfElements);
            return sumOfElements;
        }
    }


