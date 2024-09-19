package ejer1_pila_cola;

/**
 *
 * @author Antonio
 */
public class Sistema {

    protected ColaSE<Persona> trabajadores;
    protected ColaSE<Persona> estudiantes;
    protected PilaSE<Persona> duplicados;

    public Sistema(ColaSE<Persona> trabajadores, ColaSE<Persona> estudiantes) {
        this.trabajadores = trabajadores;
        this.estudiantes = estudiantes;
        duplicados = new PilaSE<>();
    }

    public int BuscarEstudiante(int x) {
        ColaSE<Persona> aux = estudiantes;
        int pos = 1;
        while (!aux.Vacia()) {
            if (aux.Frente().getNoSolapin() == x) {
                return pos;
            } else {
                pos++;
            }
        }

        return -1;
    }

    public void EliminarRepetidos() {
        ColaSE<Persona> auxT = new ColaSE<>();
        ColaSE<Persona> auxE = new ColaSE<>();
        while (!estudiantes.Vacia()) {
            while (!trabajadores.Vacia()) {
                if (estudiantes.Frente().equals(trabajadores.Frente())) {
                    duplicados.Apilar(estudiantes.Extraer());
                    break;
                } else {
                    auxT.Adicionar(trabajadores.Extraer());
                }
            }
            auxE.Adicionar(estudiantes.Extraer());

            while (!auxT.Vacia()) {
                trabajadores.Adicionar(auxT.Extraer());
            }
        }

        while (!auxE.Vacia()) {
            estudiantes.Adicionar(auxE.Extraer());
        }
    }

    public void CambiarSolapin() {
        while (!duplicados.Vacia()) {
            duplicados.Tope().setNoSolapin(estudiantes.Fondo().getNoSolapin() + 1);
            estudiantes.Adicionar(duplicados.Extraer());
        }
    }
    
    public void ImprimirEst(){
        System.out.println("Estudiantes:");
        ColaSE<Persona> aux=new ColaSE<>();
        while(!estudiantes.Vacia()){
            System.out.println(estudiantes.Frente().getNombre()+", "+estudiantes.Frente().getNoSolapin());
            aux.Adicionar(estudiantes.Extraer());
        }
        
        while(!aux.Vacia()){
            estudiantes.Adicionar(aux.Extraer());
        }
    }

    public void ImprimirTra(){
        System.out.println("Trabajadores:");
        ColaSE<Persona> aux=new ColaSE<>();
        while(!trabajadores.Vacia()){
            System.out.println(trabajadores.Frente().getNombre()+", "+trabajadores.Frente().getNoSolapin());
            aux.Adicionar(trabajadores.Extraer());
        }
        
        while(!aux.Vacia()){
            trabajadores.Adicionar(aux.Extraer());
        }
    }
}
