package co.edu.uniquindio.prestamo.utilidades;

import co.edu.uniquindio.prestamo.model.Cliente;
import co.edu.uniquindio.prestamo.model.Empleado;
import co.edu.uniquindio.prestamo.model.Objeto;
import co.edu.uniquindio.prestamo.model.PrestamoUq;

import javax.swing.*;
import java.util.List;


public class Utilidad
{


    /**
     * Metodo para Iniciar la interaccion con el usuario (menu Principal)
     * @param prestamoUq
     */
    public static void mostarMenuPrincipal(PrestamoUq prestamoUq)
    {
        int opcion=0;

        while (opcion != 4)
        {
            String entrada = JOptionPane.showInputDialog
                    ("**** Menu Principal ****" + "\n" +
                            "1. Gestión de Clientes" + "\n" +
                            "2. Gestión de Empleados" + "\n" +
                            "3. Gestión de Objetos" + "\n" +
                            "4. Salir" + "\n" +
                            "Seleccione una Opcion");
            if (verificarOpcion(entrada))
            {
                opcion = Integer.parseInt(entrada);
                switch (opcion) {
                    case 1:
                        // Llamar al menú de  clientes
                        mostarMenuClientes(prestamoUq);
                        break;
                    case 2:
                        // Llamar al menú de empleados
                        mostarMenuEmpleados(prestamoUq);
                        break;
                    case 3:
                        // Llamar al menú de Objetos
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
            else
            {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }
        }
    }
    /**
     * Metodo para Mostrar el menu de clientes
     * @param prestamosUq
     */
    private static void mostarMenuClientes(PrestamoUq prestamosUq)
    {
        int opcion =0;

        while(opcion != 6)
        {
            String entrada = JOptionPane.showInputDialog
                    ("**** Menu Clientes ****" + "\n" +
                            "1. Crear cliente" + "\n" +
                            "2. Mostrar clientes" + "\n" +
                            "3. Actualizar datos" + "\n" +
                            "4. Eliminar" + "\n" +
                            "5. Menu Anterior" + "\n" +
                            "6. Salir" + "\n" +
                            "Seleccione una Opcion");
            if (verificarOpcion(entrada))
            {
                opcion = Integer.parseInt(entrada);

                switch (opcion)
                {
                    case 1:
                        //Create
                        String nombre = JOptionPane.showInputDialog
                                ("Ingresa el nombre del Cliente: ");
                        String apellido = JOptionPane.showInputDialog
                                ("Ingresa el apellido del Cliente: ");
                        String cedula = JOptionPane.showInputDialog
                                ("Ingresa la cedula del Cliente: ");
                        int edad =Integer.parseInt( JOptionPane.showInputDialog
                                ("Ingresa la edad del Cliente: "));
                        crearCliente(nombre, apellido, cedula,edad, prestamosUq);

                        JOptionPane.showMessageDialog
                                (null, "Cliente ingresado correctamente.");
                        break;
                    case 2:
                        //Read
                        mostarInformacionClientes(prestamosUq);
                        break;
                    case 3:
                        //Update
                        String cedulaC =JOptionPane.showInputDialog("ingrese la cedula");
                        actualizarCliente(cedulaC, prestamosUq);
                        mostarInformacionClientes(prestamosUq);
                        break;
                    case 4:
                        //Delete
                        String cedulaCliente = JOptionPane.showInputDialog
                                ("Ingresa la cedula del empleado a eliminar: ");
                        eliminarCliente(prestamosUq, cedulaCliente);
                        JOptionPane.showMessageDialog
                                (null, "Lista Nueva despues de eliminar ");
                        mostarInformacionEmpleados(prestamosUq);
                        break;
                    case 5:
                        mostarMenuPrincipal(prestamosUq);
                        break;
                    case 6:
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
            else
            {
                JOptionPane.showMessageDialog
                        (null, "Error: Ingresa un número válido.");
            }
        }
    }


    /**
     * Metodo para mostrar el menu de Empleados
     * @param prestamoUq
     */
    private static void mostarMenuEmpleados(PrestamoUq prestamoUq)
    {
        int opcion = 0;
        while (opcion !=6)
        {

            String entrada = JOptionPane.showInputDialog
                    ("**** Menu Empleado ****" + "\n" +
                            "1. Crear Empleado" + "\n" +
                            "2. Mostrar Empleados" + "\n" +
                            "3. Actualizar datos" + "\n" +
                            "4. Eliminar" + "\n" +
                            "5. Menu Anterior" + "\n" +
                            "6. Salir" + "\n" +
                            "Seleccione una Opcion");
            if(verificarOpcion(entrada))
            {
                opcion = Integer.parseInt(entrada);
                switch (opcion)
                {
                    case 1:
                        //Create Empleado
                        String nombre = JOptionPane.showInputDialog
                                ("Ingresa el nombre del Empleado ");
                        String apellido = JOptionPane.showInputDialog
                                ("Ingresa el apellido del Empleado: ");
                        String cedula = JOptionPane.showInputDialog
                                ("Ingresa la cedula del Empleado: ");
                        int edad =Integer.parseInt( JOptionPane.showInputDialog
                                ("Ingresa la edad del Empleado: "));
                        crearEmpleado(nombre, apellido, cedula,edad, prestamoUq);

                        JOptionPane.showMessageDialog
                                (null, "Empleado ingresado correctamente.");
                        break;
                    case 2:
                        //Read Empleado
                        JOptionPane.showMessageDialog
                                (null, "Objetos registrados:");
                        mostarInformacionEmpleados(prestamoUq);
                        break;
                    case 3:
                        //Update Empleado
                        String cambio = JOptionPane.showInputDialog
                                ("Ingresa cedula del Empleado a Actualizar: ");
                        actualizarDatosEmpleado(prestamoUq, cambio);
                        break;
                    case 4:
                        //Delete Empleado
                        String cedulaEmpleado = JOptionPane.showInputDialog
                                ("Ingresa la cedula del empleado a eliminar: ");
                        eliminarEmpleado(prestamoUq, cedulaEmpleado);
                        JOptionPane.showMessageDialog
                                (null, "Lista Nueva despues de eliminar ");
                        mostarInformacionEmpleados(prestamoUq);
                        break;
                    case 5:
                        mostarMenuPrincipal(prestamoUq);
                        break;
                    case 6:
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
            else
            {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }

        }
    }



    /**
     * Metodo para mostrar el menu de Objetos
     * @param prestamoUq
     */
    private static void mostarMenuObjetos(PrestamoUq prestamoUq)
    {
        int opcion = 0;
        while (opcion!= 6)
        {
            String entrada = JOptionPane.showInputDialog
                    ("**** Menu Objetos ****" + "\n" +
                            "1. Crear Objeto" + "\n" +
                            "2. Mostrar Objeto" + "\n" +
                            "3. Actualizar datos " + "\n" +
                            "4. Eliminar" + "\n" +
                            "5. Menu Anterior" + "\n" +
                            "6. Salir" + "\n" +
                            "Seleccione una Opcion");

            if (verificarOpcion(entrada))
            {
                opcion = Integer.parseInt(entrada);
                switch (opcion)
                {

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
                        JOptionPane.showMessageDialog
                                (null, "Objetos registrados:");
                        mostarInformacionObjetos(prestamoUq);

                        break;
                    case 3:
                        //Update Objeto
                        String codigo1 =JOptionPane.showInputDialog("ingrese codigo del Objeto");
                        actualizarDatosObjeto(prestamoUq, codigo1);
                        mostarInformacionObjetos(prestamoUq);

                        break;
                    case 4:
                        //Delete Objeto
                        String codObjeto = JOptionPane.showInputDialog
                                ("Ingresa codigo del objeto a eliminar: ");
                        eliminarObjeto(prestamoUq, codObjeto);
                        JOptionPane.showMessageDialog
                                (null, "Lista Nueva despues de eliminar ");
                        mostarInformacionObjetos(prestamoUq);
                        break;
                    case 5:
                        mostarMenuPrincipal(prestamoUq);
                        break;
                    case 6:
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
            else
            {
                JOptionPane.showMessageDialog(null, "Error: Ingresa un número válido.");
            }
        }

    }

    /**
     * Metodo para crear un cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param prestamoUq
     */
    private static void crearCliente(String nombre,
                                     String apellido,
                                     String cedula,
                                     int edad,
                                     PrestamoUq prestamoUq)
    {
        prestamoUq.crearCliente(nombre, apellido, cedula, edad);

    }

    /**
     * Metodo para mostar los clientes
     * @param prestamosUq
     */
    private static void mostarInformacionClientes(PrestamoUq prestamosUq)
    {
        List<Cliente> listaClientes = prestamosUq.obtenerClientes();
        String prestamo = prestamosUq.getNombre();
        int totalLista = listaClientes.size();
        for (int i = 0; i < totalLista; i++)
        {
            Cliente cliente = listaClientes.get(i);
            JOptionPane.showMessageDialog
                    (null,prestamo+"\n"+"\n"+cliente.toString());
        }
    }

    /**
     * Metodo para actualizar un cliente
     * @param cedula
     * @param prestamosUq
     */
    private static void actualizarCliente(String cedula, PrestamoUq prestamosUq)
    {
        prestamosUq.actualizarCliente(cedula);

    }

    /**
     * Metodo para eliminar un cliente
     * @param prestamosUq
     * @param cedula
     */
    private static void eliminarCliente(PrestamoUq prestamosUq, String cedula)
    {
        prestamosUq.eliminarCliente(cedula);

    }





    //creacion de Empleados

    /**
     * Metodo para crear un Empleado
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @param prestamoUq
     */
    private static void crearEmpleado(String nombre,
                                      String apellido,
                                      String cedula,
                                      int edad,
                                      PrestamoUq prestamoUq)
    {
        prestamoUq.crearEmpleado(nombre,apellido,cedula,edad);

    }

    /**
     * Metodo para mostar los empleados
     * @param prestamoUq
     */
    //read Empleado
    private static void mostarInformacionEmpleados(PrestamoUq prestamoUq)
    {
        List<Empleado> listaEmpleados = prestamoUq.obtenerEmpleado();
        String prestamo = prestamoUq.getNombre();
        int totalLista = listaEmpleados.size();
        for (int i = 0; i < totalLista; i++)
        {
            Empleado empleado = listaEmpleados.get(i);
            JOptionPane.showMessageDialog(null,prestamo+"\n"+"\n"+empleado.toString());
        }

    }
  // Actualizacion de empleado

    /**
     * Metodo para actualizar un empleado
     * @param prestamoUq
     * @param cedula
     */
    private static void actualizarDatosEmpleado
            (PrestamoUq prestamoUq, String cedula)
    {
        prestamoUq.actualizarEmpleado(cedula);

    }
    //Eliminar Empleado

    /**
     * Metodo para eliminar un empleado
     * @param prestamoUq
     * @param cedula
     */
    private static void eliminarEmpleado
            (PrestamoUq prestamoUq, String cedula)
    {
        prestamoUq.eliminarEmpleado(cedula);

    }


    //creacion de objetos

    /**
     * Metodo para crear un objeto
     * @param nombre
     * @param codigo
     * @param prestamoUq
     */
    private static void crearObjeto(String nombre,
                                    String codigo,
                                    PrestamoUq prestamoUq)
    {
        prestamoUq.crearObjeto(nombre, codigo);

    }

    //Lectura de objetos

    /**
     * Metodo para mostrar los objetos
     * @param prestamosUq
     */
    private static void mostarInformacionObjetos(PrestamoUq prestamosUq)
    {
        List<Objeto> listaObjetos = prestamosUq.obtenerObjetos();
        String prestamo=prestamosUq.getNombre();
        int totalLista = listaObjetos.size();
        for (int i = 0; i < totalLista; i++)
        {
            Objeto objeto = listaObjetos.get(i);
            JOptionPane.showMessageDialog(null,prestamo+"\n"+"\n"+objeto.toString());
        }

    }

    /**
     * Metodo para actualizar un objeto
     * @param prestamosUq
     * @param cambio
     */
    private static void actualizarDatosObjeto
            (PrestamoUq prestamosUq, String cambio)
    {
        prestamosUq.actualizarObjeto(cambio);
    }

    /**
     * Metodo para eliminar un objeto
     * @param prestamosUq
     * @param codObjeto
     */
    private static void eliminarObjeto(PrestamoUq prestamosUq, String codObjeto)
    {
        prestamosUq.eliminarObjeto(codObjeto);

    }

    /**
     * Metodo para verificar si un String es un numero o no
     * @param opcion
     * @return
     */
    public static boolean verificarOpcion(String opcion)
    {
        try
        {
            Integer.parseInt(opcion);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }



}
