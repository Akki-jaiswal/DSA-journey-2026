package StackQueues.Conversion;

import java.util.Stack;

public class postTopre {
    public String postfixToPrefix(String postfix){
        Stack<String> s = new Stack<>();
        int n = postfix.length();
        for (int i=0; i<n; i++){
            char c = postfix.charAt(i);
            if (Character.isLetterOrDigit(c)){
                s.push(String.valueOf(c));
            }else {
                String op2 = s.pop();
                String op1 = s.pop();
                s.push(c+op1+op2);
            }
        }
        return s.peek();
    }
    static void main(String[] args) {
        postTopre converter = new postTopre();
        String postfix = "ABC/-AK/L-*";
        System.out.println("Prefix Expression: " + converter.postfixToPrefix(postfix));
    }
}
