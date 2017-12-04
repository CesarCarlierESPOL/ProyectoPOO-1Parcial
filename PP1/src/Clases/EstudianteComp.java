/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


/**
 *
 * @author Cesar
 */
public class EstudianteComp extends BrujasMagos {
    public int materias;
    public String casa;
    public EstudianteComp(String nombre,String apellido,String varita,int edad,String casa,int materias){
        super(nombre,apellido,varita,edad);
        this.casa=casa;
        this.materias=materias;
    }
    @Override
    public String toString(){
        return this.nombre+" "+this.apellido+" -- "+this.edad+" años -- "+this.casa+" -- "+this.materias+" materias";
    }
}