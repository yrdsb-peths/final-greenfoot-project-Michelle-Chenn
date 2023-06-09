import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    int speed = 1;
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //makes it fall down
        setLocation(getX(), getY() + speed);
        
        //Remove fish
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()){
            world.removeObject(this);
        }
    }
}
