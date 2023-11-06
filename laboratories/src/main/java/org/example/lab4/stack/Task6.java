package org.example.lab4.stack;

import org.jetbrains.annotations.NotNull;

public class Task6 {
    private static final MathOperation addition = Integer::sum;
    private static final MathOperation subtraction = (a, b) -> a - b;
    private static final MathOperation multiplication = (a, b) -> a * b;
    private static final MathOperation division = (a, b) -> a / b;

    private Task6() {
        throw new IllegalStateException("Utility class");
    }

    public static int evaluateReversePolishNotation(String[] tokens){
        Stack<Integer> numbers = new Stack<>();

        for (String token : tokens) {
            if (token.matches("-*\\d+")) {
                numbers.push(Integer.parseInt(token));
            } else {
                int b = numbers.pop();
                int a = numbers.pop();

                MathOperation operation = getOperation(token);

                numbers.push(operate(a, b, operation));
            }
        }

        return numbers.pop();
    }

    private static MathOperation getOperation(String token){
        return switch (token) {
            case "+" -> addition;
            case "-" -> subtraction;
            case "*" -> multiplication;
            default -> division;
        };
    }

    private static int operate(int a, int b, @NotNull MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    private interface MathOperation {
        int operation(int a, int b);
    }

}
