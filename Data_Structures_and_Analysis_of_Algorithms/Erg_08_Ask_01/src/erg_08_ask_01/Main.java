
package erg_08_ask_01;

public class Main {

    public static void main(String[] args) {
        
        int matrix[ ] = { 40, 15, 25, 50, 20, 10, 70, 55, 45, 5 };
        
        BSTree tree = new BSTree( );
        
        for (int i=0; i<matrix.length; i++) 
            tree.insertElement(matrix[i]);
        
        
        tree.inOrderTraversal( );
        tree.preOrderTraversal( );
        tree.postOrderTraversal( );
        System.out.println(tree.numberOfNodes()); 
        System.out.println(tree.treeHeight());

    }

}
