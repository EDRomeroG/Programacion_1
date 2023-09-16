package model;

public class Empleado {
    private String nombre;
    private String cedula;
    private String tel;

    private TipoEmpleado tipoEmpleado;

    public Empleado(String nombre, String cedula, String tel, TipoEmpleado tipoEmpleado) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tel = tel;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public TipoEmpleado getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(TipoEmpleado tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public Cliente iniciarCliente() {
        Empleado mEmpleado1 = new Empleado("Robinson", "1023", "316455", TipoEmpleado.ADMINISTRADOR);
        Empleado mEmpleado2 = new Empleado("David", "1024", "316456", TipoEmpleado.VENDEDOR);
        Empleado mEmpleado3 = new Empleado("Arnulfo", "1025", "316457", TipoEmpleado.VENDEDOR);
        Empleado mEmpleado4 = new Empleado("Andres", "1026", "316458", TipoEmpleado.CAJERO);
    }
    }
