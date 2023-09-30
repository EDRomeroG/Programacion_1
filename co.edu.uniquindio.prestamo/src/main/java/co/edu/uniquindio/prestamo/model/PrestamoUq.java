package co.edu.uniquindio.prestamo.model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class PrestamoUq
{
    private String nombre;

    //creacion lista clientes
    List<Cliente>listaClientes = new ArrayList<>();
    List<Objeto>listaObjetos = new ArrayList<>();


    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
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
     * @param nuevaEdad
     */
   /* public void actualizarCliente(String cedula)
    {
        //int totalLista = getListaClientes().size();
        for(int i=0; i<getListaClientes().size();i++)
        {
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula))
            {
                String nombreNuevo = JOptionPane.showInputDialog("Ingrese el nombre a actualizar");
                String apellidoNuevo = JOptionPane.showInputDialog("Ingrese el nombre a actualizar");
                String cedulaNuevo = JOptionPane.showInputDialog("Ingrese el nombre a actualizar");
                int edadNuevo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nombre a actualizar"));
                cliente.setEdad(nuevaEdad);
                break;
            }

        }
    }*/


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
     * @param cambio
     */
    public void actualizarObjeto(String cambio)
    {



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


    @Override
    public String toString()
    {
        return "PrestamosUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }



}
