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
    GreenfootImage[] attack = new GreenfootImage[6];
    GreenfootImage[] death = new GreenfootImage[6];
    
    SimpleTimer animationTimer = new SimpleTimer();

    String facing = "up";
    
    int speed = 3;
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
        
        for(int i = 0; i < attack.length; i++){
            attack[i] = new GreenfootImage("images/merguy_attack/sprite_" + i + ".png");
        }
        
        animationTimer.mark();
        
        //Initial Merguy image
        setImage(idle[0]);
    }
    
    public void act()
    {
        //Moves Merguy up and down when 'w' or 's' keys are pressed
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY() + speed);
            facing = "down";
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY() - speed);
            facing = "up";
        }
        fireWeapon();
        animateMerguy();
    }
    
    /**
     * Fires weapon at enemies from whatever point the Merguy is at and animates attack
     */
    
    public void fireWeapon(){
        if(Greenfoot.mousePressed(null)){
            Weapon weapon = new Weapon();
            getWorld().addObject(weapon, getX() + 3, getY());
            Greenfoot.playSound("sounds/magic.mp3");
            for(int i = 0; i < attack.length; i++){
                setImage(attack[i]);
            }
            setRotation(0);
        }
    }
    
    /**
     * Animates Merguy
     */
    int imageIndex = 0;
    int imageIndex2 = 0;
    int imageIndex3 = 0;
    public void animateMerguy(){
        //walking animation
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
        
        //idle animation
        else{
            if(animationTimer.millisElapsed() < 190){
                return;
            }
            animationTimer.mark();
            
            setRotation(0);
            setImage(idle[imageIndex2]);
            imageIndex2 = (imageIndex2 + 1) % idle.length;
        }
    }
}
