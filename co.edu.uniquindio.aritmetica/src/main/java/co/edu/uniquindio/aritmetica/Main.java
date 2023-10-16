package co.edu.uniquindio.aritmetica;

import co.edu.uniquindio.aritmetica.model.Aritmetica;

import javax.swing.*;

public class Main

{
    public static void main(String[] args)
    {
        Aritmetica aritmetica= new Aritmetica();

        double suma, resta, multi, div;

        suma= aritmetica.sumar(3,4);
        verificarResultadoSuma(suma);
        resta=aritmetica.restar(5,2);

        multi=aritmetica.multiplicar(2,3);

        div=aritmetica.dividir(8,2);

        JOptionPane.showMessageDialog(null,"el resltado de las operaciones es: "+"\n"
                                        +"suma: "+suma+"\n"+
                                         "Resta: "+resta+"\n"+
                                         "Multiplicacion: "+multi+"\n"+
                                         "Divicion: "+div);

    }

    /**
     * Metodo para verificar si la suma da como resultado 7
     * @param suma
     * @return
     */
    public static boolean verificarResultadoSuma(double suma)
    {
        double resulEsperado=7.0;
        if (resulEsperado==suma)
        {
            System.out.println("el resultado de la suma es el esperado");
            return true;
        }
        System.out.println("el resultado de la suma no es el esperado");
        return  false;
    }
}