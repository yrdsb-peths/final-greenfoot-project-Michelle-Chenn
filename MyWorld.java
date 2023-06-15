import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    SimpleTimer fishMove = new SimpleTimer();
    int speed = 1500;
    int level = 1;
    Label scoreLabel;
    public int health = 3;
    public int score = 0;
    
    Heart heart1 = new Heart();
    Heart heart2 = new Heart();
    Heart heart3 = new Heart();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Create Turtle object
        Merguy turtle = new Merguy();
        addObject(turtle, 100, getHeight()/2);  
        
        //Create score label
        scoreLabel = new Label(0, 60);
        addObject(scoreLabel, 50, 50);
        
        //Create hearts
        addObject(heart1, 470, 50);
        addObject(heart2, 520, 50);
        addObject(heart3, 570, 50);
    }
    
    public void act(){
        if(health>0){
            //Makes fish spawn
            if(fishMove.millisElapsed() < speed){
                return;
            }
            fishMove.mark();
            createFish();
        }
    }
    
    /**
     * Create new fish at a random location at right of screen
     */
    public void createFish(){
        Fish fishies = new Fish();
        fishies.setSpeed(level);
        
        int x = getWidth();
        int y = Greenfoot.getRandomNumber(getHeight());
        
        addObject(fishies, x, y);
    }
    
    /**
     * Increases score and game difficulty
     */
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        
        if(score%5==0){
            level += 1;
            speed -= 200;
        }
    }
    
    /**
     * Decreases health and ends game when health reaches 0
     */
    
    public void decreaseHealth(){
        if(health>0){
            health--;
            Greenfoot.playSound("sounds/hurt.mp3");
            NoHeart noHeart = new NoHeart();
            if(health==2){
                addObject(noHeart, 570, 50);
                removeObject(heart3);
            }
            if(health==1){
                addObject(noHeart, 520, 50);
                removeObject(heart2);
            }
            if(health==0){
                addObject(noHeart, 470, 50);
                removeObject(heart1);
            }
        }
        
        if(health==0){
            gameOver();
        }
    }
    
    /**
     * End the game and draw 'GameOver'
     */
    public void gameOver(){
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, getWidth()/2, 200);
        Greenfoot.playSound("sounds/gameOver.mp3");
    }
}
