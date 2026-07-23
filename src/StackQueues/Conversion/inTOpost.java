package StackQueues.Conversion;

import java.util.Stack;

public class inTOpost {
    public static int prec(char c){
        if (c=='^')
            return 3;
        else if(c=='/' || c=='*')
            return 2;
        else if (c=='+' || c=='-')
            return 1;
        else return -1;
    }
    public static void infixToPostfix(String s){
        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                result.append(c);
            }
            else if (c=='('){
                st.push('(');
            }
            else if (c == ')') {
                while (st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();  // Pop the ‘(‘ from the stack
            }
            else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek())) {
                    result.append(st.pop());
                }
                st.push(c);  // Push the current operator to the stack
            }
        }

        // Pop all the remaining elements from the stack
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        System.out.println("Postfix expression: " + result.toString());  // Output the result

    }
    static void main(String[] args) {
        String exp = "(p+q)*(m-n)";  // Infix expression
        System.out.println("Infix expression: " + exp);
        inTOpost.infixToPostfix(exp);  // Convert the infix expression to postfix
    }
}
