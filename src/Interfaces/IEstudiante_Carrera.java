package Interfaces;

import java.util.ArrayList;

import clases.Carrera;
import clases.Estudiante;

public interface IEstudiante_Carrera {


    //ordenado por cantidad de inscriptos
    public ArrayList<Carrera> getCarrerasByInscriptos (Carrera c);

    //recuperar estudiantes de una determinada carrera, filtrado por ciudad de residencia
    public ArrayList<Estudiante> getEstudiantesByCarrera (Carrera c, String ciudad);
}