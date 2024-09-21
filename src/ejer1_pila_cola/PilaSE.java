package ejer1_pila_cola;

/**
 *
 * @author Antonio
 */
public class PilaSE<T> {

    /* Atributo Tope */
 /* Almacena la direccion del nodo que contiene el elemento tope */
    protected NodoSE<T> top;

    /* Constructor */
    public PilaSE() {
        top = null;
    }

    public void Apilar(T x) {
        NodoSE<T> nuevo = new NodoSE<T>(x, top);
        top = nuevo;
    }

    public T Extraer() {
            if (!Vacia()) {
                T x = top.getInfo();
                top = top.getSiguiente();
                return x;
            }else{
                throw new IllegalStateException("La pila esta vacia");
            }
    }

    public T Tope() {
        return top.getInfo();
    }

    public boolean Vacia() {
        return (top == null);
    }
}
