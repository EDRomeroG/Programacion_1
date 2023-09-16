package model;

public class Factura {

    Empleado miEmpleado;
    Cliente miCliente;
    Productos miProductos;
     private String totalidad;

    public Factura(Empleado miEmpleado, Cliente miCliente, Productos miProductos, String totalidad) {
        this.miEmpleado = miEmpleado;
        this.miCliente = miCliente;
        this.miProductos = miProductos;
        this.totalidad = totalidad;

    }

    public Factura() {
    }

    public Empleado getMiEmpleado() {
        return miEmpleado;
    }

    public void setMiEmpleado(Empleado miEmpleado) {
        this.miEmpleado = miEmpleado;
    }

    public Cliente getMiCliente() {
        return miCliente;
    }

    public void setMiCliente(Cliente miCliente) {
        this.miCliente = miCliente;
    }

    public Productos getMiProductos() {
        return miProductos;
    }

    public void setMiProductos(Productos miProductos) {
        this.miProductos = miProductos;
    }

    public String getTotalidad() {
        return totalidad;
    }

    public void setTotalidad(String totalidad) {
        this.totalidad = totalidad;
    }
}
