package model;

public class Empleado
{
    private String nombre;
    private String apellido;
    private int id;
    private String departamento;
    private String posicion;
    private double salario;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;
    private Empleado empleado4;

    public Empleado(String nombre, String apellido, int id, String departamento, String posicion, double salario)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.departamento = departamento;
        this.posicion = posicion;
        this.salario = salario;
    }

    public Empleado getEmpleado1() {
        return empleado1;
    }

    public void setEmpleado1(Empleado empleado1) {
        this.empleado1 = empleado1;
    }

    public Empleado getEmpleado2() {
        return empleado2;
    }

    public void setEmpleado2(Empleado empleado2) {
        this.empleado2 = empleado2;
    }

    public Empleado getEmpleado3() {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3) {
        this.empleado3 = empleado3;
    }

    public Empleado getEmpleado4() {
        return empleado4;
    }

    public void setEmpleado4(Empleado empleado4) {
        this.empleado4 = empleado4;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
