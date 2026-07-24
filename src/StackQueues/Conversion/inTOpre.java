package StackQueues.Conversion;

import java.util.Stack;

public class inTOpre {
    public static int getPriority(char C) {
        if (C == '^')  // Exponent operator has highest precedence
            return 3;
        else if (C == '*' || C == '/')  // Multiplication and division have higher precedence than addition
            return 2;
        else if (C == '+' || C == '-')  // Addition and subtraction have lowest precedence
            return 1;
        return 0;
    }
    public static String infixToPostfix(String infix){
        infix = '(' + infix +')';
        int l = infix.length();
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i=0; i<l; i++){
            char c=infix.charAt(i);
            if (Character.isLetterOrDigit(c))
                result.append(c);
            else if (c=='(')
                stack.push('(');
            else if (c==')'){
                while (stack.peek()!='('){
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while (!stack.isEmpty()&&getPriority(c)<=getPriority(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.toString();
    }
    public static String infixToPrefix(String infix){
        StringBuilder sb = new StringBuilder(infix);
        sb.reverse();
        for (int i=0; i<sb.length(); i++){
            if (sb.charAt(i)=='(')
                sb.setCharAt(i, ')');
            else if (sb.charAt(i)==')') {
                sb.setCharAt(i,'(');
            }
        }
        String prefix = infixToPostfix(sb.toString());
        return new StringBuilder(prefix).reverse().toString();
    }
    static void main(String[] args) {
        String exp = "(p+q)*(c-d)";  // Infix expression
        System.out.println("Infix expression: " + exp);
        System.out.println("Prefix Expression: " + inTOpre.infixToPrefix(exp));  // Output the prefix expression
    }
}
