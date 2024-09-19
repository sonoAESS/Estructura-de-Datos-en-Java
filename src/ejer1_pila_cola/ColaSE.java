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
            System.out.println("nada");//throw new ExceptionColaVacia();
        } else {
            return frente.getInfo();
        }
        return null;
    }

    public T Fondo() //throws ExceptionColaVacia 
    {
        if (Vacia()) {
            System.out.println("nada");//throw new ExceptionColaVacia();
        } else {
            return fondo.getInfo();
        }
        return null;
    }

    public T Extraer() //throws ExceptionColaVacia 
    {
        if (Vacia()) {
            System.out.println("nada");//throw new ExceptionColaVacia();
        } else {
            NodoSE<T> cursor = frente;
            frente = frente.getSiguiente();
            return cursor.getInfo();
        }
        return null;
    }

    public boolean Vacia() {
        return (frente == null);
    }
}
