package binærtsøgetrædiy;

/**
 * Klassen sørger for adgang til noden
 *
 * @author Bo Henriksen
 */
public class BinærtSøgeTræDIY {

    private BSTNode root;

    public BinærtSøgeTræDIY(BSTNode root) {
        this.root = null;
    }

    public BinærtSøgeTræDIY() {
    }

    //Hvis BST er tomt laves en ny node og den sættes til root(udgangspunktet i BST)
    public void put(String key, Address value) {
        if (root == null) {
            root = new BSTNode(key, value);
        } else {
            //Hvis der er en root node sættes den ind almindeligt
            //Hvorfor root?
            root.insert(key, value, root);
            //insert(key, value, root);
        }
    }
    
    

    /**
     * Main bruger vi til at indsætte og debugge
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinærtSøgeTræDIY dict = new BinærtSøgeTræDIY();
        dict.put("Bo", new Address("Pilestræde 14"));
        dict.put("Anders", new Address("Overhøjen 34"));
        
    }



}
