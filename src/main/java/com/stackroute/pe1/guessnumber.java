package com.stackroute.pe1;
import java.util.*;
public class guessnumber {
    public static void main(String[] args) {

        System.out.println("Guess a Number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        guessnumber g=new guessnumber();
        g.guesser(input);
    }

    public String guesser(int inp){
        int x = 34;
        if (inp >= 1 && inp <= 50)
            if (inp == x)
                return ("The value matches");

            else if (inp > x)
                return ("The number you entered is" + inp + "and is " + (inp - x) + " greater than the original number");

            else if (inp < x)
                return ("The number you entered is" + inp + "and is " + (x - inp) + " Lesser than the original number");


    }
}
