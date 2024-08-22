import java.util.Scanner;
import java.util.Stack;

public class L8B2 {

    public static String convertInfixToPrefix(String str) {
        StringBuilder sb = new StringBuilder(str.trim());
        StringBuilder preFix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        stack.push('(');
        sb.reverse();
        sb.append(')');
        
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                preFix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (stack.peek() != '(') {
                    preFix.append(stack.pop());
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && Stackprecedence(stack.peek()) >= Infixprecedence(ch)) {
                    preFix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        return preFix.reverse().toString();
    }

    public static int  Infixprecedence (char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 2;
            case '*':
            case '/':
                return 4;
            case '^':
                return 5;
            default:
                return 0;
        }
    }
    public static int Stackprecedence (char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 3;
            case '^':
                return 6;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Correct Infix String only! : ");
        String str = sc.nextLine();
        System.out.println("PreFix string: " + convertInfixToPrefix(str));
        sc.close();
    }
}
