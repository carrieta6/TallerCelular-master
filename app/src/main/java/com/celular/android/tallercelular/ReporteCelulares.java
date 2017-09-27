package com.celular.android.tallercelular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class ReporteCelulares extends AppCompatActivity {

    private TableLayout tabla;
    private ArrayList<Celular> celular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte_celulares);
        tabla = (TableLayout)findViewById(R.id.Tabla1);
        celular = Datos.obtener();

        for (int i = 0; i < celular.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);

            c1.setText(""+(i+1));
            c2.setText(celular.get(i).getMarca());
            c3.setText(celular.get(i).getCapacidadRam());
            c4.setText(celular.get(i).getColor());
            c5.setText(celular.get(i).getSO());
            c6.setText(""+celular.get(i).getValor());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);
            fila.addView(c6);

            tabla.addView(fila);

        }


    }
}
