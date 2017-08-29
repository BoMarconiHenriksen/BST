package binærtsøgetrædiy;

/**
 * BSTNode gemmer oplysningerne i noden
 * @author Bo Henriksen
 */
public class BSTNode {
    
    private String key; //Key er i dette træ en string
    private Address value; //User data
    private BSTNode left; //Link to left child
    private BSTNode right; //Link to right child

    public BSTNode(String key, Address value, BSTNode left, BSTNode right) {
        this.key = key;
        this.value = value;
        this.left = null; //Sættes til null, da left node har link til children, men ikke har children. Derfor sættes den til null
        this.right = null; //Læs ovenstående
    }

    public BSTNode(String key, Address value) {
        this.key = key;
        this.value = value;
    }
    
   public BSTNode() {
    }
    
    //Når root ikke længere er null kan vi bruge insert metoden.
    protected void insert( String key, Address value, BSTNode node ) {
    switch ( Integer.signum( key.compareToIgnoreCase( node.key ) ) ) {
        case -1:
            if ( node.left == null ) {
                node.left = new BSTNode( key, value );
            } else {
                insert( key, value, node.left );
            }
            break;
        case 0:
            node.value = value;
            break;
        case 1:
            if ( node.right == null ) {
                node.right = new BSTNode( key, value );
            } else {
                insert( key, value, node.right );
            }
            break;
    }
}
    
   
    
    
    
}
