/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_listase;

/**
 *
 * @author Antonio
 */
public class MAIN {

    public static void main(String[] args) {
        ListaSE<Integer> a=new ListaSE<>();
        a.agregar(0);
        a.agregar(1);
        a.agregar(2);
        a.agregar(3);
        Conjunto<Integer> conjuntoA = new Conjunto<>(a);

        ListaSE<Integer> b=new ListaSE<>();
        b.agregar(1);
        b.agregar(3);
        b.agregar(5);
        Conjunto<Integer> conjuntoB = new Conjunto<>();

        System.out.println("Unión de a y b:");
        Conjunto<Integer> union = conjuntoA.Union(conjuntoB);
        union.mostrar(); 

        System.out.println("\n¿b es un subconjunto de a? " + conjuntoA.EsSubConjunto(conjuntoB)); // Debería ser falso

        ListaSE<Integer> c=new ListaSE<>();
        c.agregar(1);
        c.agregar(3);
        Conjunto<Integer> conjuntoC = new Conjunto<>(c);

        System.out.println("¿c es un subconjunto de a? " + conjuntoC.EsSubConjunto(conjuntoA)); // Debería ser verdadero

        ListaSE<Integer> d=new ListaSE<>();
        d.agregar(3);
        d.agregar(1);
        Conjunto<Integer> conjuntoD = new Conjunto<>(d);
        
        System.out.println("¿a y d son iguales? " + conjuntoA.Iguales(conjuntoD)); 
    }
}
