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
public class Animago extends BrujasMagos implements Volador{
    public String animal,hechizo;
    public Animago(String nombre,String apellido,String varita,int edad,String animal,String hechizo){
        super(nombre,apellido,varita,edad);
        this.animal=animal;
        this.hechizo=hechizo;
    }
    public String getAnimal(){
        return animal;
    }
    public String getHechizo(){
        return hechizo;
    }
    @Override
    public void volar(){
        System.out.println("El animago vuela con ayuda de su varita");
    }
    @Override
    public void despegar(){
        System.out.println("El animago usa su varita y despega");
    }
}
