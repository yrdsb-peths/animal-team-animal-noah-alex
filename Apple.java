import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 1;
    public void act()
    {
        GreenfootImage image = new GreenfootImage("apple2.png");
        image.scale(50, 50);
        setImage(image);
        int x = getX();
        int y = getY() + speed;
        setLocation(x,y);
        
        //references the world
        MyWorld world = (MyWorld) getWorld();
        //adds the gameover once u die 
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }

    }
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
