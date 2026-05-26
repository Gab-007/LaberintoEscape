import greenfoot.*;

public class Player extends Actor
{
    boolean tieneLlave = false;

    public void act()
    {
        mover();

        recogerLlave();

        tocarPuerta();

        tocarEnemigo();
    }

    public void mover()
    {
        int velocidad = 4;

        int x = getX();
        int y = getY();

        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x - velocidad, y);
            
            if(isTouching(Wall.class))
            {
                setLocation(x, y);
            }
        }

        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + velocidad, y);

            if(isTouching(Wall.class))
            {
                setLocation(x, y);
            }
        }

        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y - velocidad);

            if(isTouching(Wall.class))
            {
                setLocation(x, y);
            }
        }

        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y + velocidad);

            if(isTouching(Wall.class))
            {
                setLocation(x, y);
            }
        }
    }

    public void recogerLlave()
    {
        Actor llave = getOneIntersectingObject(Key.class);

        if(llave != null)
        {
            tieneLlave = true;

            getWorld().removeObject(llave);

            getWorld().showText("Llave obtenida", 300, 30);
        }
    }

    public void tocarPuerta()
    {
        Actor puerta = getOneIntersectingObject(Door.class);

        if(puerta != null && tieneLlave)
        {
            getWorld().showText("¡GANASTE!", 500, 300);

            Greenfoot.stop();
        }
    }

    public void tocarEnemigo()
    {
        Actor enemigo = getOneIntersectingObject(Enemy.class);

        if(enemigo != null)
        {
            getWorld().showText("GAME OVER", 300, 200);

            Greenfoot.stop();
        }
    }
}