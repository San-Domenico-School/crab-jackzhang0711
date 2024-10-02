import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a lobster. lobster random move on the beach.
 * 
 * @author Jack Zhang
 * @version Oct.1/2024 
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