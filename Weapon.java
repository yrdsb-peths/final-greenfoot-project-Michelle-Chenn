import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Weapon extends Actor
{
    GreenfootImage[] shoot = new GreenfootImage[4];
    
    SimpleTimer animationTimer = new SimpleTimer();
    public Weapon(){
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
        shootAnimation();
        
        //Remove fish if weapon hits it
        if(isTouching(Fish.class)){
            removeTouching(Fish.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }
        //Remove gift if weapon hits it
        if(isTouching(Gift.class)){
            removeTouching(Gift.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseHealth();
        }
        
    }
    
    int imageIndex1 = 0;
    /**
     * Animates Weapon when it is shot
     */
    public void shootAnimation(){
        if(animationTimer.millisElapsed() < 190){
                return;
        }
    
        animationTimer.mark();
        
        setImage(shoot[imageIndex1]);
        imageIndex1 = (imageIndex1 + 1) % shoot.length;
    }
}
