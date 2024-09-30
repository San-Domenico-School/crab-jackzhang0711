import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 * @author BGustin
 * @version 6/1/2022 5:48am
 */
public class Crab extends Actor
{
    private int speed = 3;
    private GreenfootSound wormSound = new GreenfootSound("chime.wav");
    private GreenfootSound lobsterSound = new GreenfootSound("au.wav"); 
    private GreenfootSound winSound = new GreenfootSound("fanfare.wav");
    private GreenfootSound lostSound = new GreenfootSound("au.wav");

    public void act()
    {
        checkKeyPress();
        move(speed);
        turnAtEdge();
        checkCollision();
    }

    public void checkKeyPress()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(5);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            speed++;
        }
        if (Greenfoot.isKeyDown("down"))
        {
            if (speed > 1)
            {
                speed--;
            }
        }
    }

    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(180);
        }
    }

    public void checkCollision()
    {
        if (isTouching(Worm.class))
        {
            removeTouching(Worm.class);
            wormSound.play();
            if (getWorld().getObjects(Worm.class).isEmpty())
            {
                winSound.play();
                displayMessage("You Won");
                Greenfoot.stop();
            }
        }
        if (isTouching(Lobster.class))
        {
            lobsterSound.play(); 
            lostSound.play();
            displayMessage("You Lost");              
            Greenfoot.stop();
        }
    }
    private void displayMessage(String message)
    {
        World world = getWorld();
        world.showText(message, world.getWidth() / 2, world.getHeight() / 2);
    }
}
