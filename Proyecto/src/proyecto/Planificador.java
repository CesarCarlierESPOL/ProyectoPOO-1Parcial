/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.*;
/**
 *
 * @author User
 */
public class Planificador {
    ArrayList<String> MateriasTomadas = new ArrayList();
    ArrayList<String> Dias = new ArrayList();
    ArrayList<String> Horas = new ArrayList();
    public void CrearCurso(){
        int numero,numero1,capacidad;
        String horario,confirmacion,dia;
        boolean disponible = true;
        
        System.out.println("/** Materias **/");
        String[] Materias={"Pociones","Defensa contra las artes oscuras","Adivinacion",
        "Astronomia","Historia de la magia","Herbologia","Encantamientos","Vuelo"};
        for(int i =0;i<Materias.length;i++){
            System.out.println((i+1)+". "+Materias[i]);
        }
        Scanner n = new Scanner(System.in);
        System.out.print("Elija una materia del listado de materias: ");
        numero = n.nextInt();
        while(numero<0 || numero>Materias.length || MateriasTomadas.contains(Materias[numero-1])){
            Scanner nn = new Scanner(System.in);
            System.out.print("Elija una materia valida del listado de materias: ");
            numero = nn.nextInt();
        }
        if(MateriasTomadas.contains(Materias[numero-1])){}
        else{
            MateriasTomadas.add(Materias[numero-1]);
        } 
        
        System.out.println("/** Profesores **/");
        String[] Profesores={"Quirinus Quirrell","Gilderoy Lockhart","Remus Lupin","Severus Snape"};
        for(int j =0;j<Profesores.length;j++){
            System.out.println((j+1)+". "+Profesores[j]);
        }
        Scanner p = new Scanner(System.in);
        System.out.print("Elija un profesor del listado de profesores: ");
        numero1 = p.nextInt();
        while(numero1<0 || numero1>Profesores.length){
            Scanner pp = new Scanner(System.in);
            System.out.print("Elija un profesor valido del listado de profesores: ");
            numero1 = pp.nextInt();
        }
        
        Scanner c = new Scanner(System.in);
        System.out.print("Ingrese la capacidad del curso para "+Materias[numero-1]+": ");
        capacidad = c.nextInt();
        
        Scanner d = new Scanner(System.in);
        System.out.print("Ingrese el día:: ");
        dia = d.nextLine();
        
        Scanner h = new Scanner(System.in);
        System.out.print("Ingrese el horario del curso: ");
        horario = h.nextLine();
        
        Scanner co = new Scanner(System.in);
        System.out.print("Desea crear el curso con la informacion establecida? S/N : ");
        confirmacion = co.nextLine();
        confirmacion = confirmacion.toUpperCase();
        while(confirmacion.equals("S")  && confirmacion.equals("N")){
            Scanner con = new Scanner(System.in);
            System.out.print("Desea crear el curso con la informacion establecida? S/N : ");
            confirmacion = con.nextLine();
            confirmacion = confirmacion.toUpperCase();
        }
        for(int k=0;k<Dias.size();k++){
            if(Dias.get(k).equals(dia)){
                if(Horas.get(k).equals(horario)){
                    System.out.println("Ya existe un curso en el dia "+dia+" a las "+horario);
                    disponible = false;
                }
            }
        }
        if(confirmacion.equals("S") && disponible){
            System.out.println("Se ha creado el curso: ");
            System.out.println("MATERIA: "+Materias[numero-1].toUpperCase());
            System.out.println("PROFESOR:"+Profesores[numero1-1].toUpperCase());
            System.out.println("CAPACIDAD: "+capacidad);
            System.out.println("DÍA: "+dia);
            System.out.println("HORARIO: "+horario);
            Dias.add(dia);
            Horas.add(horario);
        }
    }
    
    
    public void CrearProfesor(){}
    public void CrearEstudiante(){}
    public void VerHorariosPlanificados(){}
    public void ListadoDeEstudiantes(){}
}
