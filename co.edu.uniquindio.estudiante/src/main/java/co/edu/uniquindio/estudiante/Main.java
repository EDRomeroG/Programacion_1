package co.edu.uniquindio.estudiante;

import co.edu.uniquindio.estudiante.model.Estudiante;

public class Main
{
    public static void main(String [] args)
    {
        float def1, def2, def3;
        int edad1, edad2, edad3;
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        //metodo para crear a los estudiantes
        crearEstudiante(estudiante1, estudiante2, estudiante3);
        System.out.println("*************************");

        //metodo para obtener la nota definitiva de un estudiante
        def1 = calcularDefinitiva(estudiante1);
        def2 = calcularDefinitiva(estudiante2);
        def3 = calcularDefinitiva(estudiante3);
        System.out.println("La nota definitiva del estudiante: " + estudiante1.getNombre() + " es: " + def1);
        System.out.println("*************************");

        //llamado al metodo ver promedio curso y mostrarlo
        System.out.println("la nota promedio del curso es: " + verPromedioCurso(def1, def2, def3));
        System.out.println("*************************");

        //metodo para saber si el estudiante paso el curso toca mandar el nombre con su respectiva nota
        System.out.println("El estudiante: " + estudiante2.getNombre());
        aprobarCurso(def2);
        System.out.println("*************************");

        //metodo para calcular porcentaje de estudiantes que aprobaron el curso
        System.out.println("El porcentaje de estudiantes que pasaron el curso es: " + calcularCuantosPasan(def1, def2, def3) + "%");
        System.out.println("*************************");

        //metodo para calcular porcentaje de estudiantes que reprobaron el curso
        System.out.println("El porcentaje de estudiantes que no pasaron el curso es: " + calcularCuantosPierden(def1, def2, def3) + "%");
        System.out.println("*************************");

        //almacenado de datos y llamado al metodo para promediar edad del curso
        edad1 = estudiante1.getEdad();
        edad2 = estudiante2.getEdad();
        edad3 = estudiante3.getEdad();
        System.out.println("el promedio de edad en el curso es: " + verPromedioEdad(edad1, edad2, edad3));
        System.out.println("*************************");

        //utilizamos las variables ya creadas para llenar los datos del metodo verPromedioNota1
        def1 = estudiante1.getNota1();
        def2 = estudiante2.getNota1();
        def3 = estudiante3.getNota1();
        System.out.println("el promedio de la nota 1 es: " + verPromedioNota1(def1, def2, def3));
        System.out.println("*************************");

        //Metodo para ver la nota mayor del curso
        System.out.println("la nota mayor es: " + calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3));
        System.out.println("*************************");

        //Metodo para conocer la nota menor del curso
        System.out.println("la nota menor es: " + calcularNotaMenorCurso(estudiante1, estudiante2, estudiante3));
        System.out.println("*************************");

        //Metodo para ver que estudiante tiene todas las notas igual o superior de 4
        calcularNotaMayorA4(estudiante1, estudiante2, estudiante3);
        System.out.println("*************************");

