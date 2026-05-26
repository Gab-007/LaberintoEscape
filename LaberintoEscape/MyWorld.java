import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(975, 575, 1); 
        
        prepararMundo();
    
        showText("Busca la llave y escapa", 500, 20);

    }
    public void prepararMundo()
    {
        addObject(new Fondo(), 500, 300);
        
        addObject(new Player(), 100, 100);
    
        addObject(new Key(), 500, 150);
    
        addObject(new Door(), 850, 500);
    
        addObject(new Enemy(), 500, 500);
    
        crearParedes();
    }
    public void crearParedes()
    {
        // Bordes superiores e inferiores
        for(int x = 50; x <= 950; x += 50)
        {
            addObject(new Wall(), x, 25);
            addObject(new Wall(), x, 550);
            addObject(new Wall(), 25, 550);
        }
    
        // Bordes laterales
        for(int y = 100; y <= 500; y += 50)
        {
            addObject(new Wall(), 25, 25);
            addObject(new Wall(), 25, 50);
            addObject(new Wall(), 25, y);
            addObject(new Wall(), 950, y);
            addObject(new Wall(), 950, 67);
        }
    
        // Parte izquierda
        for(int y = 150; y <= 400; y += 50)
        {
            addObject(new Wall(), 175, y);
        }
    
        // Parte derecha
        for(int y = 150; y <= 450; y += 50)
        {
            addObject(new Wall(), 750, y);
        }
    
        // Centro horizontal
        for(int x = 300; x <= 650; x += 50)
        {
            addObject(new Wall(), x, 250);
        }
    
        // Centro abajo
        for(int x = 300; x <= 650; x += 50)
        {
            addObject(new Wall(), x, 450);
        }
    
        // Pared vertical central izquierda
        for(int y = 300; y <= 450; y += 50)
        {
            addObject(new Wall(), 300, y);
        }
    
        // Pared vertical central derecha
        for(int y = 150; y <= 250; y += 50)
        {
            addObject(new Wall(), 650, y);
        }
    }
}