import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class JungleWorld extends World
{
    static int score;

    private Hero hero;

    public JungleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        hero = new Hero();
        hero.setRotation(360);
        addObject( hero, getWidth() *4, getHeight() - 100);
        score =0;

        for (int y =0; y< 1; y++ )
        {
            for ( int x =2; x <12; x++)
            {
                addObject( new Monkey(), x * 100, y* 100 );
            }
        }

    }

    public void addBomb( int x, int y)
    {
        addObject( new Bomb(), x, y);
    }

    public static void addScore()
    {
        score += 1;
    }

    public void act()
    {
        int MonkeyCount = getObjects(Monkey.class).size();
        int HeroCount = getObjects(Hero.class).size();
        showText("Score; " + score, getWidth() -350, getHeight()-30 );
        if(MonkeyCount == 0)
        {

            youWin();
        }
        else if (HeroCount==0)
        {
            youLose();
        }

    }

    public void youWin()
    {
        showText(" You win!", getWidth() / 2, getHeight() / 2 );
        Greenfoot.stop();
    }

    void youLose()
    {
        showText("You lose!", getWidth() / 2, getHeight() / 2);
        Greenfoot.stop();

    }

}