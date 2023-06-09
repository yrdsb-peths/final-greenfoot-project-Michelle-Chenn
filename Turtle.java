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
        idle.scale(50,50);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 1);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 1);;
        }
        fireWeapon();
    }
    
    //Fires weapon up from whatever point the turtle is at
    public void fireWeapon(){
        MyWorld world = new MyWorld();
        if(Greenfoot.mousePressed(world)){
            Weapon weapon = new Weapon();
            getWorld().addObject(weapon, getX(), getY());
            
        }
    }
}
