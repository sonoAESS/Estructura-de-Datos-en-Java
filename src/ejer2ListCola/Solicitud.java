/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2ListCola;

/**
 *
 * @author Antonio
 */
public class Solicitud {
    private String nombre;
    private String noID;
    private double cantidaDepo;

    public Solicitud(String nombre, String noID, double cantidaDepo) {
        this.nombre = nombre;
        this.noID = noID;
        this.cantidaDepo = cantidaDepo;
    }

    public String getNoID() {
        return noID;
    }

    public double getCantidaDepo() {
        return cantidaDepo;
    }
    
    
}
