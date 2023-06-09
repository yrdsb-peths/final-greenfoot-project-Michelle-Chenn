import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer fishMove = new SimpleTimer();
    int speed = 500;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1, false);
        
        //Create Turtle object
        Turtle turtle = new Turtle();
        addObject(turtle, getWidth()/2, 500);        
    }
    
    public void act(){
        if(fishMove.millisElapsed() < 1000){
            return;
        }
        fishMove.mark();
        createFish();
    }
    
    /**
     * Create new fish at a random location at top of screen
     */
    public void createFish(){
        Fish fishies = new Fish();
        
        int x = Greenfoot.getRandomNumber(getWidth());
        int y = 0;
        
        addObject(fishies, x, y);
    }
}
