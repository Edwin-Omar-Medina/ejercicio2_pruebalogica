package com.edwin.ejercicio2_pruebalogica.Modelos;

import android.content.Context;

import com.edwin.ejercicio2_pruebalogica.Interface.InterfaceMain;
import com.edwin.ejercicio2_pruebalogica.Presentadores.PresenterMain;

public class ModelMain implements InterfaceMain.Model {
    InterfaceMain.Presenter presenter;

    Context context;
    public ModelMain(Context context, InterfaceMain.Presenter presenter) {
        this.context = context;
        this.presenter = presenter;
    }

    @Override
    public String ordenar(String numeros) {
        String numerosordenados = "";
        String auxiliar;

        String []partes=numeros.split(" ");

        for (int i = 0; i < partes.length; i++) {
            for (int j = i + 1; j < partes.length; j++) {

                if (Integer.parseInt(partes[i]) < Integer.parseInt(partes[j])) {
                    auxiliar = partes[i];
                    partes[i] = partes[j];
                    partes[j] = auxiliar;
                }
            }
        }

        for (int i=0; i<partes.length; i++) {
            if(i==0){
                numerosordenados = numerosordenados+partes[i];
            }else{
                numerosordenados = numerosordenados + " " +"-"+" "+ partes[i];
            }
            numerosordenados = numerosordenados;
        }

        return numerosordenados;
    }
}
