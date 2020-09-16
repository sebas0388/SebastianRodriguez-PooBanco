/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import javax.swing.*;
/**
 *
 * @author SebastianR
 */
public class cuentaBancaria {
    
private String nombreTitular, tipoDeCuenta;
private int saldo = 100000;
private int dinero;

    public cuentaBancaria(String nombreTitular, String tipoDeCuenta, int dinero) {
        this.nombreTitular = nombreTitular;
        this.tipoDeCuenta = tipoDeCuenta;
        this.dinero = dinero;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }
    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }
    
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
    
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public int getDinero() {
        return dinero;
    }
    



    void extraer(int dinero){

      //this.dinero = dinero;
        if (this.saldo > dinero){
            this.saldo = this.saldo - dinero;
          JOptionPane.showMessageDialog(null ,"Extrajo $" + dinero +" Su saldo actual es $ :" + this.saldo, "Banco Rodriguez",JOptionPane.INFORMATION_MESSAGE );

       }else

         JOptionPane.showMessageDialog(null ,"Saldo insuficiente para esta operacion" , "Banco Rodriguez",JOptionPane.INFORMATION_MESSAGE );

        }


}