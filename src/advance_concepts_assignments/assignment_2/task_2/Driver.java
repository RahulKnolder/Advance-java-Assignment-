package advance_concepts_assignments.assignment_2.task_2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {

             //lambda expression and using ternary operator
        NextEven getNextEven=((value)-> value % 2 == 0 ? value + 2 : value + 1);

        Scanner readLong= new Scanner(System.in);


        System.out.println("enter the long value");

        //try catch for wrong value input
        try{
            Long values = readLong.nextLong();
            System.out.println(getNextEven.getNextEven(values));
        }catch (InputMismatchException catchException){
            System.out.println(catchException);
        }



    }
}
