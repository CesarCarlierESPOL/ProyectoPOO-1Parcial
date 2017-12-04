/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Comparator;

/**
 *
 * @author Cesar
 */
public class OrdenarPorEdad implements Comparator<EstudianteComp>{
    @Override
    public int compare(EstudianteComp a,EstudianteComp b){
        int n=a.edad -b.edad;
        if (n==0){
            return (a.nombre+a.apellido).compareTo(b.nombre+b.apellido);
        }
        return n;
    } 
}
