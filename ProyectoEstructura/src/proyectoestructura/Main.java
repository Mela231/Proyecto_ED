package proyectoestructura;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Juego j=new Juego();
        Temporizador t=new Temporizador();
        t.setVisible(true);
        t.iniciar();
        j.batalla(); 
        VGameOver g=new VGameOver();
        g.setVisible(true);
        t.detener();
    }
     
}   
    
    
    
    

        
        
        
        
        

    
    
