package ejer1_pila_cola;


/*
    El centro de impresión de solapines de la UCI está afrontando un problema 
    con la numeración de los mismos, ya que hay números que se repiten entre 
    trabajadores y estudiantes. El sistema cuenta con dos colas una de 
    trabajadores y otra de estudiantes ordenadas ascendentemente según su número 
    de solapín. Estas colas representan el orden en que los trabajadores y 
    estudiantes se fueron haciendo sus solapines (donde no existen números de 
    solapín repetidos). Además se cuenta con una pila para almacenar los 
    estudiantes con el numero de solapin duplicado con el de algún trabajador.

a) Implemente la funcionalidad BuscarEstudiante de la clase Sistema. Esta 
funcionalidad busca un estudiante según su número de solapín y retorna su 
posición en la cola de estudiantes, en caso de no existir debe retornar -1.

b) Implemente la funcionalidad EliminarRepetidos de la clase Sistema. Esta 
funcionalidad elimina de la cola de estudiantes a aquellos cuyo número de 
solapín coincida con el de algún trabajador y los adiciona a la pila de 
duplicados.

c) Implemente la funcionalidad CambiarSolapin de la clase Sistema. Esta 
funcionalidad toma todos los estudiantes contenidos en la pila de duplicados 
y los reinserta en la lista de estudiantes; asignándole el número de solapín 
del último estudiante contenido en la lista incrementado en uno.

 */
/**
 *
 * @author Antonio
 */
public class MAIN {

    public static void main(String[] args) {
        Persona a=new Persona("Antonio",1);
        Persona b=new Persona("Rafael",3);
        Persona c=new Persona("Yunicua",14);
        Persona d=new Persona("Daniela",1);
        Persona e=new Persona("Berto",16);
        Persona f=new Persona("Lauren",11);
        
        ColaSE <Persona> est=new ColaSE<>();
        est.Adicionar(a);
        est.Adicionar(b);
        est.Adicionar(c);
        
        ColaSE <Persona> tra=new ColaSE<>();
        est.Adicionar(d);
        est.Adicionar(e);
        est.Adicionar(f);
        
        Sistema sistema=new Sistema(tra,est);
        
        System.out.println(sistema.BuscarEstudiante(1));
        sistema.ImprimirEst();
        sistema.ImprimirTra();
        System.out.println("\n Cambios");
        sistema.EliminarRepetidos();
        System.out.println("Repetidos eliminados");
        sistema.ImprimirEst();
        sistema.CambiarSolapin();
        System.out.println("Solapin cambiado");
        sistema.ImprimirEst();

    }
}
