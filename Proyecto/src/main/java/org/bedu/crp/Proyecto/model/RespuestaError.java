package org.bedu.crp.Proyecto.model;

import java.time.LocalDateTime;
import java.util.Map;

public class RespuestaError {
    private final LocalDateTime timestamp = LocalDateTime.now();
    private int estatus;
    private Map<String, String> errores;
    private String ruta;

    public int getEstatus() {
        return estatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }

    public Map<String, String> getErrores() {
        return errores;
    }

    public void setErrores(Map<String, String> errores) {
        this.errores = errores;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public static RespuestaErrorBuilder builder() {
        return new RespuestaErrorBuilder();
    }
}
