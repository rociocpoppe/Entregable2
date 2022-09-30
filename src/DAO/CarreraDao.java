package DAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import Interfaces.*;
import entidades.Carrera;
import entidades.Estudiante;
import javassist.bytecode.stackmap.TypedBlock;

public class CarreraDao implements ICarrera{
    
    private EntityManager em;

	public CarreraDao(EntityManager em) {
		this.em = em;
	}

    @Override
    public void matricularEstudiante(Estudiante e) {
              
    }

    @Override
    public Carrera getCarrera() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveCarrera(Carrera c) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteCarrera(Carrera c) {
        // TODO Auto-generated method stub
       
    }

    @Override
    public Carrera findCarrera(int id) {
        Carrera c= new Carrera("x");
        // TODO Auto-generated method stub
        return c;
    }

    @Override
    public void insertCarrera(Carrera c) {
        Query query=em.createQuery("INSERT INTO carrera (idCarrera, nombre) VALUES (?, ?)");
        query.setParameter(1, c.getIdCarrera());
        query.setParameter(2, c.getNombre());
        query.executeUpdate();
    }

    
}