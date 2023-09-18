package model;

public class Empleado
{
    private String nombre;
    private String cedula;
    private String tel;
    private Empleado empleado1;
    private Empleado empleado2;
    private Empleado empleado3;
    private Empleado empleado4;

    private TipoEmpleado tipoEmpleado;

    public Empleado(String nombre, String cedula, String tel, TipoEmpleado tipoEmpleado)
    {
        this.nombre = nombre;
        this.cedula = cedula;
        this.tel = tel;
        this.tipoEmpleado = tipoEmpleado;
    }

    public Empleado() {

    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getCedula()
    {
        return cedula;
    }

    public void setCedula(String cedula)
    {
        this.cedula = cedula;
    }

    public String getTel()
    {
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

    public Factura iniciarEmpleado() {
        Factura factura = new Factura();
         empleado1 = new Empleado("Robinson", "1023", "316455", TipoEmpleado.ADMINISTRADOR);
         empleado2 = new Empleado("David", "1024", "316456", TipoEmpleado.VENDEDOR);
         empleado3 = new Empleado("Arnulfo", "1025", "316457", TipoEmpleado.VENDEDOR);
         empleado4 = new Empleado("Andres", "1026", "316458", TipoEmpleado.CAJERO);

         factura.setEmpleado1(empleado1);
         factura.setEmpleado2(empleado2);
         factura.setEmpleado3(empleado3);
         factura.setEmpleado4(empleado4);

        return factura;
    }
}
