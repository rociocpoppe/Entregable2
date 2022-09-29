package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="Carrera")
public class Carrera {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCarrera;

    @Column
    private String nombre;

    //se puede agregar cant inscriptos

    @OneToMany (fetch= FetchType.LAZY, mappedBy = "carrera")
    private Set<Estudiante_Carrera> estudiantes;

    public Carrera(String nombre) {
        this.nombre = nombre;
    }


    public int getIdCarrera() {
        return idCarrera;
    }

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // public ArrayList<Estudiante_Carrera> getEstudiantes() {
    //      return new ArrayList<Estudiante_Carrera>(estudiantes);
    // }

    //  public void addEstudiante(Estudiante estudiante) {
    //     Estudiante_Carrera e= new Estudiante_Carrera(estudiante, this);
    //     this.estudiantes.add(e);
    //     estudiante.addCarrera(e);
    // }


    
    
    
}
