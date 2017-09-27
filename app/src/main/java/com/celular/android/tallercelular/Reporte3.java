package com.celular.android.tallercelular;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte3 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte3);
        tabla=(TableLayout) findViewById(R.id.tabla);
        celular = Datos.obtener();
        int price=celular.get(0).getValor();;
        int pos=0;
        for (int i = 0; i < celular.size() ; i++) {

            if (price > celular.get(i).getValor()) {
                price = celular.get(i).getValor();
                pos=i;
            }
        }
        if(price!=0.0){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            TextView c6 = new TextView(this);
            c1.setText("" + (pos + 1));
            c2.setText(celular.get(pos).getMarca());
            c3.setText(celular.get(pos).getCapacidadRam());
            c4.setText(celular.get(pos).getColor());
            c5.setText(celular.get(pos).getSO());
            c6.setText(""+celular.get(pos).getValor());
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
