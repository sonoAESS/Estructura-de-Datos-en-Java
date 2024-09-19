/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_pila_cola;

/**
 *
 * @author Antonio
 */
public class Persona {
    protected String nombre;
    protected int noSolapin;

    public Persona(String nombre, int noSolapin) {
        this.nombre = nombre;
        this.noSolapin = noSolapin;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNoSolapin() {
        return noSolapin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNoSolapin(int noSolapin) {
        this.noSolapin = noSolapin;
    }
    
    
    
    
}
