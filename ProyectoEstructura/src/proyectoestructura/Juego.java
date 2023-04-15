package proyectoestructura;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    
    private int FILAS = 5;
    private int COLUMNAS = 10;
    private int castilloU = 10;
    private int castilloC = 10;
    private int restaU,restaC; 
    private int cont=1; 
    
    public void batalla() throws InterruptedException {
        
    
        while(castilloU>0 && castilloC>0){
         System.out.println("************************************");
         System.out.println("*--------------RONDA "+cont+"-------------*");  
         System.out.println("************************************");
        //Prueba para crear una matriz de personajes
        Cola colaPersonajes = agregarPersonajesUsuario();
        Cola colaPersonajesC = crearPersonajeAleatorio();
        Personaje[][] matriz = new Personaje[FILAS][COLUMNAS];
        // Pelear hasta que solo quede un personaje en la cola
       
        
        while ((!colaPersonajes.estaVacia() || !colaPersonajesC.estaVacia())&&
                (castilloU>0 && castilloC>0)){ 
         
           Nodo nodoPersonaje1 = colaPersonajes.atiende();
           Nodo nodoPersonaje2 = colaPersonajesC.atiende();
           Personaje personaje1 = nodoPersonaje1.getDato();
           Personaje personaje2 = nodoPersonaje2.getDato();
           
           //Inserta los personajes en una fila de la matriz
           if (personaje1.getCamino()==1 ||personaje2.getCamino()==1) {
            matriz[0][0] = personaje1;
            matriz[0][9] = personaje2;
        // Mover los personajes hacia el centro de la matriz
        for (int i = 1; i < 5; i++) {
            matriz[0][i] = personaje1;
            matriz[0][9-i] = personaje2;
            imprimirPersonajesMovibles(matriz,i);
            Thread.sleep(2000);
        }
        if (personaje1.getNombre().equals("m")) {
            if (personaje2.getNombre().equals("a")) {
         // Si el mago es débil con el arquero, entonces gana el arquero
             System.out.println(personaje2.getNombre() + " gana el "
                     + "enfrentamiento");
             restaU=castilloU-personaje2.getFuerza();
             castilloU=restaU;
             System.out.println("El castillo del Usuario tiene "+restaU+" vida.");
            } else if (personaje2.getNombre().equals("c")) {
        // Si el mago es débil con el caballero, entonces gana el caballero
            System.out.println(personaje1.getNombre() + " gana el"
                    + " enfrentamiento");
            restaC=castilloC-personaje1.getFuerza();
             castilloC=restaC;
             System.out.println("El castillo de la CPU tiene"+restaC+"vida.");
             } else {
            // Si el mago no es débil con ningún otro personaje, 
            //entonces gana el mago
             System.out.println("Empate en el enfrentamiento");
             }
            
        } else if (personaje1.getNombre().equals("a")) {
            
             if (personaje2.getNombre().equals("m")) {
        // Si el arquero es débil con el mago, entonces gana el mago
             System.out.println(personaje1.getNombre() + " gana "
                     + "el enfrentamiento");
             restaC=castilloC-personaje1.getFuerza();
             castilloC=restaC;
             System.out.println("El castillo del CPU tiene"+restaC+"vida.");  
            } else if (personaje2.getNombre().equals("c")) {
        // Si el arquero es débil con el caballero, entonces gana el caballero
             System.out.println(personaje2.getNombre() + " gana "
                     + "el enfrentamiento");
             restaU=castilloU-personaje2.getFuerza();
             castilloU=restaU;
             System.out.println("El castillo del Usuario tiene"+restaU+"vida.");
            } 
            else {
        // Si el arquero no es débil con ningún otro personaje, entonces 
        //gana el arquero
              System.out.println("Empate en el enfrentamiento");
            }
        } else if (personaje1.getNombre().equals("c")) {
            if (personaje2.getNombre().equals("m")) {
        // Si el caballero le gana al mago, entonces gana el caballero
             System.out.println(personaje2.getNombre() + " gana el"
                     + " enfrentamiento");
             restaU=castilloU-personaje2.getFuerza();
             castilloU=restaU;
             System.out.println("El castillo del Usuario tiene"+restaU+"vida.");
            } else if (personaje2.getNombre().equals("a")) {
        // Si el caballero es débil con el arquero, entonces gana el arquero
              System.out.println(personaje1.getNombre() + " gana el "
                      + "enfrentamiento");
              restaC=castilloC-personaje1.getFuerza();
              castilloC=restaC;
             System.out.println("El castillo de la CPU tiene"+restaC+"vida.");
            } else {
        // Si el caballero no es débil con ningún otro personaje, 
        //entonces gana el caballero
                  System.out.println("Empate en el enfrentamiento");
            }
        } 
        
        }else if(personaje1.getCamino()==2 || personaje2.getCamino()==2){
            matriz[3][0] = personaje1;
            matriz[3][9] = personaje2;
            // Mover los personajes hacia el centro de la matriz
        for (int i = 1; i < 5; i++) {
            matriz[3][i] = personaje1;
            matriz[3][9-i] = personaje2;
            imprimirPersonajesMovibles(matriz,i);
            Thread.sleep(2000);
        }
        // Evaluar el enfrentamiento de los personajes
        if (personaje1.getNombre().equals("m")) {
            if (personaje2.getNombre().equals("a")) {
         // Si el mago es débil con el arquero, entonces gana el arquero
             System.out.println(personaje2.getNombre() + " gana el "
                     + "enfrentamiento");
             restaU=castilloU-personaje2.getFuerza();
             castilloU=restaU;
             System.out.println("El castillo del Usuario tiene"+restaU+"vida.");
            } else if (personaje2.getNombre().equals("c")) {
        // Si el mago es débil con el caballero, entonces gana el caballero
            System.out.println(personaje1.getNombre() + " gana el"
                    + " enfrentamiento");
                restaC=castilloC-personaje1.getFuerza();
                castilloC=restaC;
             System.out.println("El castillo de la CPU tiene"+restaC+"vida.");
             } else {
            // Si el mago no es débil con ningún otro personaje, 
            //entonces gana el mago
             System.out.println("Empate en el enfrentamiento");
             }
            
        } else if (personaje1.getNombre().equals("a")) {
            
             if (personaje2.getNombre().equals("m")) {
             System.out.println(personaje1.getNombre() + " gana el "
                     + "enfrentamiento");
             restaC=castilloC-personaje1.getFuerza();
             castilloC=restaC;
             System.out.println("El castillo de la CPU  tiene"+restaC+"vida.");
            } else if (personaje2.getNombre().equals("c")) {
        
             System.out.println(personaje2.getNombre() + " gana el"
                     + " enfrentamiento");
             restaU=castilloU-personaje2.getFuerza();
             castilloU=restaU;
             System.out.println("El castillo del Usuario tiene"+restaU+"vida.");
            } 
            else {
       
              System.out.println("Empate en el enfrentamiento");
            }
        } else if (personaje1.getNombre().equals("c")) {
            if (personaje2.getNombre().equals("m")) {
        
             System.out.println(personaje2.getNombre() + " gana el "
                     + "enfrentamiento");
             restaU=castilloU-personaje2.getFuerza();
             castilloU=restaU;
             System.out.println("El castillo del Usuario tiene"+restaU+"vida.");
            } else if (personaje2.getNombre().equals("a")) {
       
              System.out.println(personaje1.getNombre() + " gana el "
                      + "enfrentamiento");
            restaC=castilloC-personaje1.getFuerza();
              castilloC=restaC;
             System.out.println("El castillo de la CPU tiene"+restaC+"vida.");   
            } else {
       
                  System.out.println("Empate en el enfrentamiento");
            }
        }  
        }
        } cont++; 
    } System.out.println("Ganador");
    }
    public void camino(){
        
    }
    
    
    public Cola agregarPersonajesUsuario() {
    Scanner scanner = new Scanner(System.in);
    Cola cola=new Cola();
    int totalTropas = 0;
    int rondas=4+cont;
    while (totalTropas < rondas) { // se pueden tener como máximo 5 tropas
        System.out.println("Ingrese el tipo de tropa que desea crear: "
                + "(mago, arquero, caballero)");
        String tipoTropa = scanner.nextLine();
        System.out.println("Ingrese la cantidad de tropas que desea "
                + "crear de tipo:"+ tipoTropa);
        int cantidadTropas = scanner.nextInt();
        System.out.println("Por cual de los dos caminos desea enviar su tropa?"
                + tipoTropa);
        int camino = scanner.nextInt();
        scanner.nextLine(); // limpiar el buffer de entrada
        if (totalTropas + cantidadTropas > rondas) {
            System.out.println("Solo se pueden tener como máximo 5 tropas. "
                    + "Por favor ingrese una cantidad menor.");
            continue;
        }
        for (int i = 0; i < cantidadTropas; i++) {
            int fuerza = 0;
            String debilidad = "";
            switch (tipoTropa.toLowerCase()) {
                case "m":
                    fuerza = 2;
                    debilidad = "a";
                    break;
                case "a":
                    fuerza = 1;
                    debilidad = "c";
                    break;
                case "c":
                    fuerza = 3;
                    debilidad = "m";
                    break;
                default:
                    System.out.println("Tipo de tropa no válido. "
                            + "Por favor ingrese un tipo válido.");
                    break;
            }
            Personaje tropa = new Personaje(tipoTropa,
                    fuerza, debilidad,camino);
            Nodo nodo= new Nodo(tropa);
            cola.agregar(nodo);
            totalTropas++;
        }
    }
    return cola;
    }
    public Cola crearPersonajeAleatorio() {
    Random rand = new Random();
    Cola cola1=new Cola();//se decidio encolar los personajes aleatorios,por eso
    //el llamado a la clase cola
    int rondas=4+cont;
    int totalTropas = 0;
     while (totalTropas < rondas) {
        String tipoTropa = "";
        int tipoTropaNum = rand.nextInt(3);
        int camino = rand.nextInt(2);
        switch (tipoTropaNum) {
            case 0:
                tipoTropa = "m";
                break;
            case 1:
                tipoTropa = "a";
                break;
            case 2:
                tipoTropa = "c";
                break;
        }
        int cantidadTropas = rand.nextInt(rondas - totalTropas) + 1;
        if (totalTropas + cantidadTropas > rondas) { 
       // validación adicional para evitar exceder el límite
            cantidadTropas = rondas - totalTropas;
        }
        for (int i = 0; i < cantidadTropas; i++) {
            int fuerza = 0;
            String debilidad = "";
            switch (tipoTropa) {
                case "m":
                    fuerza = 2;
                    debilidad = "a";
                    break;
                case "a":
                    fuerza = 1;
                    debilidad = "c";
                    break;
                case "c":
                    fuerza = 3;
                    debilidad = "m";
                    break;
            }
            Personaje tropa = new Personaje(tipoTropa, fuerza, debilidad,camino);
            Nodo nodo= new Nodo(tropa);
            cola1.agregar(nodo);
            totalTropas++;
            if (totalTropas >= 5) {
                break;
            }
        }
        
    }
    return cola1;

    }
    
    public void imprimirPersonajesMovibles(Personaje[][] matriz, int indice) {
    System.out.println("----------------------------");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
        for (int j = 0; j < matriz[0].length; j++) {
        if (matriz[i][j] == null) {
                System.out.print("- ");
        } else if ((i != 1 && i != matriz.length - 1) && (j < indice || j 
                    > matriz[0].length-1-indice)){
            System.out.print("- ");
        } else if (matriz[i][j] == null) {
                
        }else {
            System.out.print(matriz[i][j].getNombre() + "(" + 
                    matriz[i][j].getFuerza() + ")");
            matriz[i][j] = null; // establecer la posición actual en null
        }   
        }
            System.out.println("|");
        }
        System.out.println("----------------------------");
        }
    
}
