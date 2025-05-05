/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sisfacturacion;

/**
 *
 * @author USUARIO
 */
public class Sisfacturacion {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    // Método que permite agregar un cliente nuevo al sistema
    public void agregarCliente(String nombre)
    {
        // Imprime un mensaje indicando que el cliente fue agregado exitosamente
        System.out.println("Cliente agregado: "+ nombre);
    }
    // Método para agregar un plato al sistema
    // Recibe el nombre del plato y su precio como parámetros
    public void agregarPlato(String nombrePlato, double precio)
    {
        // Muestra en consola el plato agregado junto con su precio
        System.out.println("Plato agregado: "+nombrePlato+" Con precio: "+precio);
    
    }   
    
}
