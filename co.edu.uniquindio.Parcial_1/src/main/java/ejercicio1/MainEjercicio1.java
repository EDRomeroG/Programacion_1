package ejercicio1;

import model.Curso;
import model.Docente;
import model.Estudiante;

public class MainEjercicio1
{
    public static void main(String[] args)
    {
        double def1,def2,def3;

        Curso curso=inicializarDatos();

        def1=curso.calcularDefinitiva(curso.getEstudiante1());
        def2=curso.calcularDefinitiva(curso.getEstudiante2());
        def3=curso.calcularDefinitiva(curso.getEstudiante3());
        System.out.println("la nota definitiva del estudiante 1 es: "+def1+"/n"+"La nota definitiva del estudiante 2 es: "+def2+"/n"+"la nota definitvia del estudiante 3 es: "+ def3);

        Curso aux;



        curso.mostarInformacionEstudiante();

    }
    public static Curso inicializarDatos()
    {
        Estudiante estudiante1 = crearEstudiante("Juan","perez","12-12-1996", 17, "juan@mail.com", 3, 172, 3, 4.5, 5,3,4.2);
        Estudiante estudiante2 = crearEstudiante("Maria","Garzon", "30-08-1998",15,"pepita@mail.com", 1, 165,2, 2.5, 4.5,3.5,3);
        Estudiante estudiante3 =crearEstudiante("Pepe","Romero","09-12-1998", 20, "pepe@mail.com", 4,180, 4, 2.5, 4.5,4.0,2.0);
        Docente docente= new Docente("Carlos","Bustamante", 32, "carlos@");
        Docente docenteAux=new Docente("Andres","Lopez", 28,"andriu@");
        Curso curso = new Curso("Programacion", 2, "11122q@",3, "Nocturna","Ing. Sistemas","Ingenieria");
        curso.setEstudiante1(estudiante1);
        curso.setEstudiante2(estudiante2);
        curso.setEstudiante3(estudiante3);
        curso.setDocente(docente);
        curso.setDocenteAux(docenteAux);


        return curso;
    }
    private static Estudiante crearEstudiante(String nombre,String apellido,String fechaNacimineto, int edad, String correo, int semestre,int estatura, double nota1, double nota2, double nota3, double nota4, double nota5){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setFechaNacimineto(fechaNacimineto);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setEstatura(estatura);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);
        estudiante.setNota4(nota4);
        estudiante.setNota5(nota5);

        return estudiante;
    }
}
