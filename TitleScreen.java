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
        
        //Add title
        addObject(titleLabel, getWidth()/2, 150);
        
        //Add start button
        addObject(start, getWidth()/2, 250);
    }
    /**
     * The main world act loop
     */
    public void act(){
        //Move on to instructions if user clicks button
        if(Greenfoot.mousePressed(start)){
            Greenfoot.playSound("sounds/click.mp3");
            Instructions instructions = new Instructions();
            Greenfoot.setWorld(instructions);
        }
    }
}
