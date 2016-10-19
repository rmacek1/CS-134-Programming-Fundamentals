import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MoveableObject extends Actor
{
   protected int speed;
   
    public void act() 
    {
       
    }    
    
    public void moveLeft()
    {
        setLocation( getX() - speed, getY() );
    }
    
    public void moveRight()
    {
        setLocation( getX() + speed, getY() );
    }
    
    public void moveUp()
    {
        setLocation( getX(), getY() - speed  );
    }
    
    public void moveDown()
    {
        setLocation( getX(), getY() + speed  );
    }
    
  
}
