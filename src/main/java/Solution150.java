import java.util.Stack;

public class Solution150 {

    /**
     * evaluate-reverse-polish-notation
     * <p>
     * operator: +, -, *, /
     */
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            if ("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token)) {
                String operator = token;
                String rightOperand = stack.pop();
                String leftOperand = stack.pop();
                stack.push(String.valueOf(eval(leftOperand, rightOperand, operator)));
            } else {
                stack.push(token);
            }
        }
        return Integer.valueOf(stack.pop());
    }

    public int eval(String leftOperand, String rightOperand, String operator) {
        int left = Integer.parseInt(leftOperand);
        int right = Integer.parseInt(rightOperand);
        switch (operator) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
        }
        return 0;
    }


}
