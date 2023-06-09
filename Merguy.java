import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Merguy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Merguy extends Actor
{
    GreenfootImage[] idle = new GreenfootImage[4];
    GreenfootImage[] walk = new GreenfootImage[6];
    
    SimpleTimer animationTimer = new SimpleTimer();

    String facing = "up";
    /**
     * Constructor
     */
    
    public Merguy(){
        for(int i = 0; i < idle.length; i++){
            idle[i] = new GreenfootImage("images/merguy_idle/sprite_" + i + ".png");
        }
        
        for(int i = 0; i < walk.length; i++){
            walk[i] = new GreenfootImage("images/merguy_walk/sprite_" + i + ".png");
        }
        
        animationTimer.mark();
        
        //Initial Merguy image
        setImage(idle[0]);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + 1);
            facing = "down";
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - 1);
            facing = "up";
        }
        fireWeapon();
        animateMerguy();
    }
    
    //Fires weapon up from whatever point the Merguy is at
    public void fireWeapon(){
        if(Greenfoot.mousePressed(null)){
            Weapon weapon = new Weapon();
            getWorld().addObject(weapon, getX(), getY());
            
        }
    }
    
    /**
     * Animates Merguy
     */
    int imageIndex = 0;
    int imageIndex2 = 0;
    public void animateMerguy(){
        if(Greenfoot.isKeyDown("w")||Greenfoot.isKeyDown("s")){
            if(animationTimer.millisElapsed() < 190){
                return;
            }
            animationTimer.mark();
            
            if(facing.equals("up")){
                setImage(walk[imageIndex]);
                imageIndex = (imageIndex + 1) % walk.length;
                setRotation(270);
            }
            else{
                setImage(walk[imageIndex]);
                imageIndex = (imageIndex + 1) % walk.length;
                setRotation(90);
            }
        }
        else{
            if(animationTimer.millisElapsed() < 190){
                return;
            }
            animationTimer.mark();
            
            setImage(idle[imageIndex2]);
            imageIndex2 = (imageIndex2 + 1) % idle.length;
        }
    }
}
