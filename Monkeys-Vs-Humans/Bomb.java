import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends MoveableObject
{
    int damage = 25;
    public int score;

    public Bomb()
    {
        speed =4;
    }

    

    public void act() 
    {
        moveDown();
        
        if (checkIsOffScreen() || checkCollisionWithMonkey() )
        {
            return;
        }
    }    

    public boolean checkIsOffScreen()
    {
        if(isAtEdge() )
        {
            getWorld().removeObject(this);
            return true;
        }
        return false;
    }

    public boolean checkCollisionWithMonkey()
    {
        Monkey collideMonkey =
            (Monkey)getOneIntersectingObject(Monkey.class);            
        if ( collideMonkey !=null)
        {    
            JungleWorld world = (JungleWorld)getWorld();
            world.addScore();
            getWorld().removeObject( collideMonkey);
            getWorld().removeObject( this);            
            return true;
            
        }
        
        return false;
    }

}