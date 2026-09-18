/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_diegodiaz;

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
        // TODO code application logic here
        
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
                    System.out.println("Bueno");
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
    
    
    
    
}
