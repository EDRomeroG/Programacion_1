package ejercicio2;

import model.Empleado;
import model.Automovil;

public class MainEjercicio2
{
    public static void main(String[] args)
    {







    }
    public static Empleado inicializarDatos()
    {
        Empleado empleado=new Empleado();
        Empleado empleado1 = crearEmpleado("Daniel","Romero", 1234, "ensamble","supervisor",2000000 );
        Empleado empleado2 = crearEmpleado("Maria","Galindez", 1122, "pintura","pintor",1600000 );
        Empleado empleado3 = crearEmpleado("Carlos","Lopez", 2233, "Taller","Mecanico",1800000 );
        Empleado empleado4 = crearEmpleado("Alex","Bustamante", 3344, "Taller","supervisor",2000000 );



        return empleado;
    }
    public static void AutomovilInicializar()
    {


        Automovil automovil1=new Automovil
                ("sandero",
                        "familiar",
                        "Gasolina",
                        5,
                        60000000,
                        "camara-polarizado");


    }
    private static Empleado crearEmpleado(String nombre, String apellido, int id, String departamento, String posicion, double salario){
        Empleado empleado = new Empleado();
        empleado.setNombre(nombre);
        empleado.setApellido(apellido);
        empleado.setId(id);
        empleado.setDepartamento(departamento);
        empleado.setPosicion(posicion);
        empleado.setSalario(salario);


        return empleado;
    }
    private static Automovil Automovil(String modelo, String tipoCarroceria, String tipoMotor, int capacidad, double precioBase, String adicionales){
        Automovil automovil= new Automovil();
        automovil.setModelo(modelo);
        automovil.setTipoCarroceria(tipoCarroceria);
        automovil.setTipoMotor(tipoMotor);
        automovil.setCapacidad(capacidad);
        automovil.setPrecioBase(precioBase);
        automovil.setAdicionales(adicionales);


        return automovil;
    }



}
