package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class BrujasMagos {
    public String nombre, apellido, varita;
    public int edad;
    public BrujasMagos(String nombre,String apellido,String varita,int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.varita=varita;
        this.edad=edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getVarita(){
        return varita;
    }
    public int getEdad(){
        return edad;
    }
}
