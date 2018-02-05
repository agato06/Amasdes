package com.example.alexgato.amasdesconnect.sampledata.Objects;

/**
 * Created by alexgato on 4/2/18.
 */

public class Eventos {

    public Eventos(Boolean asistencia, Boolean reparto, String comida, String fecha, int unidades) {
        Asistencia = asistencia;
        Reparto = reparto;
        Comida = comida;
        Fecha = fecha;
        Unidades = unidades;
    }

    Boolean Asistencia;
    Boolean Reparto;
    String Comida;
    String Fecha;
    int Unidades;

    public Boolean getAsistencia() {
        return Asistencia;
    }

    public void setAsistencia(Boolean asistencia) {
        Asistencia = asistencia;
    }

    public Boolean getReparto() {
        return Reparto;
    }

    public void setReparto(Boolean reparto) {
        Reparto = reparto;
    }

    public String getComida() {
        return Comida;
    }

    public void setComida(String comida) {
        Comida = comida;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public int getUnidades() {
        return Unidades;
    }

    public void setUnidades(int unidades) {
        Unidades = unidades;
    }




}
