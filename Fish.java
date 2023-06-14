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
    GreenfootImage[] walk = new GreenfootImage[4];
    
    SimpleTimer animationTimer = new SimpleTimer();
    
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Fish(){
        for(int i = 0; i < walk.length; i++){
            walk[i] = new GreenfootImage("images/angler_walk/walk0" + i + ".png");
            walk[i].mirrorHorizontally();
            walk[i].scale(60,60);
        }
        
        animationTimer.mark();
        
        //Initial fish image
        setImage(walk[0]);
    }
    public void act()
    {
        //makes it fall down
        setLocation(getX() - speed, getY());
        
        //Remove fish, do exploding animation and decreases health when fish pass merguy
        MyWorld world = (MyWorld) getWorld();
        int health = 5;
        if(getX() == 0){
            health--;
            if(health>0){
                world.decreaseHealth();
            }
            world.removeObject(this);
        }
        animateFish();
    }
    int imageIndex = 0;
    public void animateFish(){
        if(animationTimer.millisElapsed() < 190){
                    return;
        }
        
        animationTimer.mark();
        
        setImage(walk[imageIndex]);
        imageIndex = (imageIndex + 1) % walk.length;
    }
}
