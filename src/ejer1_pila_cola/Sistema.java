/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer1_pila_cola;

/**
 *
 * @author Antonio
 */
public class Sistema {
    protected ColaSE<Persona> trabajadores;
    protected ColaSE<Persona> estudiantes;
    protected PilaSE<Persona> duplicados;

    public Sistema(ColaSE<Persona> trabajadores, ColaSE<Persona> estudiantes, PilaSE<Persona> duplicados) {
        this.trabajadores = trabajadores;
        this.estudiantes = estudiantes;
        this.duplicados = duplicados;
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
        while (!estudiantes.Vacia()){
            while(!trabajadores.Vacia()){
                if(estudiantes.Frente().equals(trabajadores.Frente())){
                    duplicados.Apilar(estudiantes.Extraer());
                    break;
                }else{
                    auxT.Adicionar(trabajadores.Extraer());
                }
            }
            auxE.Adicionar(estudiantes.Extraer());
            
            while(!auxT.Vacia()){
                trabajadores.Adicionar(auxT.Extraer());
            }
        }
        
        while(!auxE.Vacia()){
            estudiantes.Adicionar(auxE.Extraer());
        }
    }
    
    public void CambiarSolapin(){
        while(!duplicados.Vacia()){
            duplicados.Tope().setNoSolapin(estudiantes.Fondo().getNoSolapin()+1);
            estudiantes.Adicionar(duplicados.Extraer());
        }
    }
}
