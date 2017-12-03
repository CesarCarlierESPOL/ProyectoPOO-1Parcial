
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Animago extends BrujasMagos {
    public String Animal(){
        Scanner ani = new Scanner(System.in);
        System.out.print("¿En que clase de animal puede convertirse?: ");
        animal = ani.nextLine();
        return animal;
    }
}
