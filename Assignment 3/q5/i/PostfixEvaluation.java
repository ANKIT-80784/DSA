package q5.i;
import java.util.Stack;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

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
        String postfixExpression = "23*5+";
        int result = evaluatePostfix(postfixExpression);
        System.out.println("Postfix Expression Result: " + result);
    }
}