        //Metodo para saber la nota maxima de cada estudiante
        calcularNotaMaxima(estudiante1,estudiante2,estudiante3);


    }

    public static void crearEstudiante(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3)
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
        estudiante2.setNota1(2.0F);
        estudiante2.setNota2(2.5F);
        estudiante2.setNota3(4.5F);

        //datos para el tercer estudiante
        estudiante3.setNombre("Pepe");
        estudiante3.setCorreo("pepe@mail.com");
        estudiante3.setSemestre(4);
        estudiante3.setEdad(20);
        estudiante3.setNota1(4F);
        estudiante3.setNota2(2.5F);
        estudiante3.setNota3(4.5F);
    }

    //metodo para calcular nota definitiva
    public static float calcularDefinitiva(Estudiante estudiante)
    {
        float notaDef, nota1, nota2, nota3;
        nota1 = estudiante.getNota1();
        nota2 = estudiante.getNota2();
        nota3 = estudiante.getNota3();
        notaDef = (nota1 + nota2 + nota3) / 3;

        return notaDef;
    }

    //metodo para sacar promedio de curso
    public static float verPromedioCurso(float nota1, float nota2, float nota3)
    {
        float def ;
        def = (nota1 + nota2 + nota3) / 3f;

        return def;
    }

    //metodo para ver el promedio de edad
    public static double verPromedioEdad(int edad1, int edad2, int edad3)
    {
        double promedio;
        promedio = ((double) (edad1 + edad2 + edad3) / 3);

        return promedio;
    }

    //metodo para ver el promedio de la nota 1
    public static float verPromedioNota1(float nota1, float nota2, float nota3)
    {
        float def ;
        def = (nota1 + nota2 + nota3) / 3;

        return def;
    }


    //metodo para saber la nota mayor del curso
    public static float calcularNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3)
    {
        float notaMayor1 = estudiante1.getNota1();
        float notaMayor2 = estudiante2.getNota1();
        float notaMayor3 = estudiante3.getNota1();
        float notaMayor = 0;

        //se calcula la nota mayor del estudiante 1
        if (estudiante1.getNota2() >= notaMayor1)
        {
            notaMayor1 = estudiante1.getNota2();
        }
        if (estudiante1.getNota3() >= notaMayor1)
        {
            notaMayor1 = estudiante1.getNota3();
        }
        //se calcula la nota mayor del estudiante 2
        if (estudiante2.getNota2() >= notaMayor2)
        {
            notaMayor2 = estudiante2.getNota2();
        }
        if (estudiante2.getNota3() >= notaMayor2)
        {
            notaMayor2 = estudiante2.getNota3();
        }
        //se calcula la nota mayor del estudiante 3
        if (estudiante3.getNota2() > notaMayor3)
        {
            notaMayor3 = estudiante3.getNota2();
        }
        if (estudiante3.getNota3() > notaMayor3)
        {
            notaMayor3 = estudiante1.getNota3();
        }

        if (notaMayor2 >= notaMayor1)
        {
            notaMayor = notaMayor2;
        }
        if (notaMayor3 >= notaMayor)
        {
            notaMayor = notaMayor3;
        }


        return notaMayor;
    }

    //Metodo para saber la nota menor del curso
    public static float calcularNotaMenorCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3)
    {
        float notaMenor1 = estudiante1.getNota1();
        float notaMenor2 = estudiante2.getNota1();
        float notaMenor3 = estudiante3.getNota1();
        float notaMenor = 0;

        //se calcula la nota mayor del estudiante 1
        if (estudiante1.getNota2() <= notaMenor1)
        {
            notaMenor1 = estudiante1.getNota2();
        }
        if (estudiante1.getNota3() <= notaMenor1)
        {
            notaMenor1 = estudiante1.getNota3();
        }
        //se calcula la nota mayor del estudiante 2
        if (estudiante2.getNota2() <= notaMenor2)
        {
            notaMenor2 = estudiante2.getNota2();
        }
        if (estudiante2.getNota3() <= notaMenor2)
        {
            notaMenor2 = estudiante2.getNota3();
        }
        //se calcula la nota mayor del estudiante 3
        if (estudiante3.getNota2() <= notaMenor3)
        {
            notaMenor3 = estudiante3.getNota2();
        }
        if (estudiante3.getNota3() <= notaMenor3)
        {
            notaMenor3 = estudiante1.getNota3();
        }

        if (notaMenor2 <= notaMenor1)
        {
            notaMenor = notaMenor2;
        }
        if (notaMenor3 <= notaMenor)
        {
            notaMenor = notaMenor3;
        }


        return notaMenor;
    }

    //metodo para saber si un estudiante paso el curso
    public static void aprobarCurso(float definitiva)
    {

        if (definitiva <= 2.9)
        {
            System.out.println("Reprobo el curso con: " + definitiva);
        } else {
            System.out.println("Aprobo el curso con :" + definitiva);
            System.out.println("*******FELICIDADES*******");
        }

    }

    //Metodo para saber cuantos ganaron el curso
    public static float calcularCuantosPasan(float def1, float def2, float def3)
    {
        int contador = 0;
        float porcentajePasaron;
        if (def1 > 2.9) {
            contador++;
        }
        if (def2 > 2.9) {
            contador++;
        }
        if (def3 > 2.9) {
            contador++;
        }
        porcentajePasaron = (contador * 100f) / 3;

        return porcentajePasaron;
    }

    //Metodo para saber cuantos perdieron el curso
    public static float calcularCuantosPierden(float def1, float def2, float def3)
    {
        int contador = 0;
        float pierden;
        if (def1 < 3) {
            contador++;
        }
        if (def2 < 3) {
            contador++;
        }
        if (def3 < 3) {
            contador++;
        }
        pierden = (contador * 100f) / 3f;

        return pierden;
    }

    //Metodo para saber las notas mayores o iguales a 4
    public static void calcularNotaMayorA4(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3)
    {
        if (estudiante1.getNota1() >= 4 && estudiante1.getNota2() >= 4 && estudiante1.getNota3() >= 4)
        {
            System.out.println("El estudiante: " + estudiante1.getNombre() + " tiene todas las notas en 4 o superior");

        }
        if (estudiante2.getNota1() >= 4 && estudiante2.getNota2() >= 4 && estudiante2.getNota3() >= 4)
        {
            System.out.println("El estudiante: " + estudiante2.getNombre() + " tiene todas las notas en 4 o superior");

        }
        if (estudiante3.getNota1() >= 4 && estudiante3.getNota2() >= 4 && estudiante3.getNota3() >= 4)
        {
            System.out.println("El estudiante: " + estudiante3.getNombre() + " tiene todas las notas en 4 o superior");
        }
        else
        {
            System.out.println("Ningun estudiante tiene las notas iguales o mayores a 4");
        }
    }
    //Metodo para saber nota maxima
    public static void calcularNotaMaxima(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3)
    {
        float notaMayor1=estudiante1.getNota1();
        float notaMayor2=estudiante2.getNota1();
        float notaMayor3=estudiante3.getNota1();

        //se calcula la nota mayor del estudiante 1
        if (estudiante1.getNota2() >= notaMayor1)
        {
            notaMayor1 = estudiante1.getNota2();
        }
        if (estudiante1.getNota3() >= notaMayor1)
        {
            notaMayor1 = estudiante1.getNota3();
        }
        //se calcula la nota mayor del estudiante 2
        if (estudiante2.getNota2() >= notaMayor2)
        {
            notaMayor2 = estudiante2.getNota2();
        }
        if (estudiante2.getNota3() >= notaMayor2)
        {
            notaMayor2 = estudiante2.getNota3();
        }
        //se calcula la nota mayor del estudiante 3
        if (estudiante3.getNota2() >= notaMayor3)
        {
            notaMayor3 = estudiante3.getNota2();
        }
        if (estudiante3.getNota3() >= notaMayor3)
        {
            notaMayor3 = estudiante3.getNota3();
        }
        System.out.println("la nota mayor del estudiante: "+estudiante1.getNombre()+" es: "+notaMayor1);
        System.out.println("la nota mayor del estudiante: "+estudiante2.getNombre()+" es: "+notaMayor2);
        System.out.println("la nota mayor del estudiante: "+estudiante2.getNombre()+" es: "+notaMayor3);

    }

}
