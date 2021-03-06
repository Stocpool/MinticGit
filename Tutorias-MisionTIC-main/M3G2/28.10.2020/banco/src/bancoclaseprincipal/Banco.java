/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoclaseprincipal;

/**
 *
 * @author PC
 */
public class Banco {
    private String nombre;
    private Cuenta[] arregloCuentas;
    private int nCuentas;
    

    //Constructor
    public Banco(String nombre) {
        this.nombre = nombre;
        this.arregloCuentas = new Cuenta[1000];
        //Creacion de cuenta por defecto que se guarda en la primera posición del arreglo
        this.arregloCuentas[0] = new Cuenta("Gerente", 1234567);
        this.nCuentas = 1;
    }
    
    public void agregarCuenta(Cuenta cuenta) {
        this.arregloCuentas[this.nCuentas] = cuenta;
        this.nCuentas++;
    }
    
    public Cuenta buscarCuenta(int numeroCuenta){
        for (int i = 0; i < nCuentas; i++) {
            if (arregloCuentas[i].getNumeroCuenta() == numeroCuenta){
                return arregloCuentas[i];
            }
        }        
        return null;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String todasLasCuentas(){
        String texto = "";
        for (int i = 0; i < this.nCuentas; i++) {
            texto += this.arregloCuentas[i].detallesCuenta() + "\n";
        }
        return texto;
    }
    
    public Cuenta[] getArregloCuentas(){
        return this.arregloCuentas;
    }
}
