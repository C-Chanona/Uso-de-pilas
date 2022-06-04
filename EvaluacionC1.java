package com.upchiapas.evaluacionc1.models;

import java.util.Stack;

public class EvaluacionC1
{
   private String separacion;

    public EvaluacionC1(String cadena) {
        this.separacion= cadena;
    }
public  String orden()
{
    String Simbolos = "";
    String Letras = "";

    for(int i=0; i<separacion.length();i++){

        Stack <Character> pila =new Stack <Character> ();
        pila.push(separacion.charAt(i)); //guarda en la pila el caracter que se encuentre en la posicion i
        while(!pila.isEmpty())
        {
            char caracter = separacion.charAt(i);
            if(caracter == '+' || caracter == '*' || caracter == '/' || caracter == '-')
            {
                Simbolos += pila.pop();
            }
            else {
                Letras += pila.pop();
            }
        }

    }
    String cadenaFinal = Simbolos + Letras;

    return cadenaFinal;
}

}


