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
public class Conjunto<T> {

    protected ListaSE<T> elementos;

    public Conjunto() {
        elementos = new ListaSE<>();
    }

    public Conjunto(ListaSE<T> elementos) {
        this.elementos = elementos;
    }

    public ListaSE<T> getElementos() {
        return elementos;
    }

    public void setElementos(ListaSE<T> elementos) {
        this.elementos = elementos;
    }

    // Método para la unión de dos conjuntos
    public Conjunto<T> Union(Conjunto<T> otro) {
        Conjunto<T> resultado = new Conjunto<>();
        ListaSE<T> listaResultado = resultado.getElementos();

        // Agregar elementos del conjunto actual
        NodoSE<T> actual = this.elementos.getCabeza();
        while (actual != null) {
            listaResultado.agregar(actual.getInfo());
            actual = actual.getSiguiente();
        }

        // Agregar elementos del otro conjunto si no están ya en el resultado
        actual = otro.elementos.getCabeza();
        while (actual != null) {
            if (!listaResultado.buscar(actual.getInfo())) { // Solo agregar si no está
                listaResultado.agregar(actual.getInfo());
            }
            actual = actual.getSiguiente();
        }

        resultado.setElementos(listaResultado);
        return resultado;
    }

    // Método para verificar si el conjunto es un subconjunto de otro
    public boolean EsSubConjunto(Conjunto<T> otro) {
        NodoSE<T> actual = this.elementos.getCabeza();
        ListaSE<T> listaResultado = otro.getElementos();
        while (actual != null) {
            if (!listaResultado.buscar(actual.getInfo())) {
                return false; // Si algún elemento no está, no es subconjunto
            }
            actual = actual.getSiguiente();
        }
        return true; // Todos los elementos están en el otro conjunto
    }

    // Método para verificar si dos conjuntos son iguales
    public boolean Iguales(Conjunto<T> otro) {
        // Verificar si este conjunto es un subconjunto del otro
        if (!this.EsSubConjunto(otro)) {
            return false;
        }

        // Verificar si el otro conjunto es un subconjunto de este
        return otro.EsSubConjunto(this);
    }

    // Método para mostrar los elementos del conjunto (opcional)
    public void mostrar() {
        elementos.mostrar();
    }

}
