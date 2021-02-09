package ar.com.xeven;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Asistencia {
    private LocalDateTime fechaAsistencia;
    private LocalDate fechaClase;
    private boolean enVivo;

    public Asistencia(LocalDateTime fechaAsistencia, LocalDate fechaClase, boolean enVivo) {
        this.fechaAsistencia = fechaAsistencia;
        this.fechaClase = fechaClase;
        this.enVivo = enVivo;
    }

    public LocalDateTime getFechaAsistencia() {
        return fechaAsistencia;
    }

    public LocalDate getFechaClase() {
        return fechaClase;
    }

    public boolean isEnVivo() {
        return enVivo;
    }
}
