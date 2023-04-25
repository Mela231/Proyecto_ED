package proyectoestructura;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Inicio in =new Inicio();
        in.setVisible(true);
        Temporizador t=new Temporizador();
        t.setVisible(true);
        t.iniciar();
        Juego j=new Juego();
        j.batalla();
        VGameOver g=new VGameOver();
        g.setVisible(true);
        t.detener();
    }
     
}   
    
    
    
    

        
        
        
        
        

    
    
