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
public class Normal extends BrujasMagos {
    public String Deporte(){
        Scanner de = new Scanner(System.in);
        System.out.print("Ingrese su deporte favorito: ");
        deporte = de.nextLine();
        return deporte;
    }
}
