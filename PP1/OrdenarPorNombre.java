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
public class OrdenarPorNombre implements Comparator<EstudianteComp>{
    @Override
    public int compare(EstudianteComp a,EstudianteComp b){
        return (a.nombre+a.apellido).compareTo(b.nombre+b.apellido);
    }    
}
