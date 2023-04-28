package proyectoestructura;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        Inicio in =new Inicio();
        in.setVisible(true);
        Juego j=new Juego();
        j.batalla();
        Temporizador t=new Temporizador();
        t.detener();
        
    }
     
}   