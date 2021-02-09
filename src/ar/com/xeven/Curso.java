package ar.com.xeven;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    List<Alumna> alumnas;
    Profesor profesor;

    public Curso(List<Alumna> alumnas, Profesor profesor) {
        this.alumnas = alumnas;
        this.profesor = profesor;
    }

    public List<Alumna> listarAsistentesEnVivoALaClase(LocalDate fecha){
        List<Alumna> asistentes = new ArrayList<>();
        for(Alumna alumna : alumnas)
            if(alumna.asistioAClaseEnVivo(fecha))
                asistentes.add(alumna);
        return asistentes;
    }

    public List<Alumna> listarAsistentesALaClase(LocalDate fecha){
        List<Alumna> asistentes = new ArrayList<>();
        for(Alumna alumna : alumnas)
            if(alumna.asistioAClase(fecha))
                asistentes.add(alumna);
        return asistentes;
    }

    public List<Alumna> getAlumnas() {
        return alumnas;
    }

    public void setAlumnas(List<Alumna> alumnas) {
        this.alumnas = alumnas;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
