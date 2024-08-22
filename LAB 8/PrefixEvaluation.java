import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluation {

    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                stack.push(ch - '0');
            } else {

                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        if (operand2 == 0) {
                            throw new ArithmeticException("Invalid");
                        }

                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pretfix expression");
        String prefixExpression = sc.nextLine();

        int result = evaluatePrefix(prefixExpression);
        System.out.println("Result of prefix expression evaluation: " + result);

        sc.close();
    }
}
