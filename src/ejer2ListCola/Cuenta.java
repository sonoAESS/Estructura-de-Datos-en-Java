/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2ListCola;

/**
 *
 * @author Antonio
 */
public class Cuenta {
    private int NoCuenta;
    private String NoID;
    private double saldo;

    public Cuenta(int NoCuenta, String NoID) {
        this.NoCuenta = NoCuenta;
        this.NoID = NoID;
        this.saldo=0.0;
    }

    public String getNoID() {
        return NoID;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
