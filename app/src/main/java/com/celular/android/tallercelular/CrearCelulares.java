package com.celular.android.tallercelular;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class CrearCelulares extends AppCompatActivity {

    private Resources resources;
    private EditText valor;
    private Spinner marca;
    private Spinner capacidadRam;
    private Spinner color;
    private Spinner SO;
    private String brand[];
    private String capacityRam[];
    private String colors[];
    private String SystemO[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celulares);

        valor = (EditText)findViewById(R.id.txtValor);
        marca = (Spinner)findViewById(R.id.spMarca);
        capacidadRam = (Spinner)findViewById(R.id.spCapacidadRam);
        color = (Spinner)findViewById(R.id.spColor);
        SO = (Spinner)findViewById(R.id.spSO);
        resources = this.getResources();

        brand = resources.getStringArray(R.array.spiMarca);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,brand);
        marca.setAdapter(adapter);

        capacityRam = resources.getStringArray(R.array.spiCapacityRam);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,capacityRam);
        capacidadRam.setAdapter(adapter1);

        colors = resources.getStringArray(R.array.spiColor);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,colors);
        color.setAdapter(adapter2);

        SystemO = resources.getStringArray(R.array.spiSO);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,SystemO);
        SO.setAdapter(adapter3);

    }

    public boolean validar(){
        if(valor.getText().toString().isEmpty() || valor.getText().toString().equals("0")){
            valor.setError(resources.getString(R.string.mensaje_error_uno));
            return false;
        }

        return true;
    }

    public void guardar(View view){
        String marc,cap,col,so;
        int val;
        marc = marca.getSelectedItem().toString();
        cap = capacidadRam.getSelectedItem().toString();
        col = color.getSelectedItem().toString();
        so = SO.getSelectedItem().toString();
        val = Integer.parseInt(valor.getText().toString());

        Celular c = new Celular(marc,cap,col,so,val);
        c.guardar();
        Toast.makeText(this, "Celular guardado Exitosamente", Toast. LENGTH_SHORT).show();

    }
}
