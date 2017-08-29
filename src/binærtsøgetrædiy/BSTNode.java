package binærtsøgetrædiy;

/**
 * BSTNode gemmer oplysningerne i noden
 * @author Bo Henriksen
 */
public class BSTNode {
    
    String key; //Key er i dette træ en string
    Address value; //User data
    BSTNode left; //Link to left child
    BSTNode right; //Link to right child

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
   
   public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }

    public String getKey() {
        return key;
    }

    public Address getValue() {
        return value;
    }
    
}
