/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author User
 */
public class Metamorfomago extends BrujasMagos {
    public String Pocion(){
        Scanner po = new Scanner(System.in);
        System.out.print("Ingrese la poción para controlar su sindrome de conversión: ");
        pocion = po.nextLine();
        return pocion;
    }
}
