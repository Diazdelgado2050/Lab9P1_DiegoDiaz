/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_diegodiaz;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author diego
 */
public class Lab9P1_DiegoDiaz {

    static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        MegaMan Player = new MegaMan(100.0, 100.0,0,0);
        String[] bosses = {"Acid Man", "Blast Man", "Block Man", "Bounce Man", "Fuse Man", "Impact Man", "Torch Man", "Tundra Man"};
        
        int[] beaten = new int[8];
        Savefile[] archivosGuardado = new Savefile [10];
        ArrayList<String[]> registrosLogs = new ArrayList<>();
        
        
        
        
        do {
           
            System.out.println("1. Cambiar a un boss en el arreglo");
            System.out.println("2. Buscar info de bosses");
            System.out.println("3. Ordenar jefe en arreglo");
            System.out.println("4. Buscar jefe en logs");
            System.out.println("5. ver archivos de guardado");
            System.out.println("6. Iniciar juego");
            System.out.println("7. Salir ");
            System.out.print("Seleccione una opcion del menu: ");
            
            opcion = leer.nextInt();
            
            
            switch (opcion) {
                case 1:
                    cambiarBoss(bosses, beaten, registrosLogs);
                    break;
                case 2:
                    infoBoss(bosses, beaten);
                    break;
                case 3:
                    ordenBosses(bosses, beaten);
                    break;
                case 4:
                    BuscarenLogs(registrosLogs);
                    break;
                   
                case 5:
                    partidas(archivosGuardado);           
                    break;
                case 6:
                    iniciarJuego()
                    break;
                default:
                    throw new AssertionError();
            }
            
            
        } while (opcion != 7);
        System.out.println("Saliendo de el programa..");
        
    }
    
    
    public static void cambiarBoss(String [] bosses, int [] beaten, ArrayList<String[]> logs){
       System.out.println("jefes actuales:");
        for (int i = 0; i < bosses.length; i++) {
            System.out.println(i + ". [" + bosses[i] + "]");
        }
        System.out.print("Nombre del boss a cambiar: "); 
        String nomAnterior = leer.nextLine();
        
        System.out.print("Nombre del nuevo boss: ");
        String nuevo = leer.nextLine();
        
        boolean nomactual = false;
        for (int i = 0; i < bosses.length; i++) {
            if (bosses[i].equalsIgnoreCase(nuevo)) {
                nomactual = true;
            }
        }
        if (nomactual) {
            System.out.println("Ese jefe ya esta en el arreglo.");
        } else {
            int indice = -1;
            for (int i = 0; i < bosses.length; i++) {
                if (bosses[i].equalsIgnoreCase(nomAnterior)) {
                    indice = i;
                }
            }
            
            if (indice != -1) {
                String[] copia = new String[8];
                for (int k = 0; k < 8; k++) {
                    copia[k] = bosses[k];
                }
                logs.add(copia);
                
                bosses[indice] = nuevo;
                beaten[indice] = 0;
                System.out.println("Se reemplazo el boss correctamente ");
            } else {
                System.out.println("No se encontro el boss anterior ");
            }
        }
    }
    public static void infoBoss(String[]bosses, int[]beaten){
        System.out.print("Ingrese posicion del boss del ( de 0 a 7): ");
        int pos = leer.nextInt();
        leer.nextLine(); 
        
        if (pos >= 0 && pos <= 7) {
            String bono = (bosses[pos].length() % 2 != 0) ? "fuerza" : "vida";
            System.out.println("Boss: " + bosses[pos] +" |Derrotas: " + beaten[pos] + "|Bono: " + bono);
        } else {
            System.out.println("Posicion incorrecta.");
        }
    }
    public static void ordenBosses(String []bosses, int[] beaten){
        System.out.println("1) Por la primera letra");
        System.out.println("2) por la cantidad de letras");
        System.out.println("Elige la manera a ordenar los bosses: ");
        int op = leer.nextInt();
        leer.nextLine();
        
        if (op == 1) {
            for (int i = 0; i < bosses.length; i++) {
                for (int j = 0; j < bosses.length - 1; j++) {
                    if (bosses[j].charAt(0) > bosses[j+1].charAt(0)) {
                        String temp = bosses[j];
                        bosses[j] = bosses[j+1];
                        bosses[j+1] = temp;
                    }
                }
            }
        } else if (op == 2) {
            ordenarR(bosses, bosses.length);
        }
        
        for (int i = 0; i < bosses.length; i++) {
            beaten[i] = 0;
        }
        System.out.println("Arreglo ordenado correctamente ");
    }
    public static void ordenarR(String[] arr, int tam) {
        if (tam <= 1) {
            return;
        }
        for (int i = 0; i < tam - 1; i++) {
            if (arr[i].length() > arr[i + 1].length()) {
                String temporal = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temporal;
            }
        }
        ordenarR(arr, tam - 1);
    }
    public static void BuscarenLogs(ArrayList<String[]> logs) {
        System.out.print("Nombre del jefe a buscar en los registros del dr.Light: ");
        String buscarJefe = leer.nextLine();
        buscarEnarreglo(logs, buscarJefe);
   
        
        
    }
    public static void buscarEnarreglo(ArrayList<String[]> lista, String jefe){
        
        System.out.println("Resultados de busqueda en arreglo de jefe:" + jefe);
        for (int i = 0; i < lista.size(); i++) {
            String[] arregloActual = lista.get(i);
            boolean nomactual = false;
            
            for (int k = 0; k < arregloActual.length; k++) {
                if (arregloActual[k].equalsIgnoreCase(jefe)) {
                    nomactual = true;
                }
            }
            
            if (nomactual) {
                System.out.print("Log " + i + ": ");
                for (int j = 0; j < arregloActual.length; j++) {
                    if (arregloActual[j].equalsIgnoreCase(jefe)) {
                        System.out.print(arregloActual[j].toLowerCase() + "  ");
                    } else {
                        System.out.print("- -  -");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void partidas(Savefile[] archivos){
        for (int i = 0; i < archivos.length; i++) {
            if (archivos[i] != null) {
                System.out.println("----->");
                if (archivos[i].getSuccess()) {
                    System.out.println("Juego completado muy bien");
                }else{
                    System.out.println("Gmme over");
                    
                }
                System.out.println("vidas: " + archivos[i].getLives());
                System.out.print("[ ");
                String[] boss = archivos[i].getBosses();
                int[] d = archivos[i].getBeaten();
                for(int j = 0; j < boss.length; j++){
                    System.out.print(boss[j] + "(" + d[j] + ")");
                    if(j < boss.length - 1) System.out.print(", ");
            }
        }
    }
    }
    public static void iniciarJuego(MegaMan mega, String[] jefes, int[] derrotas, Savefile[] saves) {
        System.out.println("¡¡Ayuda al dr Light a vencer a Wily y su ejercito de robots !! ");
        System.out.println("Ingrese la cantidad de vidas de Megaman:");
        int vidas = leer.nextInt();
        leer.nextLine();
        
        mega.sStrenghtUp(0);
        mega.sHealth(0);
        
        System.out.println("Empieza el juego Buena suerte Mega!");
        System.out.println("===== Vidas de Megaman: " + vidas + " ====");
        
}
}




            
           
                
      

        
    
                    
                    
     
        
        
    

    

    
        
    
    
    

    
     

        
    
    

