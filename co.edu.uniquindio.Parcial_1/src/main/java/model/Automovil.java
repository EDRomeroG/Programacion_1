package model;

public class Automovil
{
    private String modelo;
    private String tipoCarroceria;
    private String tipoMotor;
    private int Capacidad;
    private double precioBase;
    private String adicionales;

    public Automovil(String modelo, String tipoCarroceria, String tipoMotor, int capacidad, double precioBase, String adicionales)
    {
        this.modelo = modelo;
        this.tipoCarroceria = tipoCarroceria;
        this.tipoMotor = tipoMotor;
        Capacidad = capacidad;
        this.precioBase = precioBase;
        this.adicionales = adicionales;
    }

    public Automovil() {

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(String adicionales) {
        this.adicionales = adicionales;
    }
}
