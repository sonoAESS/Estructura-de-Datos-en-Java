package ejer1_pila_cola;

/**
 *
 * @author Antonio
 */
public class ColaSE<T> {

    protected NodoSE<T> frente;
    protected NodoSE<T> fondo;

    public ColaSE() {
        frente = null;
        fondo = null;
    }

    public void Adicionar(T x) {
        NodoSE<T> nuevo = new NodoSE<T>(x, null);
        if (Vacia()) {
            frente = nuevo;
            fondo = nuevo;
        } else {
            fondo.setSiguiente(nuevo);
            fondo = nuevo;
        }
    }

    public T Frente() //throws ExceptionColaVacia 
    {
        if (Vacia()) {
            throw new IllegalStateException("La cola esta vacia");
        } else {
            return frente.getInfo();
        }
    }

    public T Fondo() //throws ExceptionColaVacia 
    {
        if (Vacia()) {
            throw new IllegalStateException("La cola esta vacia");
        } else {
            return fondo.getInfo();
        }
    }

    public T Extraer() //throws ExceptionColaVacia 
    {
        if (Vacia()) {
            throw new IllegalStateException("La cola esta vacia");
        } else {
            NodoSE<T> cursor = frente;
            frente = frente.getSiguiente();
            if(frente==null){
                fondo=null;
            }
            return cursor.getInfo();
        }
    }

    public boolean Vacia() {
        return (frente == null);
    }
}
