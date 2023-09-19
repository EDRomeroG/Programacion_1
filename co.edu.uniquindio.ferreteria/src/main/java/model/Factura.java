package model;
import java.util.Scanner;

public class Factura
{
    Scanner sc = new Scanner(System.in);
    private int opcion;

    private double total;
    private int contarPro;
    private Producto producto1;
    private Producto producto2;
    private Producto producto3;
    private Producto producto4;
     private String totalidad;
     private Cliente cliente1;
     private Cliente cliente2;
     private Cliente cliente3;
     private  Cliente cliente4;
     private Empleado empleado1;
     private Empleado empleado2;
     private Empleado empleado3;
     private Empleado empleado4;

    public Factura()
    {

    }

    public Factura(double total, int contarPro)
    {
        this.total = total;
        this.contarPro = contarPro;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public Producto getProducto4() {
        return producto4;
    }

    public void setProducto4(Producto producto4) {
        this.producto4 = producto4;
    }

    public String getTotalidad() {
        return totalidad;
    }

    public void setTotalidad(String totalidad) {
        this.totalidad = totalidad;
    }

    public Cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(Cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public Cliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(Cliente cliente2) {
        this.cliente2 = cliente2;
    }

    public Cliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(Cliente cliente3) {
        this.cliente3 = cliente3;
    }

    public Cliente getCliente4() {
        return cliente4;
    }

    public void setCliente4(Cliente cliente4) {
        this.cliente4 = cliente4;
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

    public Empleado getEmpleado3()
    {
        return empleado3;
    }

    public void setEmpleado3(Empleado empleado3)
    {
        this.empleado3 = empleado3;
    }

    public Empleado getEmpleado4()
    {
        return empleado4;
    }

    public void setEmpleado4(Empleado empleado4)
    {
        this.empleado4 = empleado4;
    }

    //Metodo para agregar productos
    public void agregarProducto(Producto producto)
    {
        total += producto.getPrecio();
        contarPro++;
    }
    // Método matches para verificar si lo que ingreso contiene solo numeros o no
    public static boolean esString(String input)
    {

        return input.matches("[0-9]+");
    }

    //Metodo para mostrar  factura
    public void mostrarFactura( String id )
    {
        if (esString(id)) {
            if (id.equals("10961"))
            {
                System.out.println("----- Factura -----");
                System.out.println("---- " + "Juan" + " ----");
                System.out.println("Total de productos: " + contarPro);
                System.out.println("Total: $" + total);
                System.out.println("-------------------");
            }
            else if (id.equals("10962"))
            {
                System.out.println("----- Factura -----");
                System.out.println("---- " + "Daniel" + " ----");
                System.out.println("Total de productos: " + contarPro);
                System.out.println("Total: $" + total);
                System.out.println("-------------------");
            }
            else if (id.equals("10963"))
            {
                System.out.println("----- Factura -----");
                System.out.println("---- " + "Pepe" + " ----");
                System.out.println("Total de productos: " + contarPro);
                System.out.println("Total: $" + total);
                System.out.println("-------------------");
            }
            else if (id.equals("10964"))
            {
                System.out.println("----- Factura -----");
                System.out.println("---- " + "Rosa" + " ----");
                System.out.println("Total de productos: " + contarPro);
                System.out.println("Total: $" + total);
                System.out.println("-------------------");
            }
            else
            {
                System.out.println("Documento no válido o no está registrado");
            }
        }
        else
        {
            System.out.println("verificar si el codigo ingresado es valido o no esta registrado");
        }



    }

}
