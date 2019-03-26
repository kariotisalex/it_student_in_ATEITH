
package erg_08_ask_01;


public class TreeNode {
    // Instance fields (data members)
    private TreeNode left;
    private int item;
    private TreeNode right;
    
    // Constructor
    public TreeNode(int item) {
        this.item = item;
    }
    
    // Methods
    public int getNodeData( ){
        return item;
    }

    
    public TreeNode getLeftNode( ){
        return left;
    }
    public TreeNode getRightNode( ){
        return right;
    }
    public boolean isLeaf( ){
        return ((left == null) && (right == null));
    }
    public void setLeftNode(TreeNode node){
        left = node;
    }
    public void setRightNode(TreeNode node){
        right = node;
    }
    
    
}
