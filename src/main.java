import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import DAO.CarreraDao;
import DAO.EstudianteDao;
import Interfaces.ICarrera;
import entidades.Carrera;
import entidades.Estudiante;
import entidades.Estudiante_Carrera;

public class main {
    
    public static void main (String []args){

        EntityManagerFactory emf=Persistence.createEntityManagerFactory("Entregable2");
        EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
        // Estudiante e1 = new Estudiante(12345, "Rocio", "Poppe", 250161);
        // Estudiante e2 = new Estudiante(12346, "Maxiliano", "Santomil", 250162);
        // Estudiante e3 = new Estudiante(12347, "José", "Proz", 250163);
		// em.persist(e1);
        // em.persist(e2);
		// em.persist(e3);
		// EstudianteDao e1=new EstudianteDao();  
        // Estudiante_CarreraDao ec1=new Estudiante_CarreraDao(e1, c1);
        CarreraDao c1=new CarreraDao(em);
        Carrera c=new Carrera("TUDAI");
        c1.insertCarrera(c);
      
		em.getTransaction().commit();
		em.close();
		
		emf.close();
    }
  

}
