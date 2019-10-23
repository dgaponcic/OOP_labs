package lab4;

public class Expression {
    private String expression;
    private Stack stack = new Stack();

    Expression(String expression) {
        this.expression = expression;
    }

    private boolean handleStack(boolean result) {
        if (stack.isEmpty()) {
            result = false;
        } else {
            char lastElement = stack.pop();
            if (lastElement == ')') {
                result = false;
            }
        }
        return result;
    }

    boolean isValid() {
        char[] expressionChars = expression.toCharArray();
        boolean result = true;

        for(char character: expressionChars) {
            if(character == '(') {
                stack.push('(');
            } else if(character == ')') {
                result = handleStack(result);
            }
        }

        result = stack.isEmpty() && result;
        return result;
    }

    void print() {
        System.out.println(expression);
    }
}
