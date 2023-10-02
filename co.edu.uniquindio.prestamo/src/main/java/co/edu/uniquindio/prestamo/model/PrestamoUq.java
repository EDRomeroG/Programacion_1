package co.edu.uniquindio.prestamo.model;

import co.edu.uniquindio.prestamo.Main;
import co.edu.uniquindio.prestamo.utilidades.Utilidad;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrestamoUq
{
    private String nombre;

    //creacion lista clientes
    List<Cliente>listaClientes = new ArrayList<>();
    List<Empleado>listaEmpleados=new ArrayList<>();
    List<Objeto>listaObjetos = new ArrayList<>();


    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }

    public void setListaObjetos(List<Objeto> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Metodo para crear un Cliente
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return boolean
     */
    public boolean crearCliente(String nombre, String apellido, String cedula, int edad)
    {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setCedula(cedula);
        cliente.setEdad(edad);

        getListaClientes().add(cliente);

        return true;

    }

    /**
     * Metodo para obtener la lista de clientes
     * @return lista
     */
    public List<Cliente> obtenerClientes()
    {
        return  getListaClientes();
    }


    /**
     * Metodo para actualizar la edad de un cliente
     * @param cedula
         */
    public void actualizarCliente(String cedula)
    {
        for (int i = 0; i < getListaClientes().size(); i++)
        {
            Cliente cliente = getListaClientes().get(i);

            if (cliente.getCedula().equalsIgnoreCase(cedula))
            {
                String opcion = JOptionPane.showInputDialog(
                        "Que dato desea actualizar?\n" +
                                "1. Nombre\n" +
                                "2. Cedula\n" +
                                "3. Salir\n" +
                                "Seleccione una opcion:");

                switch (opcion)
                {
                    case "1":
                        String nombreNuevo = JOptionPane.showInputDialog
                                ("Ingrese el nuevo nombre:");
                        cliente.setNombre(nombreNuevo);
                        break;
                    case "2":
                        String cedulaNueva = JOptionPane.showInputDialog
                                ("Ingrese la nueva cedula:");
                        cliente.setCedula(cedulaNueva);
                        break;
                    case "3":
                        return;
                    default:
                        JOptionPane.showMessageDialog
                                (null, "Opción no válida");
                        break;
                }
            }
        }
    }


    /**
     * Metodo para eliminar un cliente de la lista
     * @param cedula
     */
    public void eliminarCliente(String cedula)
    {
        int totalLista= getListaClientes().size();
        for(int i =0; i<totalLista; i++)
        {
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula))
            {
                getListaClientes().remove(i);
                break;
            }
        }
    }


    /**
     * Metodo para crear  un empleado
     * @param nombre
     * @param apellido
     * @param cedula
     * @param edad
     * @return
     */
    public boolean crearEmpleado(String nombre,
                              String apellido,
                              String cedula,
                              int edad)
    {
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setCedula(cedula);
        empleado.setEdad(edad);
        getListaEmpleados().add(empleado);
        return true;
    }

    public List<Empleado> obtenerEmpleado()
    {
     return getListaEmpleados();
    }
    public void actualizarEmpleado(String cedula)
    {
        for (int i = 0; i < getListaEmpleados().size(); i++)
        {
            Empleado empleado = getListaEmpleados().get(i);

            if (empleado.getCedula().equalsIgnoreCase(cedula))
            {
                String opcion = JOptionPane.showInputDialog(
                        "Que dato desea actualizar?\n" +
                                "1. Nombre\n" +
                                "2. Apellido\n" +
                                "3. cedula\n" +
                                "4. edad\n" +
                                "5. Salir\n" +
                                "Seleccione una opcion:");

                switch (opcion)
                {
                    case "1":
                        String nombreNuevo = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                        empleado.setNombre(nombreNuevo);
                        break;
                    case "2":
                        String apellidoNuevo = JOptionPane.showInputDialog("Ingrese el nuevo apellido:");
                        empleado.setApellido(apellidoNuevo);
                        break;
                    case "3":
                        String cedulaNueva = JOptionPane.showInputDialog("Ingrese la nueva cedula:");
                        empleado.setCedula(cedulaNueva);
                        break;
                    case "4":
                        int edadNueva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cedula:"));
                        empleado.setEdad(edadNueva);
                        break;
                    case "5":
                        JOptionPane.showMessageDialog
                                (null, "Saliendo del programa.");
                        System.exit(0);
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                        break;
                }
            }
        }

    }
    public void eliminarEmpleado(String cedula)
    {
        int totalLista= getListaEmpleados().size();
        for(int i =0; i<totalLista; i++)
        {
            Empleado empleado = getListaEmpleados().get(i);
            if(empleado.getCedula().equalsIgnoreCase(cedula))
            {
                getListaEmpleados().remove(i);
                break;
            }
        }
    }


    /**
     * Metodo para crear un objeto
     * @param nombre
     * @param codigo
     * @return
     */
    public boolean crearObjeto(String nombre, String codigo)
    {
        Objeto objeto = new Objeto();
        objeto.setNombre(nombre);
        objeto.setCodigo(codigo);
        getListaObjetos().add(objeto);

        return true;

    }

    /**
     * Metodo para obtener la lista de Objetos
     * @return lista
     */
    public List<Objeto> obtenerObjetos()
    {
        return  getListaObjetos();
    }

    /**
     * Metodo para Actualizar un Objeto
     * @param codigo opcion
     */
    public void actualizarObjeto(String codigo)
    {
        for (int i = 0; i < getListaObjetos().size(); i++)
        {
        Objeto objeto = getListaObjetos().get(i);

        if (objeto.getCodigo().equalsIgnoreCase(codigo))
        {
            String opcion = JOptionPane.showInputDialog(
                    "Que dato desea actualizar?\n" +
                            "1. Nombre\n" +
                            "2. codigo\n" +
                            "3. Salir\n" +
                            "Seleccione una opcion:");

            switch (opcion)
            {
                case "1":
                    String nombreNuevo = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                    objeto.setNombre(nombreNuevo);
                    break;
                case "2":
                    String cedulaNueva = JOptionPane.showInputDialog("Ingrese el nuevo codigo:");
                    objeto.setCodigo(cedulaNueva);
                    break;
                case "3":
                    JOptionPane.showMessageDialog
                            (null, "Saliendo del programa.");
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
                }
            }
        }

    }

    /**
     * Metodo para eliminar un objeto
     * @param codObjeto
     */
    public void eliminarObjeto(String codObjeto)
    {
        int totalLista= getListaClientes().size();
        for(int i =0; i<totalLista; i++)
        {
            Objeto objeto = getListaObjetos().get(i);
            if(objeto.getCodigo().equalsIgnoreCase(codObjeto))
            {
                getListaClientes().remove(i);
                break;
            }
        }

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


    @Override
    public String toString()
    {
        return "PrestamosUq: " +"\n"+
                "Nombre: " + nombre ;
    }



}
