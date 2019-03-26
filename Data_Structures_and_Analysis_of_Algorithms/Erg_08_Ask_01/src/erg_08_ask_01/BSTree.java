
package erg_08_ask_01;


public class BSTree {
    // Instance field (data member)
    private TreeNode root;
    
    // Methods
    public BSTree( ){
        root = null;
    }
    public boolean isEmpty( ){
        return (root == null); 
    }
    public void insertElement(int data){
        if (isEmpty( ))
            root = new TreeNode(data);
        else
            insertNode(data,root); 
    }
    
    public void inOrderTraversal( ){
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println( ); 
    }
    
    public void preOrderTraversal( ){
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println( ); 
    }
    
    public void postOrderTraversal( ){
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println( ); 
    }
    

        // RECURSIVE PRIVATE METHODS
        // Υλοποιήστε τις παρακάτω:
    private void insertNode(int data, TreeNode node){
        // Local variables
        TreeNode placerNode = new TreeNode(data);
        TreeNode tempNode = node;
        
            
            
            while(true){
                // Left Node
                if(tempNode.getNodeData() > data){
                    // Leaf or not to place the Node
                    if(tempNode.getLeftNode() != null){
                        tempNode = tempNode.getLeftNode();
                    }else{
                        tempNode.setLeftNode(placerNode);
                        return;
                    }
                }
                // Right
                else if(tempNode.getNodeData() < data){
                    // Leaf or not to place the Node
                    if(tempNode.getRightNode() != null){
                        tempNode = tempNode.getRightNode();
                    }else{
                        tempNode.setRightNode(placerNode);
                        return;
                    }
                }
            }
        
        
        
    }
    
    
    
    public int numberOfNodes( )
        // Υπολογίζει και επιστρέφει το πλήθος των κόμβων του δένδρου
    {
        return numberOfNode(root);
    }
    public int treeHeight( )
        // Υπολογίζει και επιστρέφει το ύψος του δένδρου
    {
        return treeHeight(root);
    }
    public int treeHeight(TreeNode node)
    {
        if(node == null)
            return 0;
        else{
            int left = treeHeight(node.getLeftNode());
            int right = treeHeight(node.getRightNode());
            return Math.max(left, right) + 1;   
        }
        
    }
        // Υπολογίζει και επιστρέφει το ύψος του δένδρου για τον συγκεκριμένο κόμβο
        // (με δημιουργία και χρήση equals ή compareTo)
        
        
        
        
        
    private void inOrder(TreeNode node){
        if (node != null){
            inOrder(node.getLeftNode());
            System.out.print(node.getNodeData() + " ");
            inOrder(node.getRightNode());
        }
        
        
    }
    private void preOrder(TreeNode node){
        if (node != null){
            System.out.print(node.getNodeData() + " ");
            preOrder(node.getLeftNode());
            preOrder(node.getRightNode());
        }
        
    }
    private void postOrder(TreeNode node){
        if (node != null){
            postOrder(node.getLeftNode());
            postOrder(node.getRightNode());
            System.out.print(node.getNodeData() + " ");
        }
    }
    private int numberOfNode(TreeNode aTempVar){
        int n = 0;
        if(aTempVar == null){
            return 0;
        }
        else{
            return 1  +  numberOfNode(aTempVar.getLeftNode()) 
                    + numberOfNode(aTempVar.getRightNode());
            
        }        
        
    }
    
    
}
