import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Create rows of Fish object
        fish1();
        fish2();
        fish3();
      
        //Create Turtle object
        Turtle turtle = new Turtle();
        addObject(turtle, getWidth()/2, 300);        
    }
    
    public void fish1(){
        Fish fishies = new Fish();
        
        int x = getWidth();
        int y = 150;
        
        addObject(fishies, x, y);
    }
    
    public void fish2(){
        Fish fishies = new Fish();
        
        int x = 0;
        int y = 100;
        
        addObject(fishies, x, y);
    }
    
    public void fish3(){
        Fish fishies = new Fish();
        
        int x = getWidth();
        int y = 50;
        
        addObject(fishies, x, y);
    }
}
