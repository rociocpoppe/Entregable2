package Interfaces;

import java.util.ArrayList;

import entidades.Estudiante;

public interface IEstudiante{

    public void insertarEstudiante();

    //el get se podria hacer en uno solo
    public ArrayList<Estudiante> getEstudiantesByCriterio(String dato);
    public Estudiante getEstudianteByLU(String lu);
    public ArrayList<Estudiante> getEstudiantesByGenero(String dato);
}