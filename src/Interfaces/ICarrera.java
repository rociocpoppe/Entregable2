package Interfaces;

import entidades.Carrera;
import entidades.Estudiante;

public interface ICarrera{

    public Carrera getCarrera();
    public void insertCarrera(Carrera c);
    public void saveCarrera(Carrera c);
    public void deleteCarrera(Carrera c);
    public void matricularEstudiante(Estudiante e);
    public Carrera findCarrera(int id);

}