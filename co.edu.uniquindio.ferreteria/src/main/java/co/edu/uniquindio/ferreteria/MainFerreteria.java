package co.edu.uniquindio.ferreteria;
import model.Cliente;
import model.Producto;
import model.Empleado;
import model.Factura;

import java.util.Scanner;

public class MainFerreteria
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int opcion;
        String cedula;
        Factura factura = new Factura();
        Cliente cliente= new Cliente();
        Empleado empleado = new Empleado();
        Producto producto= new Producto();
        producto.inicializarProductos();
        empleado.iniciarEmpleado();
        cliente.iniciarCliente();

        System.out.println("ingrese NUmero de cedula: ");
        cedula=sc.nextLine();

        factura.agregarProducto(producto.getProducto1());
        factura.agregarProducto(producto.getProducto2());


       factura.mostrarFactura(cedula);




    }

}