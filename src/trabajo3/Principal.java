/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo3;

/**
 *
 * @author Asus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       var v1 = new VentanaInscripccion("INSCRIBETE");
        v1.setVisible(true);
       var v2=new VentanaDatos("DATOS PERSONALES");
       v2.setVisible(true);
    }
    
}
