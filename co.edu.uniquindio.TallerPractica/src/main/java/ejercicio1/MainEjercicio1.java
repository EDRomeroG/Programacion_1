package ejercicio1;
import model.Curso;
import model.Docente;
import model.Estudiante;

public class MainEjercicio1
{
    public static void main(String[] args)
    {
        double nota1, nota2, nota3, def;

        //llenamos o registramos los datos
        Curso curso = inicializarDatos();
        //metodo creado en la clase curso para mostrar la informacion del curso
        curso.mostarInformacionEstudiante();
        //Metodo para obtener la definitiva de cadad estudiante
        nota1=curso.calcularDefinitiva(curso.getEstudiante1());
        nota2=curso.calcularDefinitiva(curso.getEstudiante2());
        nota3=curso.calcularDefinitiva(curso.getEstudiante3());
        //metodo para obtener la definitiva del curso
        def= curso.calcularDefinitivaCurso(nota1,nota2,nota3);
        System.out.println("la nota definitva del curso es: "+ def);

    }
    /*Metodo para incializzar los datos desde la clase curso*/
    public static Curso inicializarDatos()
    {
       Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3, 3, 4.5);
       Estudiante estudiante2 = crearEstudiante("Maria", 15,"pepita@mail.com", 1, 2, 2.5, 4.5);
       Estudiante estudiante3 =crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4.5);
       Docente docente= new Docente("Carlos", 32, "carlos@");
       Curso curso = new Curso("Programacion", 2, "11122q@",3, "Nocturna");
       curso.setEstudiante1(estudiante1);
       curso.setEstudiante2(estudiante2);
       curso.setEstudiante3(estudiante3);

       return curso;
    }
    /*Metodo para llenar los datos del estudiante (podria ir en la clase universidad)*/
    private static Estudiante crearEstudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);

        return estudiante;
    }


}
