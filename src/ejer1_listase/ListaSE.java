/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_listase;

/**
 *
 * @author Antonio
 * @param <T>
 */
public class ListaSE<T> {

    private NodoSE<T> cabeza;

    public ListaSE() {
        this.cabeza = null;
    }

    // Método para agregar un nuevo nodo al final de la lista
    public void agregar(T info) {
        NodoSE<T> nuevoNodo = new NodoSE<>(info, null);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            NodoSE<T> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    // Método para eliminar un nodo por su valor
    public boolean eliminar(T info) {
        if (cabeza == null) {
            return false; // La lista está vacía
        }

        if (cabeza.getInfo().equals(info)) {
            cabeza = cabeza.getSiguiente(); // Eliminar el nodo cabeza
            return true;
        }

        NodoSE<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getInfo().equals(info)) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false; // No se encontró el nodo
    }

    // Método para buscar un nodo por su valor
    public boolean buscar(T info) {
        NodoSE<T> actual = cabeza;
        while (actual != null) {
            if (actual.getInfo().equals(info)) {
                return true; // Se encontró el nodo
            }
            actual = actual.getSiguiente();
        }
        return false; // No se encontró el nodo
    }

    // Método para mostrar todos los elementos de la lista
    public void mostrar() {
        NodoSE<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getInfo() + " ");
            actual = actual.getSiguiente();
        }
    }

    // Método para obtener el tamaño de la lista
    public int tamaño() {
        int count = 0;
        NodoSE<T> actual = cabeza;
        while (actual != null) {
            count++;
            actual = actual.getSiguiente();
        }
        return count;
    }

    public NodoSE<T> getCabeza() {
        return cabeza;
    }

}
