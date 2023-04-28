package proyectoestructura;

public class Personaje {
    
    private String nombre;
    private int fuerza;
    private int camino;
    private String debilidad;

    public Personaje(String nombre, int fuerza,String debilidad,int camino) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.debilidad = debilidad;
        this.camino = camino;
    }
    public int getCamino() {
        return camino;
    }
    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public void setCamino(int camino) {
        this.camino = camino;
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