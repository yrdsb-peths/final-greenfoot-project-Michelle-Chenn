import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    GreenfootImage start = new GreenfootImage("images/keys/Play.png");
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Start(){
        //Start button image
        start.scale(60, 60);
        setImage(start);
    }
    public void act()
    {
        
    }
}
