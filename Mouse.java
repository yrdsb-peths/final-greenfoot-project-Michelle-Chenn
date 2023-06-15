import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mouse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mouse extends Actor
{
    GreenfootImage[] mouse = new GreenfootImage[2];
    SimpleTimer animationTimer = new SimpleTimer();
    /**
     * Act - do whatever the Mouse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Mouse(){
        for(int i = 0; i < mouse.length; i++){
            mouse[i] = new GreenfootImage("images/keys/mouse" + i + ".png");
            mouse[i].scale(15,15);
        }
        
        animationTimer.mark();
        
        //Initial mouse image
        setImage(mouse[0]);
    }
    int imageIndex = 0;
    public void act()
    {
        //Animates Mouse
        if(animationTimer.millisElapsed() < 300){
                    return;
        }
        
        animationTimer.mark();
        
        setImage(mouse[imageIndex]);
        imageIndex = (imageIndex + 1) % mouse.length;
    }
}
