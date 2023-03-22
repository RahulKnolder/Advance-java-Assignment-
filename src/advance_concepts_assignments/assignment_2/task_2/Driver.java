package advance_concepts_assignments.assignment_2.task_2;

import java.util.Scanner;


public class Driver {
    public static void main(String[] args) {
        NextEven getNextEven=((value)-> value % 2 == 0 ? value + 2 : value + 1);

        Scanner readLong= new Scanner(System.in);


        System.out.println("enter the long value");
        Long values = readLong.nextLong();
        System.out.println(getNextEven.getNextEven(values));
    }
}
