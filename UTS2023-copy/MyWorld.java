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
    int frame;
    public KamuKalah kamuKalah = new KamuKalah();
    public Score score = new Score();
    public Snake snake = new Snake(100, 0, 0);
    public MyWorld()
    {    
        super(600, 600, 1);
        prepare();
    }

    private void prepare()
    {
        Snake snake = new Snake(100, 0, 0);
        addObject(snake,600,300);
        addObject(score,28,17);
        score.setLocation(77,24);
        addFood();
    }

public void act()
{  
    frame++;
    if(frame >= 500)
    {
       addFood();
    }
}
public void addFood()
{
    addObject(new Food(), Greenfoot.getRandomNumber(getWidth()-1), Greenfoot.getRandomNumber(getHeight()-1)); 
       frame = 0;
}

public void displayKalah()
{
    addObject(kamuKalah,400,200);
    kamuKalah.setLocation(getWidth()/2,getHeight()/2);
    Greenfoot.stop();
}
}



