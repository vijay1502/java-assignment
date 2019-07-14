package com.stackroute.pe1;

import java.util.Scanner;

public class ArraySum {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter no. of elements you want in array:");
            int ArrayElements = scanner.nextInt();
            ArraySum arrayObject=new ArraySum();
            arrayObject.ArraysumMethod(ArrayElements);

        }

        public int ArraysumMethod(int numberOfElements){
            Scanner scanner= new Scanner(System.in);
            int sumOfElements = 0;
            int a[] = new int[numberOfElements];
            System.out.println("Enter all the elements:");
            for (int i = 0; i < numberOfElements; i++) {
                a[i] = scanner.nextInt();
                sumOfElements = sumOfElements + a[i];
            }
            System.out.println(sumOfElements);
            return sumOfElements;
        }
    }


