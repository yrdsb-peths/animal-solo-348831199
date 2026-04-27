import greenfoot.*;

/**
 *  The World our hero lives.
 * 
 * @author Aidan
 * @version Ver 1.6 April 2026
 * last edited: Ver 1.6
 */
public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Elephant elephant = new Elephant();
        addObject(elephant,300,200);
        
        createApple();
    }
    
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple,x,y);
    }
}
