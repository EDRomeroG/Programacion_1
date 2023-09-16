package model;

public class Atraccion
{
    private String nombre;
    private String horario;
    private String descripcion;
    private int rangoEdad;
    private String nivelPeligro;
    private int pesoMaximo;
    private Atraccion atraccion1;
    private Atraccion atraccion2;
    private Atraccion atraccion3;
    private Atraccion atraccion4;
    private Atraccion atraccion5;
    private Atraccion atraccion6;
    private Atraccion atraccion7;

    public Atraccion getAtraccion1()
    {
        return atraccion1;
    }

    public void setAtraccion1(Atraccion atraccion1)
    {
        this.atraccion1 = atraccion1;
    }

    public Atraccion getAtraccion2() {
        return atraccion2;
    }

    public void setAtraccion2(Atraccion atraccion2) {
        this.atraccion2 = atraccion2;
    }

    public Atraccion getAtraccion3() {
        return atraccion3;
    }

    public void setAtraccion3(Atraccion atraccion3) {
        this.atraccion3 = atraccion3;
    }

    public Atraccion getAtraccion4() {
        return atraccion4;
    }

    public void setAtraccion4(Atraccion atraccion4) {
        this.atraccion4 = atraccion4;
    }

    public Atraccion getAtraccion5() {
        return atraccion5;
    }

    public void setAtraccion5(Atraccion atraccion5) {
        this.atraccion5 = atraccion5;
    }

    public Atraccion getAtraccion6() {
        return atraccion6;
    }

    public void setAtraccion6(Atraccion atraccion6) {
        this.atraccion6 = atraccion6;
    }

    public Atraccion getAtraccion7() {
        return atraccion7;
    }

    public void setAtraccion7(Atraccion atraccion7) {
        this.atraccion7 = atraccion7;
    }

    public Atraccion getAtraccion8() {
        return atraccion8;
    }

    public void setAtraccion8(Atraccion atraccion8) {
        this.atraccion8 = atraccion8;
    }

    public Atraccion getAtraccion9() {
        return atraccion9;
    }

    public void setAtraccion9(Atraccion atraccion9) {
        this.atraccion9 = atraccion9;
    }

    public Atraccion getAtraccion10() {
        return atraccion10;
    }

    public void setAtraccion10(Atraccion atraccion10) {
        this.atraccion10 = atraccion10;
    }

    private Atraccion atraccion8;
    private Atraccion atraccion9;
    private Atraccion atraccion10;

    public Atraccion(String nombre, String horario, String descripcion, int rangoEdad, String nivelPeligro, int pesoMaximo)
    {
        this.nombre = nombre;
        this.horario = horario;
        this.descripcion = descripcion;
        this.rangoEdad = rangoEdad;
        this.nivelPeligro = nivelPeligro;
        this.pesoMaximo = pesoMaximo;
    }

    public Atraccion() {

    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {

        this.nombre = nombre;
    }

    public String getHorario()
    {
        return this.horario;
    }

    public void setHorario(String horario)
    {
        this.horario = horario;
    }

    public String getDescripcion()
    {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        descripcion = descripcion;
    }

    public int getRangoEdad()
    {
        return rangoEdad;
    }

    public void setRangoEdad(int rangoEdad)
    {
        this.rangoEdad = rangoEdad;
    }

    public String getNivelPeligro()
    {
        return nivelPeligro;
    }

    public void setNivelPeligro(String nivelPeligro)
    {
        this.nivelPeligro = nivelPeligro;
    }

    public int getPesoMaximo()
    {
        return pesoMaximo;
    }

    public void setPesoMaximo(int pesoMaximo)
    {
        this.pesoMaximo = pesoMaximo;
    }
}
