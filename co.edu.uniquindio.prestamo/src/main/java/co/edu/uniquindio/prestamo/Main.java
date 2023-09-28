package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        PrestamoUq prestamosUq = inicializarDatosPrueba();


        //Create
        crearCliente("Andres","Perez","0001",23,prestamosUq);
        crearCliente("Maria","Lopez","0002",23, prestamosUq);
        crearCliente("Carlos","Arias","0003",18, prestamosUq);
        crearCliente("Ana","Salinas","0004",20, prestamosUq);

        //Read
        mostarInformacionClientes(prestamosUq);

        //Update
        actializarDatos(prestamosUq, "0004", 25);
        System.out.println("Actualizacion Edad Cliente 4");
        mostarInformacionClientes(prestamosUq);

        //Delete
        eliminarCliente(prestamosUq, "0001");
        System.out.println("Lista Nueva despues de eliminar ");
        mostarInformacionClientes(prestamosUq);

        
    }




    private static PrestamoUq inicializarDatosPrueba()
    {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamos Rapidos");


        return prestamoUq;
    }
    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq)
    {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);

    }

    private static void actializarDatos(PrestamoUq prestamosUq, String cedula, int nuevaEdad)
    {
     prestamosUq.actualizarEdad(cedula,nuevaEdad);
    }
    private static void eliminarCliente(PrestamoUq prestamosUq,String cedula)
    {
        prestamosUq.eliminarCliente(cedula);

    }
    private static void mostarInformacionClientes(PrestamoUq prestamosUq)
    {
        List<Cliente> listaClientes = prestamosUq.obtenerClientes();
        int totalLista = listaClientes.size();
        for(int i=0; i<totalLista; i++)
        {
            Cliente cliente = listaClientes.get(i);
            System.out.println(cliente.toString());
        }
    }


}