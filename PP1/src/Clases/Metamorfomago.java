package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cesar
 */
public class Metamorfomago extends BrujasMagos implements Volador{
    public String pocion;
    public Metamorfomago(String nombre,String apellido,String varita,int edad,String pocion){
        super(nombre,apellido,varita,edad);
        this.pocion=pocion;
    }
    public String getPocion(){
        return pocion;
    }
    @Override
    public void volar(){
        System.out.println("El metamorfomago vuela con su poder");
    }
    @Override
    public void despegar(){
        System.out.println("El metamorfomago usa su poder y despega");
    }
}
