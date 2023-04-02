package proyectoestructura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        
    }
    
}
