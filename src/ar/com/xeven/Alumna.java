package ar.com.xeven;

import java.time.LocalDate;
import java.util.List;

public class Alumna {
    List<Asistencia> asistencias;

    public Alumna(List<Asistencia> asistencias) {
        this.asistencias = asistencias;
    }

    public boolean asistioAClase(LocalDate fecha) {
        for (Asistencia asistencia : asistencias)
            if (asistencia.getFechaClase().equals(fecha))
                return true;
        return false;
    }
    public boolean asistioAClaseEnVivo(LocalDate fecha) {
        for (Asistencia asistencia : asistencias)
            if (asistencia.getFechaClase().equals(fecha) && asistencia.isEnVivo())
                return true;
        return false;
    }
    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

}
