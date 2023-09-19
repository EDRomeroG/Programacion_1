package model;

public class Producto
{
    private String cod;
    private String nombrePro;
    private int cant;

    private double precio;
    private  Producto producto1;
    private  Producto producto2;
    private  Producto producto3;
    private  Producto producto4;

    public Producto(String cod, String nombrePro, int cant, double precio)
    {
        this.cod = cod;
        this.nombrePro = nombrePro;
        this.cant = cant;
        this.precio = precio;
    }

    public Producto() {

    }

    public Producto getProducto1() {
        return producto1;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
    }

    public Producto getProducto3() {
        return producto3;
    }

    public void setProducto3(Producto producto3) {
        this.producto3 = producto3;
    }

    public Producto getProducto4() {
        return producto4;
    }

    public void setProducto4(Producto producto4) {
        this.producto4 = producto4;
    }

    public String getCod()
    {
        return cod;
    }

    public void setCod(String cod)
    {
        this.cod = cod;
    }

    public String getNombrePro()
    {
        return nombrePro;
    }

    public void setNombrePro(String nombrePro)
    {
        this.nombrePro = nombrePro;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //Metodo para validar solo numeros en un string
    public static boolean esString(String input)
    {

        return input.matches("[0-9]+");
    }

   //Metodo para cambiar el precio de un producto
    public void cambiarPrecio(double nuevoPrecio,Producto producto)
    {
        if (esString(producto.getCod()))
        {
            if (producto.getCod().equals("0001"))
            {
                producto1.setPrecio(nuevoPrecio);
            }
            else if (producto.getCod().equals("0002"))
            {
                producto2.setPrecio(nuevoPrecio);
            }
            else if (producto.getCod().equals("0003"))
            {
                producto3.setPrecio(nuevoPrecio);
            }
            else if (producto.getCod().equals("0004"))
            {
                producto4.setPrecio(nuevoPrecio);
            }
            else
            {
                System.out.println("Producto no valido");
            }
        }
    }
    //Metodo para inicializar los datos del producto
    public  Factura inicializarProductos()
    {
         producto1 = new Producto("0001", "puntilla", 12, 12000);
         producto2 = new Producto("0002", "amarras", 12, 3500);
         producto3 = new Producto("0003","Martillo",1, 28200);
         producto4 = new Producto("0004","Metro",4,12000);

        Factura factura=new Factura();
        factura.setProducto1(producto1);
        factura.setProducto2(producto2);
        factura.setProducto3(producto3);
        factura.setProducto4(producto4);

        return factura;

    }
}
