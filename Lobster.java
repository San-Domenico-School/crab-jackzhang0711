import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(2);
        turnAtEdge();
        randomTurn();
    }
    public void turnAtEdge() 
    {
        if (isAtEdge())
        {
            turn(180);
        }  
    }
    public void randomTurn() 
    {
    int randomTurn = Greenfoot.getRandomNumber(20);  
    if (randomTurn < 5) {  
        int turnAngle = Greenfoot.getRandomNumber(90) - 45; 
        turn(turnAngle);
    }
    }
}