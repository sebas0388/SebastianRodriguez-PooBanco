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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       cuentaBancaria cliente; 
       cliente = new cuentaBancaria("Juan Perez","Cuenta Corriente",100); 
       
                  
       int dinero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese monto a extraer ", "Banco Rodriguez",JOptionPane.WARNING_MESSAGE));
       
       cliente.extraer(dinero); 
    }
    
}
