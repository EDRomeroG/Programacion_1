package model;

public class Visitante
{
    private String nombre;
    private String apellido;
    private int edad;
    private String id;
    private String tipoVisitante;
    private String sexo;
    private int peso;
    private Visitante visitante1;
    private Visitante visitante2;
    private Visitante visitante3;
    private Visitante visitante4;
    private Visitante visitante5;
    private Visitante visitante6;
    private Visitante visitante7;
    private Visitante visitante8;
    private Visitante visitante9;
    private Visitante visitante10;

    public Visitante() {

    }

    public Visitante getVisitante1() {
        return visitante1;
    }

    public void setVisitante1(Visitante visitante1) {
        this.visitante1 = visitante1;
    }

    public Visitante getVisitante2() {
        return visitante2;
    }

    public void setVisitante2(Visitante visitante2) {
        this.visitante2 = visitante2;
    }

    public Visitante getVisitante3() {
        return visitante3;
    }

    public void setVisitante3(Visitante visitante3) {
        this.visitante3 = visitante3;
    }

    public Visitante getVisitante4() {
        return visitante4;
    }

    public void setVisitante4(Visitante visitante4) {
        this.visitante4 = visitante4;
    }

    public Visitante getVisitante5() {
        return visitante5;
    }

    public void setVisitante5(Visitante visitante5) {
        this.visitante5 = visitante5;
    }

    public Visitante getVisitante6() {
        return visitante6;
    }

    public void setVisitante6(Visitante visitante6) {
        this.visitante6 = visitante6;
    }

    public Visitante getVisitante7() {
        return visitante7;
    }

    public void setVisitante7(Visitante visitante7) {
        this.visitante7 = visitante7;
    }

    public Visitante getVisitante8() {
        return visitante8;
    }

    public void setVisitante8(Visitante visitante8) {
        this.visitante8 = visitante8;
    }

    public Visitante getVisitante9() {
        return visitante9;
    }

    public void setVisitante9(Visitante visitante9) {
        this.visitante9 = visitante9;
    }

    public Visitante getVisitante10() {
        return visitante10;
    }

    public void setVisitante10(Visitante visitante10) {
        this.visitante10 = visitante10;
    }







    public Visitante(String nombre, String apellido, int edad, String id, String tipoVisitante, String sexo, int peso)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id = id;
        this.tipoVisitante = tipoVisitante;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public int getEdad()
    {
        return edad;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTipoVisitante()
    {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante)
    {
        this.tipoVisitante = tipoVisitante;
    }

    public String getSexo()
    {
        return sexo;
    }

    public void setSexo(String sexo)
    {
        this.sexo = sexo;
    }

    public int getPeso()
    {
        return peso;
    }

    public void setPeso(int peso)
    {
        this.peso = peso;
    }
}
