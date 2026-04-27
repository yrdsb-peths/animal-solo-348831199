import greenfoot.*;

/**
 *  The World our hero lives.
 * 
 * @author Aidan
 * @version Ver 1.2 April 2026
 */
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
    }
}
