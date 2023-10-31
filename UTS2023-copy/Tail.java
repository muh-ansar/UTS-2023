import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.concurrent.Phaser;

/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    int r, g, b;
    int countLength = 0;
    int playerLength = 1;
    public Tail(int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r ,g ,b));
        getImage().fillRect(0,0,70,70);
    }
    public void act()
    {
    countLength++;
    if(countLength>3 && isTouching(Snake.class))
    {
        MyWorld myWorld = (MyWorld) getWorld();
        myWorld.displayKalah();
    }
    if(countLength > playerLength)
    {
        getWorld().removeObject(this);
    }
    }
}
