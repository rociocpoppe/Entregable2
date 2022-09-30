package DAO;

import java.util.ArrayList;

import Interfaces.IEstudiante_Carrera;
import entidades.Carrera;
import entidades.Estudiante;

public class Estudiante_CarreraDao implements IEstudiante_Carrera{

    @Override
    public ArrayList<Carrera> getCarrerasByInscriptos(Carrera c) {
        return null;
    }

    @Override
    public ArrayList<Estudiante> getEstudiantesByCarrera(Carrera c, String ciudad) {
        return null;
    }
    
}