import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Invader extends MoveableObject
{
    private boolean movingLeft;
    public Invader()
    {
        movingLeft = true;
        speed = 1;
    }

    public void act() 
    {
        int x = getX();
        int y = getY();

        if ( isAtEdge() )
        {
            movingLeft = !movingLeft;
            y += 50;
            setRotation( getRotation() + 180 );       
        }    

        if (movingLeft)
        {
            x-= speed;
        }
        else
        {
            x += speed;
        }
        if (y > getWorld().getHeight() - 50)
        {
            SpaceWorld world = (SpaceWorld)getWorld();
            world.youLose();
        }
        setLocation (x, y);
    }

}
