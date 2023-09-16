package model;

public class Estudiante
{
    private String nombre;
    private String apellido;
    private int edad;
    private String fechaNacimineto;
    private String correo;
    private int semestre;
    private int estatura;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    /*Constructor*/
    public Estudiante(String nombre, int edad, String correo,String fechaNacimineto, int semestre,int estatura, double nota1, double nota2, double nota3, double nota4,double nota5)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimineto=fechaNacimineto;
        this.correo = correo;
        this.semestre = semestre;
        this.estatura=estatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;

    }

    public Estudiante() {

    }


    /*Getters y Setters*/

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimineto() {
        return fechaNacimineto;
    }

    public void setFechaNacimineto(String fechaNacimineto) {
        this.fechaNacimineto = fechaNacimineto;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public int getEdad()
    {
        return edad;
    }
    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getCorreo()
    {
        return correo;
    }
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    public int getSemestre()
    {
        return semestre;
    }
    public void setSemestre(int semestre)
    {
        this.semestre = semestre;
    }

    public double getNota1()
    {
        return nota1;
    }
    public void setNota1 (double nota1)
    {
        this.nota1 = nota1;
    }
    public double getNota2()
    {
        return nota2;
    }
    public void setNota2(double nota2)
    {
        this.nota2 = nota2;
    }

    public double getNota3()
    {
        return nota3;
    }
    public void setNota3(double nota3)
    {
        this.nota3 = nota3;
    }

    /*Metodo para obtener la informacion de un estudiante*/
    public String obtenerInformacion()
    {
        String informacion = "";
        informacion = informacion +
                "Nombre: "+getNombre() + "\n"+
                "Apellido: "+getApellido() + "\n"+
                "edad: "+getEdad() + "\n"+
                "Fecha de Nacimineto: "+getFechaNacimineto() + "\n"+
                "Correo: "+getCorreo() + "\n"+
                "Semestre: "+getSemestre() + "\n"+
                "Estatura: "+getEstatura() + "\n"+
                "Nota1: "+getNota1() + "\n"+
                "Nota2: "+getNota2() + "\n"+
                "Nota3: "+getNota3() + "\n"+
                "Nota4: "+getNota4() + "\n"+
                "Nota5: "+getNota5() + "\n";

        return informacion;
    }




}
