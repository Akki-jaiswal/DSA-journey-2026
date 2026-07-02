package Recursion.Intro;

import java.util.Stack;

public class ReverseStack {
    public static void insertAtBottom(Stack<Integer> st, int val) {
        if (st.isEmpty()) {
            st.push(val);
            return;
        }
        int topVal = st.pop();
        insertAtBottom(st, val);
        st.push(topVal);
    }

    public static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int topVal = st.pop();
        reverseStack(st);
        insertAtBottom(st, topVal);
    }

    void main(String[] args) {
        // Create a sample stack
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("Original stack: ");
        while (!st.isEmpty()) {
            System.out.println(st.pop() + " ");
        }
        System.out.println();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        ReverseStack.reverseStack(st);
        System.out.println("Reversed Stack: ");
        while (!st.isEmpty()) {
            System.out.println(st.pop() + " ");
        }
        System.out.println();
    }
}
