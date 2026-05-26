import greenfoot.*;

public class Enemy extends Actor
{
    public void act()
    {
        seguirJugador();
    }

    public void seguirJugador()
    {
        Player jugador = (Player)getWorld().getObjects(Player.class).get(0);

        turnTowards(jugador.getX(), jugador.getY());

        move(2);
    }
}