package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author User
 */
public class AcademicoHogwarts {
    public static String nombreUsuario,apellidoUsuario,tipoUsuario,varitaUsuario;
    public static int edadUsuario;
    public static void main(String[] args){
        FileReader fr = null;
        BufferedReader br = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Bienvenido al sistema académico de Hogwarts");
        ArrayList<String> datos=new ArrayList<String>();
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
                if(linea[0].equals(usuario)&&linea[1].equals(clave)){
                    System.out.println("Ingreso exitoso");
                    rolusuario=linea[4];
                    nombreUsuario=linea[2];
                    apellidoUsuario=linea[3];
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
                        CrearCurso();
                    }
                    else if (opcion==2){
                        CrearProfesor();
                    }
                    else if (opcion==3){
                        CrearEstudiante();
                    }
                    else if (opcion==4){
                        verHorarios();
                    }
                    else if (opcion==5){
                        verListado();
                    }
                    else if (opcion==6){
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
                    int opcion=sc.nextInt();
                    if (opcion==1){
                        verCursos();
                    }
                    else if (opcion==2){
                        registro();
                    }
                    else if (opcion==3){
                        descripcionVuelo();
                    }
                    else if (opcion==4){
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
    public static void CrearCurso(){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        ArrayList<String[]> cursosExistentes=new ArrayList<String[]>();
        try {
            InputStream inputstream = AcademicoHogwarts.class.getResourceAsStream("/recursos/curso.txt");
            InputStreamReader inputreader = new InputStreamReader(inputstream);
            br = new BufferedReader(inputreader);
            String linea;
            while ((linea = br.readLine()) != null) {
                cursosExistentes.add(linea.split(","));
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
        System.out.println("/** MATERIAS **/");
        System.out.println("1. Pociones");
        System.out.println("2. Defensa contra las artes oscuras");
        System.out.println("3. Adivinación");
        System.out.println("4. Astronomía");
        System.out.println("5. Historia de la Magia");
        System.out.println("6. Herbología");
        System.out.println("7. Encantamientos");
        System.out.println("8. Vuelo");
        Scanner sc=new Scanner(System.in);
        boolean opcionCorrecta=false;
        String materiaElegida="";
        String profesorElegido="";
        String diaElegido="";
        String horarioElegido="";
        String capacidadElegida="";
        while (opcionCorrecta==false){
            System.out.println("Elija una materia del listado de materias: ");
            int opcion1=sc.nextInt();
            if (opcion1==1){
                opcionCorrecta=true;
                materiaElegida="Pociones";}
            else if (opcion1==2){
                opcionCorrecta=true;
                materiaElegida="Defensa contra las artes oscuras";}
            else if (opcion1==3){
                opcionCorrecta=true;
                materiaElegida="Adivinación";}
            else if (opcion1==4){
                opcionCorrecta=true;
                materiaElegida="Astronomía";}
            else if (opcion1==5){
                opcionCorrecta=true;
                materiaElegida="Historia de la Magia";}
            else if (opcion1==6){
                opcionCorrecta=true;
                materiaElegida="Herbología";}
            else if (opcion1==7){
                opcionCorrecta=true;
                materiaElegida="Encantamientos";}
            else if (opcion1==8){
                opcionCorrecta=true;
                materiaElegida="Vuelo";}
            else{
                System.out.println("Ingrese una opción válida");
            }
        }
        int i;
        String[] linea;
        System.out.println("/** PROFESORES **/");
        System.out.println("1. Quirinus Quirrell");
        System.out.println("2. Gilderoy Lockhart");
        System.out.println("3. Remus Lupin");
        System.out.println("4. Severus Snape");
        boolean opcionCorrecta2=false;
        while (opcionCorrecta2==false){
            System.out.println("Elija un profesor del listado de profesores: ");
            int opcion1=sc.nextInt();
            if (opcion1==1){
                opcionCorrecta2=true;
                profesorElegido="Quirinus Quirrell";}
            else if (opcion1==2){
                opcionCorrecta2=true;
                profesorElegido="Gilderoy Lockhart";}
            else if (opcion1==3){
                opcionCorrecta2=true;
                profesorElegido="Remus Lupin";}
            else if (opcion1==4){
                opcionCorrecta2=true;
                profesorElegido="Severus Snape";}
            else{
                System.out.println("Ingrese una opción válida");}
        }
        System.out.println("Ingrese la capacidad:");
        capacidadElegida=sc.next();
        System.out.println("Ingrese el dia:");
        diaElegido=sc.next();
        System.out.println("Ingrese el horario del curso: ");
        Scanner sc1=new Scanner(System.in);
        horarioElegido=sc1.nextLine();
        boolean horarioDisponible=true;
        for (i=0;i<cursosExistentes.size();i++){
            linea=cursosExistentes.get(i);
            if(materiaElegida.equals(linea[0])||(diaElegido.equals(linea[1])&&horarioElegido.equals(linea[2]))){
                System.out.println("No se puede crear este curso.");
                horarioDisponible=false;
                break;
            }
            else{horarioDisponible=true;}
        }
        if(horarioDisponible==true){
            System.out.println("Desea crear el curso con la informacion establecida?:");
            String respuesta=sc.next();
            if (respuesta.equals("S")){
                System.out.println("Se ha creado el curso:");
                System.out.println("   Materia: "+materiaElegida);
                System.out.println("   Profesor: "+profesorElegido);
                System.out.println("   Capacidad: "+capacidadElegida);
                System.out.println("   Horario: "+horarioElegido);
                String nuevocurso=("\n"+materiaElegida+","+profesorElegido+","+diaElegido+","+horarioElegido+","+capacidadElegida);
                
                try {
                    FileWriter f = new FileWriter(new File("src/recursos/curso.txt"),true);
                    f.append(nuevocurso);
                    f.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }                 
            }
            else{System.out.println("No se guardaran los datos");}
        }
    }
    public static void CrearProfesor(){
        System.out.println(/** CREAR PROFESORES**/);
        String nombre,apellido,varita,fecha,tipo;
        int opcion,edad;
        String pocion=null;
        String deporte=null;
        String animal=null;
        String hechizo=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        nombre=sc.nextLine();
        System.out.println("Ingrese Apellido");
        apellido=sc.nextLine();
        System.out.println("Ingrese Edad");
        edad=sc.nextInt();
        System.out.println("Varita");
        varita=sc.nextLine();
        System.out.println("Fecha de Ingreso:");
        fecha=sc.nextLine();
        System.out.println("");
        System.out.println("Tipos de Magos/Brujas");
        System.out.println("1.Animago");
        System.out.println("2.Metamorfomago");
        System.out.println("3.Estandar");
        System.out.println("Ingrese el tipo de mago:");
        opcion=sc.nextInt();
        tipo="";
        boolean opcionCorrecta=false;
        while(opcionCorrecta==false){
            if (opcion==1){
                opcionCorrecta=true;
                tipo="A";
                System.out.println("En que clase de animal se transforma:");
                animal=sc.next();
                System.out.println("Que hechizo usa?");
                hechizo=sc.nextLine();
            }
            else if (opcion==2){
                opcionCorrecta=true;
                tipo="M";
                System.out.println("Que pocion usa?");
                pocion=sc.nextLine();
            }
            else if (opcion==3){
                opcionCorrecta=true;
                tipo="N";
                System.out.println("Que deporte le gusta?");
                deporte=sc.nextLine();
            }
            else{System.out.println("Ingrese una opcion valida");}
        }
        if (opcionCorrecta==true){
            String guardado="";
            System.out.println("Desea guardar los datos?");
            guardado=sc.nextLine();
            if (guardado.equals("S")){
                try {
                    FileWriter f = new FileWriter(new File("src/recursos/profesores.txt"),true);
                    f.append(nombre+","+apellido+","+edad+","+varita+","+fecha+","+tipo+","+animal+","+hechizo+","+pocion+","+deporte);
                    f.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Sus datos se han guardado");
            }
            else{System.out.println("No se guardaron datos");}
        }
    }
    public static void CrearEstudiante(){
        System.out.println(/** CREAR ESTUDIANTES**/);
        String nombre,apellido,varita,fecha,tipo;
        int opcion,edad;
        String pocion=null;
        String deporte=null;
        String animal=null;
        String hechizo=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese Nombre");
        nombre=sc.nextLine();
        System.out.println("Ingrese Apellido");
        apellido=sc.nextLine();
        System.out.println("Ingrese Edad");
        edad=sc.nextInt();
        System.out.println("Varita");
        varita=sc.nextLine();
        System.out.println("Fecha de Ingreso:");
        fecha=sc.nextLine();
        System.out.println("");
        System.out.println("Tipos de Magos/Brujas");
        System.out.println("1.Animago");
        System.out.println("2.Metamorfomago");
        System.out.println("3.Estandar");
        System.out.println("Ingrese el tipo de mago:");
        opcion=sc.nextInt();
        tipo="";
        boolean opcionCorrecta=false;
        while(opcionCorrecta==false){
            if (opcion==1){
                opcionCorrecta=true;
                tipo="A";
                System.out.println("En que clase de animal se transforma:");
                animal=sc.next();
                System.out.println("Que hechizo usa?");
                hechizo=sc.nextLine();
            }
            else if (opcion==2){
                opcionCorrecta=true;
                tipo="M";
                System.out.println("Que pocion usa?");
                pocion=sc.nextLine();
            }
            else if (opcion==3){
                opcionCorrecta=true;
                tipo="N";
                System.out.println("Que deporte le gusta?");
                deporte=sc.nextLine();
            }
            else{System.out.println("Ingrese una opcion valida");}
        }
        if (opcionCorrecta==true){
            String guardado="";
            System.out.println("Desea guardar los datos?");
            guardado=sc.nextLine();
            if (guardado.equals("S")){
                try {
                    FileWriter f = new FileWriter(new File("src/recursos/estudiantes.txt"),true);
                    f.append(nombre+","+apellido+","+edad+","+varita+","+fecha+","+tipo+","+animal+","+hechizo+","+pocion+","+deporte);
                    f.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Sus datos se han guardado");
            }
            else{System.out.println("No se guardaron datos");}
        }
    }
    public static void verHorarios(){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        ArrayList<String[]> cursosExistentes=new ArrayList<String[]>();
        try {
            InputStream inputstream = AcademicoHogwarts.class.getResourceAsStream("/recursos/curso.txt");
            InputStreamReader inputreader = new InputStreamReader(inputstream);
            br = new BufferedReader(inputreader);
            String linea;
            while ((linea = br.readLine()) != null) {
                cursosExistentes.add(linea.split(","));
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
        System.out.println("/** MATERIAS **/");
        System.out.println("1. Pociones");
        System.out.println("2. Defensa contra las artes oscuras");
        System.out.println("3. Adivinación");
        System.out.println("4. Astronomía");
        System.out.println("5. Historia de la Magia");
        System.out.println("6. Herbología");
        System.out.println("7. Encantamientos");
        System.out.println("8. Vuelo");
        Scanner sc=new Scanner(System.in);
        boolean opcionCorrecta=false;
        String materiaElegida="";
        while (opcionCorrecta==false){
            System.out.println("Elija una materia del listado de materias: ");
            int opcion1=sc.nextInt();
            if (opcion1==1){
                opcionCorrecta=true;
                materiaElegida="Pociones";}
            else if (opcion1==2){
                opcionCorrecta=true;
                materiaElegida="Defensa contra las artes oscuras";}
            else if (opcion1==3){
                opcionCorrecta=true;
                materiaElegida="Adivinación";}
            else if (opcion1==4){
                opcionCorrecta=true;
                materiaElegida="Astronomía";}
            else if (opcion1==5){
                opcionCorrecta=true;
                materiaElegida="Historia de la Magia";}
            else if (opcion1==6){
                opcionCorrecta=true;
                materiaElegida="Herbología";}
            else if (opcion1==7){
                opcionCorrecta=true;
                materiaElegida="Encantamientos";}
            else if (opcion1==8){
                opcionCorrecta=true;
                materiaElegida="Vuelo";}
            else{
                System.out.println("Ingrese una opción válida");
            }
        }
        int i;
        int posicion=0;
        boolean existeMateria=false;
        for(i=0;i<cursosExistentes.size();i++){
            if(materiaElegida.equals(cursosExistentes.get(i)[0])){
                existeMateria=true;
                posicion=i;
                break;
            }
        }
        if(existeMateria==true){
            System.out.println("Materia: "+cursosExistentes.get(posicion)[0]);
            System.out.println("Profesor: "+cursosExistentes.get(posicion)[1]);
            System.out.println("Horario: "+cursosExistentes.get(posicion)[2]+","+cursosExistentes.get(posicion)[3]);
            System.out.println("Registrados: "+cursosExistentes.get(posicion)[4]);
        }
        else{System.out.println("No hay horarios planificados para esa materia.");}
    }
    public static void verListado(){
        
    }
    public static void verCursos(){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        ArrayList<String[]> cursosExistentes=new ArrayList<String[]>();
        try {
            InputStream inputstream = AcademicoHogwarts.class.getResourceAsStream("/recursos/curso.txt");
            InputStreamReader inputreader = new InputStreamReader(inputstream);
            br = new BufferedReader(inputreader);
            String linea;
            while ((linea = br.readLine()) != null) {
                cursosExistentes.add(linea.split(","));
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
        System.out.println("/** MATERIAS **/");
        System.out.println("1. Pociones");
        System.out.println("2. Defensa contra las artes oscuras");
        System.out.println("3. Adivinación");
        System.out.println("4. Astronomía");
        System.out.println("5. Historia de la Magia");
        System.out.println("6. Herbología");
        System.out.println("7. Encantamientos");
        System.out.println("8. Vuelo");
        Scanner sc=new Scanner(System.in);
        boolean opcionCorrecta=false;
        String materiaElegida="";
        while (opcionCorrecta==false){
            System.out.println("Elija una materia del listado de materias: ");
            int opcion1=sc.nextInt();
            if (opcion1==1){
                opcionCorrecta=true;
                materiaElegida="Pociones";}
            else if (opcion1==2){
                opcionCorrecta=true;
                materiaElegida="Defensa contra las artes oscuras";}
            else if (opcion1==3){
                opcionCorrecta=true;
                materiaElegida="Adivinación";}
            else if (opcion1==4){
                opcionCorrecta=true;
                materiaElegida="Astronomía";}
            else if (opcion1==5){
                opcionCorrecta=true;
                materiaElegida="Historia de la Magia";}
            else if (opcion1==6){
                opcionCorrecta=true;
                materiaElegida="Herbología";}
            else if (opcion1==7){
                opcionCorrecta=true;
                materiaElegida="Encantamientos";}
            else if (opcion1==8){
                opcionCorrecta=true;
                materiaElegida="Vuelo";}
            else{
                System.out.println("Ingrese una opción válida");
            }
        }
        int i;
        int posicion=0;
        boolean existeMateria=false;
        for(i=0;i<cursosExistentes.size();i++){
            if(materiaElegida.equals(cursosExistentes.get(i)[0])){
                existeMateria=true;
                posicion=i;
                break;
            }
        }
        if(existeMateria==true){
            System.out.println("Materia: "+cursosExistentes.get(posicion)[0]);
            System.out.println("Profesor: "+cursosExistentes.get(posicion)[1]);
            System.out.println("Horario: "+cursosExistentes.get(posicion)[2]+","+cursosExistentes.get(posicion)[3]);
            System.out.println("Registrados: "+cursosExistentes.get(posicion)[4]);
        }
        else{System.out.println("No hay horarios planificados para esa materia.");}
    }
    public static void registro(){
        System.out.println("/**REGISTROS**/");
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        ArrayList<String[]> cursosExistentes=new ArrayList<String[]>();
        try {
            InputStream inputstream = AcademicoHogwarts.class.getResourceAsStream("/recursos/curso.txt");
            InputStreamReader inputreader = new InputStreamReader(inputstream);
            br = new BufferedReader(inputreader);
            String linea;
            while ((linea = br.readLine()) != null) {
                cursosExistentes.add(linea.split(","));
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
        System.out.println("/** MATERIAS **/");
        System.out.println("1. Pociones");
        System.out.println("2. Defensa contra las artes oscuras");
        System.out.println("3. Adivinación");
        System.out.println("4. Astronomía");
        System.out.println("5. Historia de la Magia");
        System.out.println("6. Herbología");
        System.out.println("7. Encantamientos");
        System.out.println("8. Vuelo");
        Scanner sc=new Scanner(System.in);
        boolean opcionCorrecta=false;
        String materiaElegida="";
        while (opcionCorrecta==false){
            System.out.println("Elija una materia del listado de materias: ");
            int opcion1=sc.nextInt();
            if (opcion1==1){
                opcionCorrecta=true;
                materiaElegida="Pociones";}
            else if (opcion1==2){
                opcionCorrecta=true;
                materiaElegida="Defensa contra las artes oscuras";}
            else if (opcion1==3){
                opcionCorrecta=true;
                materiaElegida="Adivinación";}
            else if (opcion1==4){
                opcionCorrecta=true;
                materiaElegida="Astronomía";}
            else if (opcion1==5){
                opcionCorrecta=true;
                materiaElegida="Historia de la Magia";}
            else if (opcion1==6){
                opcionCorrecta=true;
                materiaElegida="Herbología";}
            else if (opcion1==7){
                opcionCorrecta=true;
                materiaElegida="Encantamientos";}
            else if (opcion1==8){
                opcionCorrecta=true;
                materiaElegida="Vuelo";}
            else{
                System.out.println("Ingrese una opción válida");
            }
        }
        int i;
        int posicion=0;
        boolean existeMateria=false;
        for(i=0;i<cursosExistentes.size();i++){
            if(materiaElegida.equals(cursosExistentes.get(i)[0])){
                existeMateria=true;
                posicion=i;
                break;
            }
        }
        String registrarse="";
        if(existeMateria==true){
            System.out.println("El horario de "+materiaElegida+" es "+cursosExistentes.get(i)[2]+","+cursosExistentes.get(i)[3]);
            System.out.println("Desea registrarse?");
            registrarse=sc.nextLine();
            DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDateTime now=LocalDateTime.now();
            String fecha=dtf.format(now);
            String tipoRegistro="";
            if((edadUsuario<15)&&((materiaElegida.equals("Defensa contra las artes oscuras"))||(materiaElegida.equals("Pociones"))||(materiaElegida.equals("Adivinación")))){
                tipoRegistro="E";
            }
            else{tipoRegistro="N";}
            if (registrarse.equals("S")){
                try {
                    FileWriter f = new FileWriter(new File("src/recursos/registro.txt"),true);
                    f.append(fecha+","+nombreUsuario+","+apellidoUsuario+","+materiaElegida+","+tipoRegistro);
                    f.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Sus datos se han guardado");
            }
            else{System.out.println("No se guardo ningun dato");}
        }
        else{System.out.println("No hay horarios planificados para esa materia.");}
    }
    public static void descripcionVuelo(){
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw=null;
        BufferedWriter bw=null;
        ArrayList<String[]> estudiantes=new ArrayList<String[]>();
        try {
            InputStream inputstream = AcademicoHogwarts.class.getResourceAsStream("/recursos/estudiantes.txt");
            InputStreamReader inputreader = new InputStreamReader(inputstream);
            br = new BufferedReader(inputreader);
            String linea;
            while ((linea = br.readLine()) != null) {
                estudiantes.add(linea.split(","));
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
        int i;
        for(i=0;i<estudiantes.size();i++){
            if(nombreUsuario.equals(estudiantes.get(i)[0])&&apellidoUsuario.equals(estudiantes.get(i)[1])){
                tipoUsuario=estudiantes.get(i)[5];
                break;
            }
        }
        if (tipoUsuario.equals("N")){
            Normal n=new Normal(nombreUsuario,apellidoUsuario,varitaUsuario,edadUsuario,"null");
            n.volar();
        }
        else if (tipoUsuario.equals("A")){
            Animago n=new Animago(nombreUsuario,apellidoUsuario,varitaUsuario,edadUsuario,"null","null");
            n.volar();
        }
        else if (tipoUsuario.equals("M")){
            Metamorfomago n=new Metamorfomago(nombreUsuario,apellidoUsuario,varitaUsuario,edadUsuario,"null");
            n.volar();
        }
    }
    
}