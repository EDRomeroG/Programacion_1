package co.edu.uniquindio.aritmetica.model;

import javax.swing.*;

public class Aritmetica
{
    public   double sumar(int a, int b)
    {
        double result;
        result=(a+b);

        return result;
    }
    public   double restar(int a, int b)
    {
        double result;

        result=(a-b);
        return  result;

    }
    public   double multiplicar(int a, int b)
    {
        double result;

        result =(a*b);
        return result;

    }
    public  double dividir(int a, int b)
    {
        double result=0;
        if(b !=0)
        {
            result = (a / b);
            return result;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"el segundo valor tiene que ser diferente de 0");
        }

        return result;

    }


}
