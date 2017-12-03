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
    public String nombre, apellido, varita,tipo,animal,pocion,deporte;
    public int edad;
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
    public void Crear(){
        Scanner n = new Scanner(System.in);
        System.out.print("Ingrese Nombre: ");
        nombre = n.nextLine();

        Scanner a = new Scanner(System.in);
        System.out.print("Ingrese Apellidos: ");
        apellido = a.nextLine();
        
        Scanner e = new Scanner(System.in);
        System.out.print("Ingrese Edad: ");
        edad = e.nextInt();
        
        Scanner v = new Scanner(System.in);
        System.out.print("Varita: ");
        varita = v.nextLine();
    }
}
