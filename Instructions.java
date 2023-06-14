import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    Label upKey = new Label("Use 'W' to move up", 30);
    Label downKey = new Label("Use 'S' to move down", 30);
    Label shootKey = new Label("Click your mouse to shoot the enemies", 30);
    Start start = new Start();
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(upKey, getWidth()/2, 125);
        addObject(downKey, getWidth()/2, 150);
        addObject(shootKey, getWidth()/2, 175);
        addObject(start, getWidth()/2, 250);
    }
    
    /**
     * The main world act loop
     */
    public void act(){
        //Start game if user clicks mouse
        if(Greenfoot.mousePressed(start)){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

}
