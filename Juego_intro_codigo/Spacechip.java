import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spacechip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spacechip extends Actor
{  
    /**
     * Act - do whatever the Spacechip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moving();       
    }    
    public void moving()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(4);
        }
        if (("space").equals(Greenfoot.getKey()))
        {
            shoot();
        }
    }
    public void shoot()
    {               
        new Bullet();
        Bullet bullet = new Bullet();
        getWorld().addObject(bullet,getX(),getY());
    }
}
