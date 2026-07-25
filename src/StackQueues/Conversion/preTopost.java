package StackQueues.Conversion;

import java.util.Stack;

public class preTopost {
    public String prefixToPostfix(String prefix){
        Stack<String> s = new Stack<>();
        int n = prefix.length();
        for (int i=n-1; i>=0; i--){
            char c = prefix.charAt(i);
            if (Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }
            else {
                String op1 = s.pop();
                String op2 = s.pop();
                s.push(op1+op2+c);
            }
        }
        return s.peek();
    }
    static void main(String[] args) {
        preTopost converter = new preTopost();
        String prefix = "*-A/BC-/AKL";
        System.out.println("Postfix Expression: " + converter.prefixToPostfix(prefix));
    }
}
