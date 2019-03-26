package erg_06_ask_02;


public interface List {
    
    public boolean isEmpty( );
    
    public int size( );
    
    public void insertFirst(Object data);
    
    public void insertLast(Object data);
    
    public void insert(int position, Object data) throws NoSuchListPosition;
    /* Τοποθετεί το νέο κόμβο στην υπ’ αριθμό position θέση της λίστας. Αν το position
    είναι 0 ο κόμβος εισάγεται στην αρχή, αν το position είναι size( ) ο κόμβος εισάγεται
    στo τέλος, διαφορετικά αν position <0 ή position > size( ) προκύπτει εξαίρεση */
    public Object removeFirst( ) throws ListEmptyException;
    
    public Object removeLast( ) throws ListEmptyException;
    
    public Object remove(int position) throws ListEmptyException, NoSuchListPosition;
    /* Διαγράφει τον κόμβο που βρίσκεται στην υπ’ αριθμό position θέση της λίστας.
    Αν το position είναι 0 διαγράφεται ο πρώτος κόμβος, αν το position είναι size( )-1
    διαγράφεται ο τελευταίος κόμβος, διαφορετικά αν position <0 ή position >= size( )
    προκύπτει εξαίρεση */
}


class ListEmptyException extends RuntimeException{
    
    public ListEmptyException(String err) {
        super(err);

    }
        
}
class NoSuchListPosition extends RuntimeException{

    public NoSuchListPosition(String err) {
        super(err);
    }
    
}