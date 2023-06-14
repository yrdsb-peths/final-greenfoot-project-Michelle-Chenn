import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    GreenfootImage[] explode = new GreenfootImage[4];
    GreenfootImage[] shoot = new GreenfootImage[4];
    
    SimpleTimer animationTimer = new SimpleTimer();
    public Weapon(){
        for(int i = 0; i < explode.length; i++){
            explode[i] = new GreenfootImage("images/explosion/explode" + i + ".png");
            explode[i].scale(60,60);
        }
        for(int i = 0; i < shoot.length; i++){
            shoot[i] = new GreenfootImage("images/shoot/shoot" + i + ".png");
            shoot[i].scale(60,60);
        }
        
        animationTimer.mark();
        
        //Initial weapon image
        setImage(shoot[0]);
    }
    public void act()
    {
        move(5);
        
        //Remove fish if weapon hits it and animates explosion
        if(isTouching(Fish.class)){
            explode();
            removeTouching(Fish.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
        
        
    }
    int imageIndex = 0;
    public void explode(){
        if(animationTimer.millisElapsed() < 190){
                return;
        }
    
        animationTimer.mark();
        
        setImage(explode[imageIndex]);
        imageIndex = (imageIndex + 1) % explode.length;
    }
    
    int imageIndex1 = 0;
    public void shootAnimation(){
        if(animationTimer.millisElapsed() < 190){
                return;
        }
    
        animationTimer.mark();
        
        setImage(shoot[imageIndex1]);
        imageIndex1 = (imageIndex1 + 1) % shoot.length;
    }
}
