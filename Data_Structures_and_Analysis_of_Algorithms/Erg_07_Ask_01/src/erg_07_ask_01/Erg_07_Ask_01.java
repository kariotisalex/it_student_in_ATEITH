
package erg_07_ask_01;

public class Erg_07_Ask_01 {

    public static void main(String[] args) {
        
        int matrix[ ] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5 };
        
        BSTree tree = new BSTree( );
        
        for (int i=0; i<matrix.length; i++) 
            tree.insertElement(matrix[i]);
        
        
        tree.inOrderTraversal( );
        tree.preOrderTraversal( );
        tree.postOrderTraversal( );
        

    }

}
