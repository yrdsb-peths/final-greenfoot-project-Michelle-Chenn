import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gift here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gift extends Actor
{
    GreenfootImage gift = new GreenfootImage("images/collectibles/gift.png");
    int level = 1;
    
    public Gift(){
        //Gift image
        gift.scale(20, 20);
        setImage(gift);
    }
    
    /**
     * Act - do whatever the Gift wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //makes Gift move left
        setLocation(getX() - level, getY());
    }
}
