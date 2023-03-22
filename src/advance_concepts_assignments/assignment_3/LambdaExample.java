package advance_concepts_assignments.assignment_3;

import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {


        /* in this assignment its mas mentioned to take arguments otherwise I could have List for inputs to make
        things easy  but it won't fulfil the Question purpose */


        //concatenation interface
        ConcatinationInterface concatenateStrings = (var1, var2, var3, var4, var5, var6, var7) -> {
            String result = Stream.of(var1, var2, var3, var4, var5, var6, var6)
                                    .map(String::toUpperCase)
                                    .reduce("", String::concat);

            return result;
        };


        /*String::concat is a method reference in Java that refers to the concat() method of the String class.
         In the context of the Stream API, String::concat can be used as a parameter in various Stream methods that
         accept a functional interface that takes two parameters, such as reduce() or collect().*/


        System.out.println("String after concatenation and toUpperCase");

        System.out.println(concatenateStrings.concatenateString("The", "lambda", "has", "too", "many", "string", "argument"));
    }
}
