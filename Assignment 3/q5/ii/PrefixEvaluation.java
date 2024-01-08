package q5.ii;
import java.util.Stack;

public class PrefixEvaluation {
    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (c) {
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
                        stack.push(operand1 / operand2);
                        break;
                    // Add more operators as needed

                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String prefixExpression = "+*235";
        int result = evaluatePrefix(prefixExpression);
        System.out.println("Prefix Expression Result: " + result);
    }
}
