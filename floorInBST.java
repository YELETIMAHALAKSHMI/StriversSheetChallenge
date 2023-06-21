import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution {
    public static int floorInBST(TreeNode<Integer> root, int x) {
       int maximum = Integer.MIN_VALUE;
       while(root!=null){
           if(root.data==x){
               return x;
           }
           if(root.data>x){
               root=root.left;
           }
           else if(root.data<x){
               maximum = Math.max(maximum,root.data);
               root=root.right;
           }
       }
       return maximum;
    }
}
