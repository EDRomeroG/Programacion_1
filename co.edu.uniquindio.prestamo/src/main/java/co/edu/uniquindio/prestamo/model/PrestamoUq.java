package co.edu.uniquindio.prestamo.model;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq
{
    private String nombre;

    //creacion lista clientes
    List<Cliente>listaClientes = new ArrayList<>();


    public PrestamoUq() {
    }

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
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
    public void actualizarEdad(String cedula, int nuevaEdad)
    {
        int totalLista = getListaClientes().size();
        for(int i=0; i<totalLista;i++)
        {
            Cliente cliente = getListaClientes().get(i);
            if(cliente.getCedula().equalsIgnoreCase(cedula))
            {
                cliente.setEdad(nuevaEdad);
                break;
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

    @Override
    public String toString()
    {
        return "PrestamosUq{" +
                "nombre='" + nombre + '\'' +
                '}';
    }



}
