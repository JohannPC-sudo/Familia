/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package familia;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @johann Lopez
 */
public class Familia {
    /**
     * @param args the command line arguments
     */    
    private final ArrayList<Hermano> hermanos;

    public Familia() {
        hermanos = new ArrayList<>();
    }

    public void agregarHermano(Hermano hermano) {
        hermanos.add(hermano);
    }

    public Hermano obtenerHermanoMayor() {
        Hermano mayor = hermanos.get(0);
        for (Hermano hermano : hermanos) {
            if (hermano.getEdad() > mayor.getEdad()) {
                mayor = hermano;
            }
        }
        return mayor;
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Familia familia = new Familia();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese el nombre del hermano " + i + ": ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer
            familia.agregarHermano(new Hermano(nombre, edad));
    }
         Hermano hermanoMayor = familia.obtenerHermanoMayor();
         System.out.println("El hermano mayor es: " + hermanoMayor.getNombre() + " con " + hermanoMayor.getEdad() + " anos.");
    
   }
}
