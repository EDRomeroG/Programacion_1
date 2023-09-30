package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.Objeto;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import javax.swing.*;
import java.util.List;

public class Main
{

    public static void main(String[] args)
    {
        PrestamoUq prestamosUq = inicializarDatosPrueba();
        mostarMenuPrincipal(prestamosUq);


    }


    public static void mostarMenuPrincipal(PrestamoUq prestamoUq)
    {
        int opcion=0;

        while (opcion != 4)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog
                    ("**** Menu Principal ****" + "\n" +
                            "1. Gestión de Clientes" + "\n" +
                            "2. Gestión de Empleados" + "\n" +
                            "3. Gestión de Objetos" + "\n" +
                            "4. Salir" + "\n" +
                            "Seleccione una Opcion"));
            switch (opcion)
            {
                case 1:
                    // Llamar al menú de gestión de clientes
                    mostarMenuClientes(prestamoUq);
                    break;
                case 2:
                    // Llamar al menú de gestión de empleados
                    mostarMenuEmpleados(prestamoUq);
                    break;
                case 3:
                    // Llamar al menú de gestión de objetos
                    mostarMenuObjetos(prestamoUq);
                    break;
                case 4:
                    JOptionPane.showMessageDialog
                            (null, "Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog
                            (null, "Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        }
    }


    private static PrestamoUq inicializarDatosPrueba()
    {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamos Rapidos");


        return prestamoUq;
    }

    private static void mostarMenuClientes(PrestamoUq prestamosUq)
    {
        int opcion =0;

        while(opcion != 5)
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog
                    ("**** Menu Clientes ****" + "\n" +
                            "1. Crear cliente" + "\n" +
                            "2. Mostrar clientes" + "\n" +
                            "3. Actualizar datos" + "\n" +
                            "4. Eliminar" + "\n" +
                            "5. Salir" + "\n" +
                            "Seleccione una Opcion"));
            switch (opcion)
            {
                case 1:
                //Create
                crearCliente("Andres", "Perez", "0001", 23, prestamosUq);
                crearCliente("Maria", "Lopez", "0002", 23, prestamosUq);
                crearCliente("Carlos", "Arias", "0003", 18, prestamosUq);
                crearCliente("Ana", "Salinas", "0004", 20, prestamosUq);
                break;
                case 2:
                //Read
                mostarInformacionClientes(prestamosUq);
                break;
                case 3:
                //Update
                // actializarDatos(prestamosUq, "0004", 25);
                System.out.println("Actualizacion Edad Cliente 4");
                mostarInformacionClientes(prestamosUq);
                break;
                case 4:
                //Delete
                eliminarCliente(prestamosUq, "0001");
                System.out.println("Lista Nueva despues de eliminar ");
                mostarInformacionClientes(prestamosUq);
                break;
                case 5:
                JOptionPane.showMessageDialog
                            (null, "Saliendo del programa.");
                System.exit(0);
                break;
                default:
                JOptionPane.showMessageDialog
                            (null, "Opción no válida. Por favor, selecciona una opción válida.");
                break;

            }
        }
    }

    private static void mostarMenuEmpleados(PrestamoUq prestamoUq) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog
                ("**** Menu Empleado ****" + "\n" +
                        "1. Crear Empleado" + "\n" +
                        "2. Mostrar Empleados" + "\n" +
                        "3. Actualizar datos" + "\n" +
                        "4. Eliminar" + "\n" +
                        "5. Salir" + "\n" +
                        "Seleccione una Opcion"));

    }

    private static void mostarMenuObjetos(PrestamoUq prestamoUq) {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog
                ("**** Menu Objetos ****" + "\n" +
                        "1. Crear Objeto" + "\n" +
                        "2. Mostrar Objeto" + "\n" +
                        "3. Actualizar datos " + "\n" +
                        "4. Eliminar" + "\n" +
                        "5. Salir" + "\n" +
                        "Seleccione una Opcion"));
        switch (opcion) {
            case 1:
                //Create Objeto
                String objeto = JOptionPane.showInputDialog
                        ("Ingresa el nombre del objeto: ");
                String codigo = JOptionPane.showInputDialog
                        ("Ingresa el codigo del objeto: ");
                crearObjeto(objeto, codigo, prestamoUq);

                JOptionPane.showMessageDialog
                        (null, "Objeto ingresado correctamente.");
                break;
            case 2:
                //Read Objeto
                System.out.println("Objetos registrados:");
                mostarInformacionObjetos(prestamoUq);

                break;
            case 3:
                //Update Objeto
                String cambio =JOptionPane.showInputDialog
                        ("Ingresa el codigo del objeto a cambiar: ");
                actualizarDatosObjeto(prestamoUq, cambio);
                break;
            case 4:
                //Delete Objeto
                String codObjeto =JOptionPane.showInputDialog
                        ("Ingresa codigo del objeto a eliminar: ");
                eliminarObjeto(prestamoUq, codObjeto);
                JOptionPane.showMessageDialog
                        (null,"Lista Nueva despues de eliminar ");
                mostarInformacionClientes(prestamoUq);
                break;
        }

    }

    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq)
    {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);

    }

   // private static void actializarDatos(PrestamoUq prestamosUq, String cedula, int nuevaEdad) {
     //   prestamosUq.actualizarCliente(cedula);
   // }

    private static void eliminarCliente(PrestamoUq prestamosUq, String cedula)
    {
        prestamosUq.eliminarCliente(cedula);

    }

    private static void mostarInformacionClientes(PrestamoUq prestamosUq)
    {
        List<Cliente> listaClientes = prestamosUq.obtenerClientes();
        int totalLista = listaClientes.size();
        for (int i = 0; i < totalLista; i++) {
            Cliente cliente = listaClientes.get(i);
            JOptionPane.showMessageDialog(null,cliente.toString());
        }
    }

    //creacion de objetos
    private static void crearObjeto(String nombre,
                                    String codigo,
                                    PrestamoUq prestamoUq) {
        prestamoUq.crearObjeto(nombre, codigo);

    }

    //Lectura de objetos
    private static void mostarInformacionObjetos(PrestamoUq prestamosUq)
    {
        List<Objeto> listaObjetos = prestamosUq.obtenerObjetos();
        int totalLista = listaObjetos.size();
        for (int i = 0; i < totalLista; i++)
        {
            Objeto objeto = listaObjetos.get(i);
            System.out.println(objeto.toString());
        }

    }

    private static void actualizarDatosObjeto(PrestamoUq prestamosUq, String cambio)
    {
        prestamosUq.actualizarObjeto(cambio);

    }

    private static void eliminarObjeto(PrestamoUq prestamosUq, String codObjeto)
    {
        prestamosUq.eliminarObjeto(codObjeto);

    }



}