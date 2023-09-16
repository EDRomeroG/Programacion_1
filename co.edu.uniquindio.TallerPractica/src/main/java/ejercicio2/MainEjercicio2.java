package ejercicio2;

import model.*;

public class MainEjercicio2 {
    public static void main(String[] args) {
        //se hace el incio de las atracciones
        Atraccion atraccion = inicializarDatosAtraccion();


    }

    public static Atraccion inicializarDatosAtraccion() {
        Atraccion atraccion = new Atraccion();
        Atraccion atraccion1 = crearAtraccion("Rapidos", "8:00am - 5:00pm", "viaje en bote por corrientes rapidas",
                15, "medio", 110);

        Atraccion atraccion2 = crearAtraccion("Rueda", "8:00am - 7:00pm", "maquinaria para ver el parque desde otra perspectiva",
                10, "bajo", 100);

        Atraccion atraccion3 = crearAtraccion("Karts", "9:00am - 5:00pm", "Una aventura rapida sobrer ruedas",
                15, "medio", 110);

        Atraccion atraccion4 = crearAtraccion("Karts kids", "9:00am - 5:00pm", "Aventura sobre suedas para los niños",
                8, "bajo", 70);

        Atraccion atraccion5 = crearAtraccion("rapidos", "8:00am - 5:00pm", "viaje en bote por corrientes rapidas",
                15, "medio", 110);
        Atraccion atraccion6 = crearAtraccion("rapidos", "8:00am - 5:00pm", "viaje en bote por corrientes rapidas",
                15, "medio", 110);
        Atraccion atraccion7 = crearAtraccion("rapidos", "8:00am - 5:00pm", "viaje en bote por corrientes rapidas",
                15, "medio", 110);
        Atraccion atraccion8 = crearAtraccion("rapidos", "8:00am - 5:00pm", "viaje en bote por corrientes rapidas",
                15, "medio", 110);
        Atraccion atraccion9 = crearAtraccion("rapidos", "8:00am - 5:00pm", "viaje en bote por corrientes rapidas",
                15, "medio", 110);
        Atraccion atraccion10 = crearAtraccion("rapidos", "8:00am - 5:00pm", "viaje en bote por corrientes rapidas",
                15, "medio", 110);
        atraccion.setAtraccion1(atraccion1);
        atraccion.setAtraccion2(atraccion2);
        atraccion.setAtraccion3(atraccion3);
        atraccion.setAtraccion4(atraccion4);
        atraccion.setAtraccion5(atraccion5);
        atraccion.setAtraccion6(atraccion6);
        atraccion.setAtraccion7(atraccion7);
        atraccion.setAtraccion8(atraccion8);
        atraccion.setAtraccion9(atraccion9);
        atraccion.setAtraccion10(atraccion10);

        return atraccion;
    }

    private static Atraccion crearAtraccion(String nombre, String horario, String descripcion, int rangoEdad, String nivelPeligro, int pesoMax) {
        Atraccion atraccion = new Atraccion();
        atraccion.setNombre(nombre);
        atraccion.setHorario(horario);
        atraccion.setDescripcion(descripcion);
        atraccion.setRangoEdad(rangoEdad);
        atraccion.setNivelPeligro(nivelPeligro);
        atraccion.setPesoMaximo(pesoMax);
        return atraccion;
    }

    public static Visitante inicializarDatosVisitante()
    {
        Visitante visitante= new Visitante();

        Visitante visitante1 = crearVisitante();
        Visitante visitante2 = crearVisitante();
        Visitante visitante3 = crearVisitante();
        Visitante visitante4 = crearVisitante();
        Visitante visitante5 = crearVisitante();
        Visitante visitante6 = crearVisitante();
        Visitante visitante7 = crearVisitante();
        Visitante visitante8 = crearVisitante();
        Visitante visitante9 = crearVisitante();
        Visitante visitante10 = crearVisitante();

        visitante.setVisitante1(visitante1);
        visitante.setVisitante2(visitante2);
        visitante.setVisitante3(visitante3);
        visitante.setVisitante4(visitante4);
        visitante.setVisitante5(visitante5);
        visitante.setVisitante6(visitante6);
        visitante.setVisitante7(visitante7);
        visitante.setVisitante8(visitante8);
        visitante.setVisitante9(visitante9);
        visitante.setVisitante10(visitante10);



        return visitante;
    }


    private static Visitante crearVisitante(String nombre, String apellido, int edad, String id, String sexo, int peso) {
        Visitante visitante = new Visitante();
        visitante.setNombre(nombre);
        visitante.setApellido(apellido);
        visitante.setEdad(edad);
        visitante.setId(id);
        visitante.setSexo(sexo);
        visitante.setPeso(peso);

        return visitante;


    }
}