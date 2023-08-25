package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Libro;

public class Main
{
    public static void main(String[] args)
    {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();
        Libro libro3 = new Libro();
        Libro libro4 = new Libro();
        Libro libro5 = new Libro();
        Libro libro6 = new Libro();
        Libro aux = new Libro();
        //llamado a metodo para crear cada libro
        crearLibro(libro1,libro2,libro3,libro4,libro5,libro6);
        System.out.println("----------------------");
        //metodo para ver los generos del libro
        verGenero(libro1,libro2,libro3,libro4,libro5);
        System.out.println("----------------------");
        //saber cuantos libros empiezan con vocal o consonante
        obtenerCantidadVocalesConsonantes(libro1,libro2,libro3,libro4,libro5);
        System.out.println("----------------------");
        //saber que libro tiene la menor cantidad de paginas
        aux=obtenerLibroConMenosPaginas(libro1, libro2,libro3,libro4,libro5);
        System.out.println("El libro con nmenor cantidad de paginas es: "+aux.getTitulo());
        System.out.println("----------------------");
        //metodo para ver el nombre y la letra con la cual empieza el libro seleccionado
        verinicial(libro3);
        System.out.println("----------------------");
        //metodo para cambiar el titulo de un libro en especifico
        System.out.println("Cambiamos el titulo del libro: "+ libro6.getTitulo());
        aux= cambiarNombre(libro6);
        System.out.println("Titulo nuevo: " + aux.getTitulo());
    }

    //Metodo pedido en clase para cambiar un Titulo especifico
    public static Libro cambiarNombre(Libro libro6)
    {
        String nombreAnterior="Calculo integral";
        String nombreNuevo ="Calculo Integral y Diferencial";
        Libro libroPrueba= libro6;
        if(libroPrueba.getTitulo().equalsIgnoreCase(nombreAnterior))
        {
            libroPrueba.setTitulo(nombreNuevo);

        }
        else
        {
            System.out.println("el libro ingresdo no tiene el titulo de: "+nombreAnterior);

        }
        return libroPrueba;

    }

    //metodo pedido en clase de contar vocales y consonantes
    public static void obtenerCantidadVocalesConsonantes(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5)
    {
        int contadorVocales= 0;
        int contadorConsonantes = 0;
        char inicial=Character.toLowerCase( libro1.getTitulo().charAt(0));
        if(inicial== 'a' || inicial=='e' ||inicial=='i'
                ||inicial=='o'||inicial=='u')
        {
            contadorVocales++;
        }
        else
        {
            contadorConsonantes++;
        }
        inicial=Character.toLowerCase( libro2.getTitulo().charAt(0));
        if(inicial== 'a' || inicial=='e' ||inicial=='i'
                ||inicial=='o'||inicial=='u')
        {
            contadorVocales++;
        }
        else
        {
            contadorConsonantes++;
        }
        inicial=Character.toLowerCase( libro3.getTitulo().charAt(0));
        if(inicial== 'a' || inicial=='e' ||inicial=='i'
                ||inicial=='o'||inicial=='u')
        {
            contadorVocales++;
        }
        else
        {
            contadorConsonantes++;
        }
        inicial=Character.toLowerCase( libro4.getTitulo().charAt(0));
        if(inicial== 'a' || inicial=='e' ||inicial=='i'
                ||inicial=='o'||inicial=='u')
        {
            contadorVocales++;
        }
        else
        {
            contadorConsonantes++;
        }
        inicial=Character.toLowerCase( libro5.getTitulo().charAt(0));
        if(inicial== 'a' || inicial=='e' ||inicial=='i'
                ||inicial=='o'||inicial=='u')
        {
            contadorVocales++;
        }
        else
        {
            contadorConsonantes++;
        }
        System.out.println("Los libros que empiezan por vocal son: "+contadorVocales);
        System.out.println("-----------------");
        System.out.println("Los libros que empiezan por consonate son: "+contadorConsonantes);
    }

