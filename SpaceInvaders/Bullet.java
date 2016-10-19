import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bullet extends MoveableObject
{
    public Bullet()
    {
        speed =4;
    }

    public void act() 
    {
        moveUp();
        if (checkIsOffScreen() || checkCollisionWithInvader() )
        {
            return;
        }
    }    

    public boolean checkIsOffScreen()
    {
        if (isAtEdge() )
        {
            getWorld().removeObject(this);
            return true;
        }
        return false;
    }

    public boolean checkCollisionWithInvader()
    {
        Invader collideInvader =
            (Invader)getOneIntersectingObject(Invader.class);
        if ( collideInvader !=null)
        {
            getWorld().removeObject( collideInvader);
            getWorld().removeObject( this);
            return true;
        }
        return false;
    }

}
