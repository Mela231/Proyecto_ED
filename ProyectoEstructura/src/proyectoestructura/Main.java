package proyectoestructura;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        //Prueba para ingresar e imprimir personajes en una cola
        
        /*Cola cola1 = new Cola();
        cola1.agregar(new Nodo(new Personaje("Arturo",5)));
        cola1.agregar(new Nodo(new Personaje("Carlos",5)));
        cola1.agregar(new Nodo(new Personaje("Ramiro",5)));
        System.out.println(cola1.imprimir());
        */
        
        //Prueba para crear una matriz de personajes
        Personaje[][] matrizPersonajes = new Personaje[10][10];
        
        //Personaje personajeMovible = new Mago("Merlin",5);
        //Personaje personajeMovible = new Caballero("Arturo",5);
        Personaje personajeMovible = new Arquero("Ramiro",5);
        Personaje personajeAleatorio = personajeMovible;
        //elegir un personaje aleorio
        Random random = new Random();
        
        while (personajeAleatorio == personajeMovible) {
            int indice = random.nextInt(3);
            if (indice == 0) {
                personajeAleatorio = new Arquero("Ramiro",5);
            } else if (indice == 1) {
                personajeAleatorio = new Caballero("Ramiro",5);
            } else {
                personajeAleatorio = new Mago("Ramiro",5);
            }
        }
        

        String mago = "M";
        String caballero = "C";
        String arquero = "A";
        
        String magoc = "M";
        String caballeroc = "C";
        String arqueroc = "A";
        
        int posicionFila = 8;
        int posicionColumna = 0;
        int posicionAleatorio = 9;

        int filaActual = 0;
        int columnaActual = 0;
        
        // Mover el personaje desde la primera posición hasta la última
      for (int i = posicionFila; i < matrizPersonajes.length; i++) {
        for (int j = posicionColumna; j < matrizPersonajes[i].length; j++) {
        // Verificar si la posición actual es la última
         if (filaActual < 0 || filaActual >= matrizPersonajes.length ||
            columnaActual < 0 || columnaActual >= matrizPersonajes[i].length) {
            break;
        }
    
        // Verificar si la posición actual es la primera
        if (i == 0 && j == 0) {
            // Es la primera posición, mover el personaje aquí
            matrizPersonajes[i][j] = personajeMovible;
            filaActual = i;
            columnaActual = j;
        } else {
            // Es otra posición, mover el personaje aquí y esperar 2 segundos
            matrizPersonajes[filaActual][columnaActual] = null;
            matrizPersonajes[i][j] = personajeMovible;
            filaActual = i;
            columnaActual = j;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        // Imprimir la matriz en la consola
        System.out.println("------------------------");
        for (int k = 0; k < matrizPersonajes.length; k++) {
            for (int l = 0; l < matrizPersonajes[k].length; l++) {
                if (matrizPersonajes[k][l] == null) {
                    System.out.print("- ");
                } else if (matrizPersonajes[k][l] instanceof Mago) {
                    System.out.print(mago + " ");
                } else if (matrizPersonajes[k][l] instanceof Caballero) {
                    System.out.print(caballero + " ");
                } else if (matrizPersonajes[k][l] instanceof Arquero) {
                    System.out.print(arquero + " ");
                }
            }
            System.out.println();
        }
        System.out.println("------------------------");
    }
}
        
        
        
        
        
        
        /*
        Juego j =new Juego();
        Scanner scanner = new Scanner(System.in);
        char tipo;
        System.out.println("Ingrese los 5 personajes:");
        for (int i = 1; i <= 5; i++) {
         do {
         System.out.print("Personaje " + i + ": ");
         tipo = scanner.nextLine().charAt(0);

            switch (tipo) {
            case 'a':
            case 'c':
            case 'm':
                j.agregarPersonaje(new Nodo(new Personaje(tipo)));
                break;
            default:
                System.out.println("Tipo de personaje inválido. Intente de nuevo.");
                break;
        }
            } while (tipo != 'a' && tipo != 'c' && tipo != 'm');
        }
        
        j.ingresarPersonajesEnMatriz();
        j.matriz();
        
        //System.out.println("Personajes ingresados:");
        //System.out.println(cola.imprimir());
        //j.solicitarPersonajes();
        //j.ingresarPersonajesEnMatriz();
        //j.imprimirMatriz();
     
*/
    }
    
}
