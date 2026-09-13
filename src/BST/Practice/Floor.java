package BST.Practice;

public class Floor {
    public static int floor(TreeNode root, int key){
        int floor=-1;
        while (root!=null){
            if (root.val==key){
                floor=root.val;
            }
            if (key>root.val){
                floor=root.val;
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return floor;
    }
}
