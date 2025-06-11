/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendacompus;

/**
 *
 * @author Kendall Lopéz
 */
public class Cliente {
    String nombre;
    String cedula;
    
    // la infromacion de los clientes 
    public void mostrarCliente(){
        System.out.println("Cliente: "+nombre);
        System.out.println("Cedula: "+cedula);
    }
}
