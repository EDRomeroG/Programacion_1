package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main
{
    public static void main(String args[])
    {
        Estudiante estudiante1= new Estudiante();
        Estudiante estudiante2= new Estudiante();
        Estudiante estudisnte3= new Estudiante();




    }

    public static void crearEstudiante (Estudiante estudiante1, Estudiante estudiante2)
    {

        //datos para el primer estudiante
        estudiante1.setNombre("Juan");
        estudiante1.setCorreo("juan@mail.com");
        estudiante1.setSemestre(3);
        estudiante1.setEdad(17);
        estudiante1.setNota1(3F);
        estudiante1.setNota2(3.0F);
        estudiante1.setNota3(4.5F);

        //datos para el segundo estudiante
        estudiante2.setNombre("Maria");
        estudiante2.setCorreo("pepita@mail.com");
        estudiante2.setSemestre(1);
        estudiante2.setEdad(15);
        estudiante2.setNota1(2F);
        estudiante2.setNota2(2.5F);
        estudiante2.setNota3(4.5F);

        //datos para el tercer estudiante
        estudiante2.setNombre("Pepe");
        estudiante2.setCorreo("pepe@mail.com");
        estudiante2.setSemestre(4);
        estudiante2.setEdad(20);
        estudiante2.setNota1(4F);
        estudiante2.setNota2(2.5F);
        estudiante2.setNota3(4.5F);
    }

    //metodo para calcular nota definitiva
    public static float calcularDefinitiva(Estudiante estudiante)
    {
        float notaDef=0, nota1, nota2, nota3;
        nota1= estudiante.getNota1();
        nota2= estudiante.getNota2();
        nota3= estudiante.getNota3();
        notaDef= (nota1+nota2+nota3)/3;

        return notaDef;
    }

    //metodo para sacar promedio de curso
    public static float verPromedioCurso(float nota1, float nota2, float nota3 )
    {
        float def=0;
        def=(nota1+nota2+nota3)/3;

        return def;
    }

    //metodo para ver el promedio de edad
    public static int verPromedioEdad(int edad1, int edad2, int edad3 )
    {
        int promedio=0;
        promedio =(edad1+edad2+edad3)/3;

        return promedio;
    }

    public static float verPromedioNota1(float nota1, float nota2, float nota3 )
    {
        float def=0;
        def=(nota1+nota2+nota3)/3;

        return def;
    }

}
