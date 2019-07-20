package com.stackroute.pe1;
import java.util.*;
public class GuessNumber {
   /* public static void main(String[] args) {

        System.out.println("Guess a Number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        GuessNumber guessObject=new GuessNumber();
        guessObject.guessOutput(input);
    }
*/
    public String guessOutput(int inp){
        int systemInput= 34;
        if (inp >= 1 && inp <= 50) {
            if (inp == systemInput)
                return ("The value matches");

            else if (inp >systemInput)
                return ("The number you entered is " + inp + " and is " + (inp - systemInput) + " greater than the original number");

            else if (inp < systemInput)
                return ("The number you entered is " + inp + " and is " + (systemInput - inp) + " Lesser than the original number");
                }
            return ("Input is not in the given bounds");
    }
}
