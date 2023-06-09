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
    Label scoreLabel;
    Label healthBar;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Create Turtle object
        Merguy turtle = new Merguy();
        addObject(turtle, 100, getHeight()/2);  
        
        //Create score label
        scoreLabel = new Label(0, 60);
        addObject(scoreLabel, 50, 50);
        
        //Create health bar
        healthBar = new Label (10, 80);
        addObject(healthBar, 660, 50);
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
        
        int x = getWidth();
        int y = Greenfoot.getRandomNumber(getHeight());
        
        addObject(fishies, x, y);
    }
    
    /**
     * Decreases health and ends game when health reaches 0
     */
}
