/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendacompus;

/**
 *
 * @author Kendall Lopéz
 */
public class TiendaCompus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  // Crear computadora
        Computadora comp1 = new Computadora();
        comp1.marca = "Lenovo";
        comp1.procesador = "Intel Core i5";
        comp1.ramGB = 8;
        comp1.precio = 350000;

        // Crear cliente
        Cliente cli1 = new Cliente();
        cli1.nombre = "María Rodríguez";
        cli1.cedula = "1-1234-5678";

        // Crear factura
        Factura fact1 = new Factura();
        fact1.computadora = comp1;
        fact1.cliente = cli1;
        fact1.fecha = "11/06/2025";
        fact1.totalpagar = comp1.precio;

        // Mostrar factura
        fact1.generarFactura();
    }
}