import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)
/**
 * This defines the crabworld
 * @author Jack
 * @version Oct.2/2024
 */
public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepareScene();
    }
    
    private void prepareScene()
    {
        addPlayer();
        randomAddWorm();
    }
    
    private void addPlayer()
    {
        Crab crab = new Crab();
        addObject(crab, 470, 100);
        
        Lobster lobster = new Lobster();
        addObject(lobster, 400, 200);
    }
    
    private void randomAddWorm()
    {
        for (int i = 0; i < 8; i++) 
        {
            Worm worm = new Worm();
            int x = Greenfoot.getRandomNumber(530);
            int y = Greenfoot.getRandomNumber(530);
            addObject(worm, x, y);
        }
    }
}        
    