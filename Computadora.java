/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendacompus;

/**
 *
 * @author Kendall Lopéz
 */
public class Computadora {
    //
    String marca;
    String procesador;
    int ramGB;
    double precio;
    
    // aqui se muestra los detalles de la computadora
    public void mostrarDetalles(){
        System.out.println("Computadoras: "+marca);
        System.out.println("Procesador: "+procesador);
        System.out.println("Ram: "+ramGB+"GB");
        System.out.println("Precio: "+precio);
    }
    
}
