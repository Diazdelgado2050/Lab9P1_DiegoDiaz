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
                    System.out.println("JjJsjsjsj");
                    break;
                case 3:
                    System.out.println("333");
                    break;
                case 4:
                    System.out.println("55666444");
                    break;
                   
                case 5:
                    System.out.println("555");
                    
                    break;
                case 6:
                    System.out.println("66");
                    break;
                default:
                    throw new AssertionError();
            }
            
            
        } while (opcion == 7);
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
                System.out.println("Se reemplazo el boss correctamente.");
            } else {
                System.out.println("No se encontro el boss anterior.");
            }
        }
    }
    public static void infoBoss(String[]bosses, int[]beaten){
        System.out.print("Ingrese posicion del boss (0-7): ");
        int pos = leer.nextInt();
        leer.nextLine(); 
        
        if (pos >= 0 && pos <= 7) {
            String bono = (bosses[pos].length() % 2 != 0) ? "fuerza" : "vida";
            System.out.println("Boss: " + bosses[pos] + " | Derrotas: " + beaten[pos] + " | Bono: " + bono);
        } else {
            System.out.println("Posicion incorrecta.");
        }
    }

    }
        
    
    
    

    
     

        
    
    

