import java.util.Scanner;
import java.util.*;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0'); // char to int
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result = performOperation(c, operand1, operand2);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static int performOperation(char op, int operand1, int operand2) {
        switch (op) {
            case '+':
                return operand1 + operand2;

            case '-':
                return operand1 - operand2;

            case '*':
                return operand1 * operand2;

            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Invalid");
                }

                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Unknown operator: " + op);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter postfix expression");
        String postfixExpression = sc.nextLine();

        int result = evaluatePostfix(postfixExpression);
        System.out.println("Evaluated expression: " + result);

        sc.close();
    }
}