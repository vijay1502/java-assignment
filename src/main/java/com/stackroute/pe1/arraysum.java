package com.stackroute.pe1;

import java.util.Scanner;
public class arraysum {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int g = s.nextInt();
        arraysum array=new arraysum();
        array.summethod(g);

    }

        public int summethod(int n){
        Scanner s= new Scanner(System.in);
            int sum = 0;
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println(sum);
        return sum;
    }
}
