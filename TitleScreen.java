import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Fish Blaster", 100);
    Start start = new Start();
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, 150);
        addObject(start, getWidth()/2, 250);
    }
    /**
     * The main world act loop
     */
    public void act(){
        //Start game if user clicks mouse
        if(Greenfoot.mousePressed(start)){
            Instructions instructions = new Instructions();
            Greenfoot.setWorld(instructions);
        }
    }
}
