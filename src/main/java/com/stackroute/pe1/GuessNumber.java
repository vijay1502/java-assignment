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
    public String guessOutput(int input){
        int systemInput= 34;
        if (input >= 1 && input <= 50) {
            if (input == systemInput)
                return ("The value matches");

            else if (input >systemInput)
                return ("The number you entered is " + input + " and is " + (input - systemInput) + " greater than the original number");

            else if (input < systemInput)
                return ("The number you entered is " + input + " and is " + (systemInput - input) + " Lesser than the original number");
                }
            return ("Input is not in the given bounds");
    }
}
