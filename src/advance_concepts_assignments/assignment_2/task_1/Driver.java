package advance_concepts_assignments.assignment_2.task_1;

import advance_concepts_assignments.assignment_2.task_1.CalculateMax;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {


    public static void main(String[] args) {


        //lambda expression
        CalculateMax calculateMax = (first_number, second_number) -> {
            return Math.max(first_number, second_number);
        };

       //try catch for wrong input form user
        try {
            Scanner readNumber = new Scanner(System.in);
            System.out.println("Enter first number");
            Integer firstNumber = readNumber.nextInt();
            System.out.println("Enter second number");
            Integer secondNumber = readNumber.nextInt();
            Integer maximumValue = calculateMax.getMax(firstNumber, secondNumber);
            System.out.println("the maximum of the two number is " + maximumValue);
        } catch (InputMismatchException catchException) {
            System.out.println("Wrong input");
        }
        //user input


        //invoking calculateMax method


    }
}
