import greenfoot.*;

/**
 *  The World our hero lives.
 * 
 * @author Aidan
 * @version Ver 1.5 April 2026
 * last edited: Ver 1.3
 */
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
        
        Apple apple = new Apple();
        addObject(apple,300,0);
    }
}
