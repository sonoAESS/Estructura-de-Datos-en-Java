/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_listase;

/*
Se desea desarrollar un asistente matemático para el trabajo con conjuntos. 
Un conjunto se puede modelar a través de una lista con contenga los elementos 
que pertenecen al conjunto. Una característica fundamental
de los conjuntos es que los elementos no se repiten dentro del mismo.

a) Implemente la funcionalidad Union de la clase Conjunto. Esta funcionalidad 
retorna el conjunto resultado de la unión de los dos conjuntos. Por ejemplo:
Sean los conjuntos de enteros a = {0, 1, 2, 3 } y b={1, 3, 5}
a.Union(b) {0, 1, 2, 3, 5}

b) Implemente la funcionalidad EsSubConjunto de la clase Conjunto. Esta 
funcionalidad retorna verdadero si el conjunto c es un subconjunto del conjunto, 
sino retorna falso. Por ejemplo: Sean los conjuntos de enteros a = {0, 1, 2, 3 }
y b={1, 3} a.EsSubConjunto(b) verdadero

c) Implemente la funcionalidad Iguales de la clase Conjunto. Esta funcionalidad 
retorna verdadero si los dos conjuntos  contienen a los mismos elementos. Por 
ejemplo: Sean los conjuntos de enteros a = { 3, 1 } y b={1, 3} a.Iguales(b) 
verdadero
 */
public class MAIN {

    public static void main(String[] args) {
        ListaSE<Integer> a = new ListaSE<>();
        a.agregar(0);
        a.agregar(1);
        a.agregar(2);
        a.agregar(3);
        Conjunto<Integer> conjuntoA = new Conjunto<>(a);

        ListaSE<Integer> b = new ListaSE<>();
        b.agregar(1);
        b.agregar(3);
        b.agregar(5);
        Conjunto<Integer> conjuntoB = new Conjunto<>();

        System.out.println("Unión de a y b:");
        Conjunto<Integer> union = conjuntoA.Union(conjuntoB);
        union.mostrar();

        System.out.println("\n¿b es un subconjunto de a? " + conjuntoA.EsSubConjunto(conjuntoB)); // Debería ser falso

        ListaSE<Integer> c = new ListaSE<>();
        c.agregar(1);
        c.agregar(3);
        Conjunto<Integer> conjuntoC = new Conjunto<>(c);

        System.out.println("¿c es un subconjunto de a? " + conjuntoC.EsSubConjunto(conjuntoA)); // Debería ser verdadero

        ListaSE<Integer> d = new ListaSE<>();
        d.agregar(3);
        d.agregar(1);
        Conjunto<Integer> conjuntoD = new Conjunto<>(d);

        System.out.println("¿a y d son iguales? " + conjuntoA.Iguales(conjuntoD));
    }
}
