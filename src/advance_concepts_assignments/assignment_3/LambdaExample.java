package advance_concepts_assignments.assignment_3;

public class LambdaExample {
    public static void main(String[] args) {

        //concatenation interface
        ConcatinationInterface concatenateStrings = (s1, s2, s3, s4, s5, s6, s7) -> {
            return (s1 + s2 + s3 + s4 + s5 + s6 + s7).toUpperCase();
        };

        System.out.println("String after concatenation and toUpperCase");
        System.out.println(concatenateStrings.concatenateString("The", "lambda", "has", "too", "many", "string", "argument"));
    }
}
