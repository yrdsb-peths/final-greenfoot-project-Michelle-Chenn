import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    public Weapon(){

    }
    public void act()
    {
        move(5);
        
        //Remove fish if weapon hits it
        if(isTouching(Fish.class)){
            removeTouching(Fish.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
    }
}
