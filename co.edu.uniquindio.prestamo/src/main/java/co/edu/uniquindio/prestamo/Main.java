package co.edu.uniquindio.prestamo;

import co.edu.uniquindio.prestamo.model.PrestamoUq;
import co.edu.uniquindio.prestamo.utilidades.Utilidad;


public class Main
{
    /**
     * Metodo Main Principal
     *
     * Projecto prestamo
     * @param args
     */
    public static void main(String[] args)
    {
        PrestamoUq prestamoUq = inicializarPrestamo();
        Utilidad.mostarMenuPrincipal(prestamoUq);
    }


    /**
     * Metodo para inicializar el prestamo
     * @return
     */
    private static PrestamoUq inicializarPrestamo()
    {
        PrestamoUq prestamoUq = new PrestamoUq();
        prestamoUq.setNombre("Prestamos Rapidos");


        return prestamoUq;
    }
}