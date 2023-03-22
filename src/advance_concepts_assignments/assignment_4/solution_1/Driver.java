package advance_concepts_assignments.assignment_4.solution_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {

        // list input
        List<String> firstList = new ArrayList();
        Scanner readItems = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int numberOfInputs = readItems.nextInt();
        readItems.nextLine();

       //lambda expression to implement takeDistinctOut method
        DistinctElement task = () -> {

            //printing my entered list
            for (int indexOfList = 0; indexOfList < numberOfInputs; ++indexOfList) {
                System.out.print("Enter element " + (indexOfList + 1) + ": ");
                String myString = readItems.nextLine();
                firstList.add(myString);
            }

           // using streams to perform operations nad store in ithor list
            List<String> distinctList = firstList.stream().distinct().sorted().collect(Collectors.toList());
            System.out.println();
            System.out.println("Elements after finding the distinct elements");


            for (String element : distinctList) {
                System.out.print(element+" ");
            }


        };

        task.takeDistinctOut();

    }
}