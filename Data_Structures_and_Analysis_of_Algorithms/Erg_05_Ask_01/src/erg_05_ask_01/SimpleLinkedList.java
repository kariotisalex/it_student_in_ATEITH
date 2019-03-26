
package erg_05_ask_01;

/**
 * Η ασκηση υλοποιείται με απλα συνδεδεμενη λιστα (Simple Linked List) με μοναδικό δείκτη το first.
 * Η απορία μου σχετικα με τον δείκτη last και η μη υλοποιησης με αυτο τον τροπο ήταν 
 * Πως ο last θα γνωρίζει την τελευταια θέση;
 *          Η κλαση διαχειριστης της linked list ειναι η συγκεκριμενη, η SLListNode είναι το μεσο αποθήκευσης και συνεχισης
 *      ετσι καθε φορα που θα εισάγει κόμβους στην τελευταια θέση θα εισάγει στην μεταβλητη last.
 * 
 *      π.χ.
 *    private SLListNode last;
 * 
 *     public void insertLast(Object data){
 *       boolean flag = true;
 *       SLListNode aTempVar = first;
 *       
 *       SLListNode newNode = new SLListNode(data, null);
 *       
 *       
 *       if(isEmpty()){
 *           first = newNode;
 *           last = first;
 *       }else{
 *           last.getNextNode() = newNode;
 *           last = last.getNextNode();
 * @author alexander
 */
public class SimpleLinkedList implements List{
    
    private SLListNode first;
    

    public SimpleLinkedList() {
        first = null;
        
    }
    
    
    public boolean isEmpty(){
        return first == null;
    }
    // Size of list
    public int size(){
        
        SLListNode aTempVar = first;
        int counter = 1;
        
        
        if(this.isEmpty()){
            System.out.println("The linked list is empty");
            return -1;
        }else{
            while(aTempVar.getNextNode() != null){
                aTempVar = aTempVar.getNextNode();
                counter++;
            }//while
        }//else
        return counter;
    }
    
    // Insert in First index
    public void insertFirst(Object data){
        SLListNode newSLListNode = new SLListNode(data);
        newSLListNode.setNextNode(first);
        first = newSLListNode;
        
    }
    
    
    
    
    @Override
    public void insertLast(Object data){
        
        SLListNode aTempVar = first;
        if(isEmpty()){
            first = new SLListNode(data);
        }else{
            
            while(aTempVar.getNextNode() != null){
                aTempVar = aTempVar.getNextNode();   
            } // while
            aTempVar.setNextNode(new SLListNode(data));
        } //else
    } //insertLast
    
    
    
    
    
    
    public Object removeFirst( ) throws ListEmptyException{
        if(isEmpty())
            throw new ListEmptyException("Empty list");
        SLListNode temp = first;
        first = first.getNextNode();
        return temp;
    }
    
    
    
    
    public Object removeLast( ) throws ListEmptyException{
        
        boolean flag = false;
        SLListNode aTempVar = first;
        Object returnObj = null;

        if(isEmpty()){
            throw new ListEmptyException("Empty list");
        }else if(aTempVar.getNextNode() == null){
            returnObj = first.getNodeData();
            first = null;
        }else{
            while(flag){
                if(aTempVar.getNextNode().getNextNode() == null){
                    returnObj = aTempVar.getNextNode().getNodeData();
                    flag = true;
                    aTempVar.setNextNode(null);
                }
                aTempVar = aTempVar.getNextNode();
            }
        }
        return returnObj;
    }
    
    public Object getFirstDataObject(){
        
        return first.getNodeData();
    }
}
