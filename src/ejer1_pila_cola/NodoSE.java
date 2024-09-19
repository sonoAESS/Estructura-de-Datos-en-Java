/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_pila_cola;

/**
 *
 * @author Antonio
 */
public class NodoSE <T> {
    protected T info;
    protected NodoSE<T> siguiente;
    
    public NodoSE(T info, NodoSE<T> siguiente) 
    {
        this.info = info;
        this.siguiente = siguiente;
    }
    public T getInfo() 
    {
        return info;
    }
    public NodoSE<T> getSiguiente() 
    {
        return siguiente;
    }
    public void setSiguiente(NodoSE<T> siguiente) 
    {
        this.siguiente = siguiente;
    }
}
