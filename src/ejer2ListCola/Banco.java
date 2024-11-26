/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2ListCola;

import ejer1_listase.ListaSE;
import ejer1_listase.NodoSE;
import ejer1_pila_cola.ColaSE;

/**
 *
 * @author Antonio
 */
public class Banco {
    protected ListaSE <Cuenta> lCuentas;
    protected ColaSE <Solicitud> cSol;

    public Banco() {
        lCuentas=new ListaSE<>();
        cSol=new ColaSE<>();
    }
    
    //verificar o crear cuenta
    //obtener posicion de cuenta
    public int verificarCuenta(){
        if(cSol.Vacia()){
            return -1;//no hay en espera
        }
        
        Solicitud sol=cSol.Frente();
        String noID=sol.getNoID();
        
        NodoSE<Cuenta> actual=lCuentas.getCabeza();
        int index=0;
        
        while(actual!=null){
            if(actual.getInfo().getNoID().equals(noID)){
                return index;
            }
            actual=actual.getSiguiente();
            index++;
        }
        
        Cuenta nuevaCuenta=new Cuenta(lCuentas.tamaño(),noID);
        lCuentas.agregar(nuevaCuenta);
        
        return lCuentas.tamaño()-1;
    }
    
    public void atenderSolicitudes(){
        while(!cSol.Vacia()){
            Solicitud sol=cSol.Extraer();
            
            String noID=sol.getNoID();
            double cantD=sol.getCantidaDepo();
            
            int posCuenta=verificarCuenta();
            if(posCuenta>=0){
                NodoSE<Cuenta> cuentaNodo=lCuentas.getCabeza();
                
                for (int i = 0; i < posCuenta; i++) {
                    cuentaNodo=cuentaNodo.getSiguiente();
  
                }
                double nuevoSaldo=cuentaNodo.getInfo().getSaldo()+cantD;
                cuentaNodo.getInfo().setSaldo(nuevoSaldo);
            }
        }
    }
    
    public ListaSE<Cuenta> bajaAMillonarios() {
        ListaSE<Cuenta> cuentasEliminadas = new ListaSE<>();
        
        NodoSE<Cuenta> actual = lCuentas.getCabeza();
        
        while (actual != null) {
            if (actual.getInfo().getSaldo() > 1000000) {
                cuentasEliminadas.agregar(actual.getInfo()); // Agregar a la lista de eliminados
                lCuentas.eliminar(actual.getInfo()); // Eliminar de la lista original
                actual = lCuentas.getCabeza(); // Reiniciar al inicio después de eliminar
            } else {
                actual = actual.getSiguiente(); // Continuar al siguiente nodo
            }
        }

        return cuentasEliminadas; // Retornar las cuentas eliminadas
    }
    
    // Método para agregar solicitudes a la cola (para pruebas)
    public void agregarSolicitud(Solicitud solicitud) {
        cSol.Adicionar(solicitud);
    }
}
