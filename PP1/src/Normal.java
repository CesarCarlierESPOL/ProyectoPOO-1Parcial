/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cesar
 */
public class Normal extends BrujasMagos implements Volador {
    public String deporte;
    public Normal(String nombre,String apellido,String varita,int edad,String deporte){
        super(nombre,apellido,varita,edad);
        this.deporte=deporte;
    }
    public String getDeporte(){
        return deporte;
    }
    @Override
    public void volar(){
        System.out.println("El mago vuela con su escoba Nimbus 2000");
    }
    @Override
    public void despegar(){
        System.out.println("El mago usa su escoba Nimbus 2000 y despega");
    }
}
