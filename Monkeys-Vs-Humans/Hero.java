import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends MoveableObject
{
    private int bombReset;
    

    public Hero()
    {
        speed = 5;

    }

    public void act() 
    {
        int x = getX();
        int y = getY();

        if ( Greenfoot.isKeyDown("left"))
        {
            x-= speed;
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            x += speed;
        }
        else if (Greenfoot.isKeyDown("up"))
        {
            y -= speed;
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            y += speed;
        }
        
        if (Greenfoot.isKeyDown( "space")  && bombReset == 0 )
        {
            JungleWorld world = (JungleWorld)getWorld();
            world.addBomb(x,y);
            bombReset = 20;

        }
        if( bombReset > 0)
        {
            bombReset--;
        }

        setLocation( x,y );
    }    
}