    public static void crearLibro (Libro libro1, Libro libro2, Libro libro3, Libro libro4,Libro libro5, Libro libro6)
    {

        //datos para el primer libro
        libro1.setAutor("Paulo Coelho");
        libro1.setTitulo("El Alquimista");
        libro1.setGenero("Novela");
        libro1.setNumPaginas(172);
        libro1.setFechaPublicacion(2012);

        //datos del segundo libro
        libro2.setAutor("Paulo Coelho");
        libro2.setTitulo("Once Minutos");
        libro2.setGenero("Novela");
        libro2.setNumPaginas(264);
        libro2.setFechaPublicacion(2003);

        // datos del tercer libro
        libro3.setAutor("Gabriel Garcia Marquez");
        libro3.setTitulo("Cien años de soledad");
        libro3.setGenero("Novela");
        libro3.setNumPaginas(173);
        libro3.setFechaPublicacion(2012);

        //Datos del cuarto libro
        libro4.setAutor("Gabriel Garcia Marquez");
        libro4.setTitulo("Cronicas de una muerte anunciada");
        libro4.setGenero("Novela");
        libro4.setNumPaginas(128);
        libro4.setFechaPublicacion(2015);

        //Datos del quinto libro
        libro5.setAutor("Jorge luis Borges");
        libro5.setTitulo("poesia Completa");
        libro5.setGenero("poesia");
        libro5.setNumPaginas(656);
        libro5.setFechaPublicacion(2013);

        //Datos del sexto libro
        libro6.setAutor("");
        libro6.setTitulo("Calculo integral");
        libro6.setGenero("");
        libro6.setNumPaginas(0);


    }
    public static Libro obtenerLibroConMenosPaginas(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5)
    {
        Libro libroConMenosPaginas = libro1;

        if (libro2.getNumPaginas()< libroConMenosPaginas.getNumPaginas())
        {
            libroConMenosPaginas = libro2;
        }
        if (libro3.getNumPaginas() < libroConMenosPaginas.getNumPaginas())
        {
            libroConMenosPaginas = libro3;
        }
        if (libro4.getNumPaginas() < libroConMenosPaginas.getNumPaginas())
        {
            libroConMenosPaginas = libro4;
        }
        if (libro5.getNumPaginas() < libroConMenosPaginas.getNumPaginas())
        {
            libroConMenosPaginas = libro5;
        }

        return libroConMenosPaginas;

    }

    // metodo para ver la incial del titulo del libro
    public static void verinicial(Libro libro)
    {
        char inicial= libro.getTitulo().charAt(0);

        if(inicial== 'A' || inicial=='E' ||inicial=='I'
                ||inicial=='O'||inicial=='U')
        {
            System.out.println("El libro: "+ libro.getTitulo() +" empieza por vocal");
        }
        else
        {
         System.out.println("El libro: "+ libro.getTitulo() +" empieza por consonante ");
        }


    }

    //metodo para comparar y ver cantidad entre 2 generos
    public static void verGenero(Libro libro1, Libro libro2, Libro libro3, Libro libro4, Libro libro5)
    {
        int novela = 0;
        int poesia = 0;

        if(libro1.getGenero().equalsIgnoreCase("novela"))
        {
            novela++;

        }
        if (libro1.getGenero().equalsIgnoreCase("poesia"))
        {
            poesia++;
        }

        if (libro2.getGenero().equalsIgnoreCase("novela"))
        {
            novela++;

        }
        if (libro2.getGenero().equalsIgnoreCase("poesia"))
        {
            poesia++;
        }

        if(libro3.getGenero().equalsIgnoreCase("novela"))
        {
            novela++;

        }
        if(libro3.getGenero().equalsIgnoreCase("poesia"))
        {
            poesia++;
        }
        if(libro4.getGenero().equalsIgnoreCase("novela"))
        {
            novela++;

        }
        if (libro4.getGenero().equalsIgnoreCase("poesia"))
        {
            poesia++;
        }

        if(libro5.getGenero().equalsIgnoreCase("novela"))
        {
            novela++;
        }
        if (libro5.getGenero().equalsIgnoreCase("poesia"))
        {
            poesia++;
        }

        System.out.println("la cantidad de genero novela es: "+ novela + " y la cantidad de genero poesia es: "+ poesia);
    }
}
