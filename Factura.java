/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendacompus;

/**
 *
 * @author Kendall Lopéz
 */
public class Factura {
    Cliente cliente;
    Computadora computadora;
    String fecha;
    double totalpagar;
    
    //los datos que lleva LA FACTURA 
    public void generarFactura(){
        System.out.println("---Factura---");
        cliente.mostrarCliente();
        System.out.println("fecha: "+fecha);
        System.out.println();
        computadora.mostrarDetalles();
        System.out.println();
        System.out.println("total a pagar: "+totalpagar);
        System.out.println("--------------");
    }
    
    
    
    
}
