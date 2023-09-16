package model;

public class Curso
{
    private String nombre;
    private int semestre;
    private String grupo;
    private int creditos;
    private String jornada;
    private String programa;
    private String falcultad;
    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;
    private Docente docente;
    private Docente docenteAux;

    /*Constructor*/
    public Curso (String nombre, int semestre, String grupo, int creditos, String jornada, String programa, String facultad)
    {
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
        this.programa = programa;
        this.falcultad = facultad;
    }

    /*Geters y Seters*/

    public Docente getDocenteAux() {
        return docenteAux;
    }

    public void setDocenteAux(Docente docenteAux) {
        this.docenteAux = docenteAux;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getFalcultad() {
        return falcultad;
    }

    public void setFalcultad(String falcultad) {
        this.falcultad = falcultad;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getSemestre()
    {
        return semestre;
    }
    public void setSemestre(int semestre)
    {
        this.semestre = semestre;
    }

    public String getGrupo()
    {
        return grupo;
    }
    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    public int getCreditos()
    {
        return creditos;
    }
    public void setCreditos(int creditos)
    {
        this.creditos = creditos;
    }

    public String getJornada()
    {
        return jornada;
    }
    public void setJornada(String jornada)
    {
        this.jornada = jornada;
    }

    public Estudiante getEstudiante1()
    {
        return estudiante1;
    }
    public void setEstudiante1(Estudiante estudiante1)
    {
        this.estudiante1 = estudiante1;
    }

    public Estudiante getEstudiante2()
    {
        return estudiante2;
    }
    public void setEstudiante2(Estudiante estudiante2)
    {
        this.estudiante2 = estudiante2;
    }

    public Estudiante getEstudiante3()
    {
        return estudiante3;
    }
    public void setEstudiante3(Estudiante estudiante3)
    {
        this.estudiante3 = estudiante3;
    }

    public Docente getDocente()
    {
        return docente;
    }
    public void setDocente(Docente docente)
    {
        this.docente = docente;
    }

    /*Metodo para mostrar la informacion de los estudiantes*/

    public void mostarInformacionEstudiante()
    {
        String informacionEstudiante1 = estudiante1.obtenerInformacion();
        String informacionEstudiante2 = getEstudiante2().obtenerInformacion();
        String infromacionEstudiante3 = getEstudiante3().obtenerInformacion();
        System.out.println("***********");
        System.out.println("Estudiante 1: "+informacionEstudiante1);
        System.out.println("***********");
        System.out.println("***********");
        System.out.println("Estudiante 2: "+informacionEstudiante2);
        System.out.println("***********");
        System.out.println("Estudiante 3: "+infromacionEstudiante3);
    }
    public static double calcularDefinitiv
    (Estudiante estudiante)
    {

        double notaDef=0, nota1, nota2, nota3;
        nota1= estudiante.getNota1();
        nota2= estudiante.getNota2();
        nota3= estudiante.getNota3();
        notaDef= (nota1+nota2+nota3)/3;

        return notaDef;
    }
    public static double calcularDefinitivaCurso(double nota1, double nota2, double nota3)
    {
        double notaDef=0;
        notaDef= (nota1+nota2+nota3)/3;

        return notaDef;
    }




}
