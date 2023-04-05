package proyectoestructura;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws InterruptedException {
        
        //Prueba para ingresar e imprimir personajes en una cola
        
        /*Cola cola1 = new Cola();
        cola1.agregar(new Nodo(new Personaje("Arturo",5)));
        cola1.agregar(new Nodo(new Personaje("Carlos",5)));
        cola1.agregar(new Nodo(new Personaje("Ramiro",5)));
        System.out.println(cola1.imprimir());
        */
        
        //Prueba para crear una matriz de personajes
        Personaje[][] matriz = new Personaje[5][10];
        
        //Personaje personajeMovible = new Mago("Merlin",5);
        //Personaje personajeMovible = new Caballero("Arturo",5);
        Personaje personajeMovible = new Arquero("C",6);
        Personaje personaje2 = personajeMovible;
        //elegir un personaje aleorio
        Random random = new Random();
        while ( personaje2 == personajeMovible) {
            int indice = random.nextInt(3);
            if (indice == 0) {
                personaje2 = new Arquero("A", 5);
            } else if (indice == 1) {
                personaje2 = new Caballero("C", 6);
            } else {
                personaje2 = new Mago("M", 7);
            }
        }
        //Aqui podemos elegir cual de los caminos ingresar el personaje
        int op=1;
        // Insertar los personajes en la matriz
        if (op==1) {
            matriz[0][0] = personajeMovible;
            matriz[0][9] = personaje2;
        // Mover los personajes hacia el centro de la matriz
        for (int i = 1; i < 5; i++) {
            matriz[0][i] = personajeMovible;
            matriz[0][9-i] = personaje2;
            imprimirPersonajesMovibles(matriz,i);
            Thread.sleep(2000);
        }
        // Evaluar el enfrentamiento de los personajes
        if (personajeMovible.getFuerza() > personaje2.getFuerza()) {
            System.out.println(personajeMovible.getNombre() + " gana el enfrentamiento");
        } else if (personaje2.getFuerza() > personajeMovible.getFuerza()) {
            System.out.println(personaje2.getNombre() + " gana el enfrentamiento");
        } else {
            System.out.println("Empate en el enfrentamiento");
        }
        
        }else if(op==2){
            matriz[3][0] = personajeMovible;
            matriz[3][9] = personaje2;
            // Mover los personajes hacia el centro de la matriz
        for (int i = 1; i < 5; i++) {
            matriz[3][i] = personajeMovible;
            matriz[3][9-i] = personaje2;
            imprimirPersonajesMovibles(matriz,i);
            Thread.sleep(2000);
        }
        // Evaluar el enfrentamiento de los personajes
        if (personajeMovible.getFuerza() > personaje2.getFuerza()) {
            System.out.println(personajeMovible.getNombre() + " gana el enfrentamiento");
        } else if (personaje2.getFuerza() > personajeMovible.getFuerza()) {
            System.out.println(personaje2.getNombre() + " gana el enfrentamiento");
        } else {
            System.out.println("Empate en el enfrentamiento");
        }
        }else{
            System.out.println("La opcion de camino no es valida");
        }
        
}   
    public static void imprimirPersonajesMovibles(Personaje[][] matriz, int indice) {
    System.out.println("----------------------------");
                
    for (int i = 0; i < matriz.length; i++) {
        System.out.print("|");
        for (int j = 0; j < matriz[0].length; j++) {
            if (matriz[i][j] == null) {
                    System.out.print("- ");
                } 
            else if (i == 0 && (j < indice || j > matriz[0].length-1-indice)) {
                System.out.print("- ");
            } else if (matriz[i][j] == null) {
                System.out.print("- ");
            } else {
                System.out.print(matriz[i][j].getNombre() + "(" + matriz[i][j].getFuerza() + ")");
            }
        }
        System.out.println("|");
    }
    System.out.println("----------------------------");
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
    
    

