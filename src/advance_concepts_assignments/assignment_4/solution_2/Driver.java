package advance_concepts_assignments.assignment_4.solution_2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*solution two is to take input int a form of string and then splitting is done and the required processing is done*/

public class Driver {
    public static void main(String[] args) {
        List<String> myFirstList = new ArrayList();
        Scanner readItems = new Scanner(System.in);
        System.out.println("Enter the list of stirng of elements: ");
        String inputString = readItems.nextLine();

        DistinctElement task = () -> {
            //Spliting the string into parts
            String[] convertToArray = inputString.split(" ");
            System.out.println("Before finding distinct elements");

            //adding to array lsit
            for (int indexOfList = 0; indexOfList < convertToArray.length; ++indexOfList) {
                System.out.print(convertToArray[indexOfList] + " ");
                myFirstList.add(convertToArray[indexOfList]);
            }

            //using stream api to find distinct then sort then collect
            List<String> myDistinctList = (List) myFirstList.stream().distinct().sorted().collect(Collectors.toList());
            System.out.println();
            System.out.println("Elements after finding the distinct elements");


            for (String listElements : myDistinctList) {
                System.out.print(listElements + " ");
            }
        };


        task.takeDistinctOut();
    }
}