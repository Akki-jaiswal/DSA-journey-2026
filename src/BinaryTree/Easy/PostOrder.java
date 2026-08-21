package BinaryTree.Easy;
import java.util.*;
public class PostOrder {
    public static List<Integer> postOrder(Node root){
        List<Integer> postorder = new ArrayList<>();
        if (root == null){
            return postorder;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(root);
        while (!st1.isEmpty()){
            root = st1.pop();
            st2.push(root);
            if (root.left != null){
                st1.push(root.left);
            }
            if (root.right!=null){
                st1.push(root.right);
            }
        }
        while (!st2.isEmpty()){
            postorder.add(st2.pop().data);
        }
        return postorder;
    }
    static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        List<Integer> result = PostOrder.postOrder(root);

        System.out.print("Postorder traversal: ");
        for (int val : result) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

