package com.upchiapas.evaluacionc1;

import com.upchiapas.evaluacionc1.models.EvaluacionC1;

public class Main {
    public static void main(String[] args)
    {
        EvaluacionC1 ordernamiento = new EvaluacionC1("AB*L+E/RT-KO");
        System.out.println(ordernamiento.orden());
    }
}