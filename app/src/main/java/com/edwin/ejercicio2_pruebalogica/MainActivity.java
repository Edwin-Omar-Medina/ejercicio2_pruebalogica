package com.edwin.ejercicio2_pruebalogica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.edwin.ejercicio2_pruebalogica.Interface.InterfaceMain;
import com.edwin.ejercicio2_pruebalogica.Presentadores.PresenterMain;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, InterfaceMain.View{

    EditText txtIngreso;
    TextView viewsalida;
    Button btnimprimir;
    InterfaceMain.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.finElement();
        presenter = new PresenterMain(this,MainActivity.this);

    }

    @Override
    public void onClick(View view) {

        String numeros_ordenados;
        String numeros=txtIngreso.getText().toString();
        if(!numeros.equals("")){
            numeros_ordenados=presenter.ordenar(numeros);
            viewsalida.setText(numeros_ordenados);
        }

    }

    @Override
    public void finElement() {
        txtIngreso=findViewById(R.id.txtIngreso);
        viewsalida=findViewById(R.id.viewsalida);
        btnimprimir=findViewById(R.id.btnimprimir);
        btnimprimir.setOnClickListener(this);
    }
}