package com.celular.android.tallercelular;

/**
 * Created by android on 26/09/2017.
 */

public class Celular {
    private String marca;
    private String capacidadRam;
    private String color;
    private String SO;
    private int valor;

    public Celular(String marca, String capacidadRam, String color, String SO, int valor) {
        this.marca = marca;
        this.capacidadRam = capacidadRam;
        this.color = color;
        this.SO = SO;
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidadRam() {
        return capacidadRam;
    }

    public void setCapacidadRam(String capacidadRam) {
        this.capacidadRam = capacidadRam;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSO() {
        return SO;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSO(String SO) {
        this.SO = SO;

    }

    public void guardar(){
        Datos.guardar(this);
    }
}
