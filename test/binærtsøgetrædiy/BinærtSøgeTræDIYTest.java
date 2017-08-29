package binærtsøgetrædiy;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Bo Henriksen
 */
public class BinærtSøgeTræDIYTest {
    
    @Test
    public void testPut() {
        System.out.println("put");
        BinærtSøgeTræDIY instance = new BinærtSøgeTræDIY();
        String key = "Peter";
        Address value = new Address("Pilen 14");
        instance.put(key, value);
        String expResult = "Pilen 14";
        //String result = instance.get(key) //Mangler get metoden!!!
        //assertEquals(expResult, result);
    }  
    
    @Test
    public void testSize() {
        System.out.println("size");
        BinærtSøgeTræDIY instance = new BinærtSøgeTræDIY();   
    }
    
    @Test
    public void testKeys() {
        System.out.println("keys");
        BinærtSøgeTræDIY instance = new BinærtSøgeTræDIY();
    }
        
        
    
}
