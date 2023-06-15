import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{
    Label upKey = new Label("Use     to move up", 30);
    Label downKey = new Label("Use     to move down", 30);
    Label shootKey = new Label("Click       to shoot the enemies", 30);
    W w = new W();
    S s = new S();
    Mouse mouse = new Mouse();
    Start start = new Start();
    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(upKey, getWidth()/2, 115);
        addObject(downKey, getWidth()/2, 145);
        addObject(shootKey, getWidth()/2, 175);
        addObject(start, getWidth()/2, 250);
        addObject(w, 262, 115);
        addObject(s, 245, 147);
        addObject(mouse, 211, 176);
    }
    
    /**
     * The main world act loop
     */
    public void act(){
        //Start game if user clicks mouse
        if(Greenfoot.mousePressed(start)){
            Greenfoot.playSound("sounds/click.mp3");
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }

}
