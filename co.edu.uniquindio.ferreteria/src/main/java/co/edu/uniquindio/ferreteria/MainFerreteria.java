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
        //variable para obtener informacion
        Scanner sc= new Scanner(System.in);
        //variables auxiliares
        int opcion;
        String cedula;

        //creaacion de relaciones con las demas clases y sus metodos
        Factura factura = new Factura();
        Factura factura2 = new Factura();
        Cliente cliente= new Cliente();
        Empleado empleado = new Empleado();
        Producto producto= new Producto();

        //inicializacion de datos
        producto.inicializarProductos();
        empleado.iniciarEmpleado();
        cliente.iniciarCliente();

        //prueba programa
        System.out.println("ingrese Numero de cedula: "); //cli1: 10961, cli2: 10962, cli3: 10963, cli4: 10964
        cedula=sc.nextLine();  // captura u obtiene el texto ingresado

        //agregando productos a la factura
        factura.agregarProducto(producto.getProducto1());
        factura.agregarProducto(producto.getProducto2());

        //Primera factura
        factura.mostrarFactura(cedula);
        System.out.println("*** Gracias por su compra ***");
        System.out.println("\n");

        //precio nuevo a un producto
        producto.cambiarPrecio(5000, producto.getProducto1());

        //creacion segunda factura con cambio en el precio de un producto
        factura2.agregarProducto(producto.getProducto1());
        factura2.agregarProducto(producto.getProducto2());

        System.out.println("*** Factura con nuevo precio ***");
        System.out.println("\n");
        factura2.mostrarFactura(cedula);
        System.out.println("*** Gracias por su compra ***");

    }

}