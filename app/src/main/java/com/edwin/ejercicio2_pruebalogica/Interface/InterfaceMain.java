package com.edwin.ejercicio2_pruebalogica.Interface;

public interface InterfaceMain {

    interface View{
        void finElement();
    }

    interface Presenter{
        String ordenar(String numeros);
    }

    interface Model{
        String ordenar(String numeros);
    }
}
