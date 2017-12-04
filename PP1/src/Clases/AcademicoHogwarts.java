package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author User
 */
public class AcademicoHogwarts {
    ArrayList<String> MateriasTomadas = new ArrayList();
    ArrayList<String> Dias = new ArrayList();
    ArrayList<String> Horas = new ArrayList();
    
    public static void main(String[] args){
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido al sistema académico de Hogwarts");
        ArrayList<String> datos=new ArrayList<String>();
        ArrayList<String> cursos=new ArrayList<String>();
        String rolusuario="";
        try {
            InputStream inputstream = AcademicoHogwarts.class.getResourceAsStream("/recursos/usuarios.txt");
            InputStreamReader inputreader = new InputStreamReader(inputstream);
            br = new BufferedReader(inputreader);
            String linea;
            while ((linea = br.readLine()) != null) {
                datos.add(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        boolean usuariocorrecto=false;
        while(usuariocorrecto==false){
            int i;
            System.out.println("Ingrese su usuario:");
            String usuario=sc.nextLine();
            System.out.println("Ingrese su clave:");
            String clave=sc.nextLine();
        
            for(i=0;i<datos.size();i++){
                String[] linea;
                linea=datos.get(i).split(",");
                if(linea[0].equals(usuario)||linea[1].equals(clave)){
                    System.out.println("Ingreso exitoso");
                    rolusuario=linea[4];
                    usuariocorrecto=true;
                }
            }
            if(usuariocorrecto==false){
                System.out.println("Los datos ingresados son incorrectos. Ingrese de nuevo.");
            }
        }
        boolean deseaSalir=false;
        if (usuariocorrecto=true){
            while (deseaSalir==false){
                if (rolusuario.equals("planificador")){
                    System.out.println("Planificador");
                    System.out.println("1. Crear Curso");
                    System.out.println("2. Crear Profesor");
                    System.out.println("3. Crear Estudiante");
                    System.out.println("4. Ver horarios");
                    System.out.println("5. Listado de estudiantes");
                    System.out.println("6. Cerrar Sesión");
                    System.out.println("Ingrese su opción:");
                    int opcion=sc.nextInt();
                    if (opcion==1){
                      
                    }
                    if (opcion==2){
                        
                    }
                    if (opcion==3){
                        
                    }
                    if (opcion==4){
                        
                    }
                    if (opcion==5){
                        
                    }
                    if (opcion==6){
                        System.out.println("Ha cerrado sesión.");
                        deseaSalir=true;
                    }
                    else{
                        System.out.println("Ingrese una opción válida.");
                    }
                }
                else if (rolusuario.equals("estudiante")){
                    System.out.println("Estudiante");
                    System.out.println("1. Ver Cursos Planificados");
                    System.out.println("2. Registro");
                    System.out.println("3. Descripcion de Vuelo");
                    System.out.println("4. Cerrar Sesión");
                    int opc=sc.nextInt();
                    if (opc==1){
                        int i = sc.nextInt();
                        FileReader fc = null;
                        BufferedReader bc= null;
                        try {
                            InputStream inputstream = AcademicoHogwarts.class.getResourceAsStream("/recursos/curso.txt");
                            InputStreamReader inputreader = new InputStreamReader(inputstream);
                            bc = new BufferedReader(inputreader);
                            String carac;
                            while ((carac = bc.readLine()) != null) {
                                cursos.add(carac);
                            }
                        }
                        catch (Exception c) {
                            c.printStackTrace();
                        } 
                        finally {
                            try {
                                if (null != fc) {
                                    fc.close();
                                }
                            } 
                            catch (Exception c2) {
                                c2.printStackTrace();
                            }
                        }
                        for (String m: cursos){
                            String o =m.split(",")[0];
                            String l=m.split(",")[1];
                            String n=m.split(",")[2];
                            String p=m.split(",")[3];
                            System.out.print("CURSOS PLANIFICADOS");
                            System.out.println(o);
                            System.out.println("Escriba el nombre de la materia: ");
                            String x = sc.next();
                            if (x.toLowerCase() == o.toLowerCase()){
                                System.out.println("Materia: "+o);
                                System.out.println("Horario: "+l+","+n);
                                System.out.println("Cupo maximo: "+p);
                            }                            
                        }                        
                    }
                    if (opc==2){
                        System.out.print("REGISTROS");
                        System.out.println("Escriba el nombre de la materia: ");
                    }
                    if (opc==3){
                        System.out.print("Ingrese el tipo de mago que es: ");
                        String v = sc.next();
                        if (v.toLowerCase()=="normal"){
                            System.out.println("Usted es un mago Normal, para volar necesita una Nimbus 2000");
                        }
                        if (v.toLowerCase()=="metamorfomago"){
                            System.out.println("Usted es un Metamorfomago, puede volar usando solamente su poder");
                        }
                        if (v.toLowerCase()=="animago"){
                            System.out.println("Usted es un Animago, puede volar con la ayuda de su varita");
                        }
                    }
                    if (opc==4){
                        System.out.println("Ha cerrado sesión.");
                        deseaSalir=true;
                    }
                    else{
                        System.out.println("Ingrese una opción válida.");
                    }
                }
                }
            }
        }
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
        while(numero<=0 || numero>Materias.length || MateriasTomadas.contains(Materias[numero-1])){
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
        while(numero1<=0 || numero1>Profesores.length){
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
    
    
    public void CrearProfesor(){
        System.out.println("/** CREAR PROFESOR **/");
        String ingreso,confirmacion;
        int brujamago;
        BrujasMagos a = new BrujasMagos();
        a.Crear();
        
        Scanner fi = new Scanner(System.in);
        System.out.print("Fecha de Ingreso: ");
        ingreso = fi.nextLine();
        
        System.out.println("Tipos de Magos/Brujas");
        String tipos[] = {"Animago","Metamorfomago","Estandar"};
        for(int i = 0;i<tipos.length;i++){
            System.out.println((i+1)+"."+tipos[i]);
        }
        Scanner bm = new Scanner(System.in);
        System.out.print("Elija el tipo de Bruja/mago que es: ");
        brujamago = bm.nextInt();
        while(brujamago<=0 || brujamago>tipos.length){
            Scanner bm2 = new Scanner(System.in);
            System.out.print("Elija una opcion valida: ");
            brujamago = bm2.nextInt();
        }
        if (brujamago == 1){
            a.tipo = "A";
            Animago ani = new Animago();
            a.animal = ani.Animal();
        }
        else{ if (brujamago == 2){
            a.tipo = "M";
            Metamorfomago meta = new Metamorfomago();
            a.pocion = meta.Pocion();
        }
        else{
            a.tipo = "N";
            Normal normal = new Normal();
            a.deporte= normal.Deporte();
        }
        }
        Scanner co = new Scanner(System.in);
        System.out.println("Desea guardar los datos? S/N: ");
        confirmacion = co.nextLine();
        confirmacion = confirmacion.toUpperCase();
        if ("S".equals(confirmacion)){
            System.out.println("Sus datos se han guardado correctamente");
        }
    }
    public void CrearEstudiante(){}
    public void VerHorariosPlanificados(){}
    public void ListadoDeEstudiantes(){}
}