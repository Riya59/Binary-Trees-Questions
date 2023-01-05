/*******************************************************
    Following is the Binary Tree Node class structure.
    class BinaryTreeNode<T> {
      T data;
      BinaryTreeNode<T> left;
      BinaryTreeNode<T> right;
      
      public BinaryTreeNode(T data) {
        this.data = data;
      }
    }
*******************************************************/

public class Solution {
 
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
    // Write your code here.
       if(root == null){
           return 0;
       }
       if(root.left == null && root.right == null){
           return 1;
       }
       int left = noOfLeafNodes(root.left);
       int right = noOfLeafNodes(root.right);
       return left+right;
	}
}
