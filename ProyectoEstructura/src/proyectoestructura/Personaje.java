package proyectoestructura;

public class Personaje {
    
    private String nombre;
    private int fuerza;

    public Personaje(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }
    
    
    
}
