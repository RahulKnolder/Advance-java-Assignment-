package advance_concepts_assignments.assignment_3;

import java.util.stream.Stream;

public class LambdaExample {
    public static void main(String[] args) {


        /* in Question it mas methioned to take agruments other wise I colud have List for inputs to make things easy  but it want fulfilling the  */


        //concatenation interface
        ConcatinationInterface concatenateStrings = (var1, var2, var3, var4, var5, var6, var7) -> {
            String result = Stream.of(var1, var2, var3, var4, var5, var6, var6)
                                    .map(String::toUpperCase)
                                    .reduce("", String::concat);

            return result;
        };

        System.out.println("String after concatenation and toUpperCase");

        System.out.println(concatenateStrings.concatenateString("The", "lambda", "has", "too", "many", "string", "argument"));
    }
}
