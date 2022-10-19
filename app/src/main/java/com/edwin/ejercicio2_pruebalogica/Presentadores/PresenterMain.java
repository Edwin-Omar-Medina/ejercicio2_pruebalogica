package com.edwin.ejercicio2_pruebalogica.Presentadores;

import android.content.Context;

import com.edwin.ejercicio2_pruebalogica.Interface.InterfaceMain;
import com.edwin.ejercicio2_pruebalogica.Modelos.ModelMain;

public class PresenterMain implements InterfaceMain.Presenter {
    InterfaceMain.View view;
    InterfaceMain.Model model;
    Context context;
    public PresenterMain(InterfaceMain.View view, Context context) {
        this.view = view;
        this.context=context;
        this.model = new ModelMain(context, this);
    }

    @Override
    public String ordenar(String numeros) {
        return this.model.ordenar(numeros);
    }
}
