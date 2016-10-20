import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Monkey extends MoveableObject
{
    private boolean movingLeft;
    
    public Monkey()
    {
        movingLeft = true;
        speed = 1;
    }

    public void act() 
    {
        int x = getX();
        int y = getY();

        if (checkCollisionWithHero() )        
        {
            return;
        }

        if ( isAtEdge() )
        {
            turn(17);       
        }    

        if (Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(4);
        }

        else
        {
            x += speed;
        }
        setLocation (x, y);
        move(5);
    }

    public boolean checkCollisionWithHero()
    {
        Hero collideHero =
            (Hero)getOneIntersectingObject(Hero.class);
        if ( collideHero !=null)
        {
            JungleWorld world = (JungleWorld)getWorld();
            world.youLose();
            getWorld().removeObject( collideHero);
            getWorld().removeObject( this);            
            return true;
        }
        return false;        
    }
}