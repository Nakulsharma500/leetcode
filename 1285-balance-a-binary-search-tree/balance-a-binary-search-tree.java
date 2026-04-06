/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  
         public void inorderBST(TreeNode root,ArrayList<Integer> inorder){
            if(root==null){
                return;
            }
            inorderBST(root.left, inorder);
            inorder.add(root.val);
            inorderBST(root.right, inorder);
           
         }
         public TreeNode createBST(ArrayList<Integer> inorder, int st, int end){
            if(st > end){
                return null;
            }
            int mid=(st+end)/2;
            TreeNode root=new TreeNode(inorder.get(mid));
            root.left=createBST(inorder, st, mid-1);
            root.right=createBST(inorder, mid+1, end);
             
             return root;

         }
         
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder=new ArrayList<>();
        
         inorderBST(root,inorder);
         return createBST(inorder, 0, inorder.size()-1);
        
    }
}