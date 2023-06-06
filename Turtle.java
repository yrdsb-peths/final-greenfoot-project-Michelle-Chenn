import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Turtle extends Actor
{
    GreenfootImage idle = new GreenfootImage("images/turtle_idle/tile000.png");
    
    /**
     * Constructor
     */
    
    public Turtle(){
        setImage(idle);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("d")){
            move(1);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-1);
        }
    }
}
