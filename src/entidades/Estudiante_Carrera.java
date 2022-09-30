package entidades;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name="EstudianteCarrera")
public class Estudiante_Carrera{

    @Column
    private int estudianteId;

    @Column
    private int carreraId;
    
    @Column
	private Date fechaInscripcion;
	@Column
	private Date fechaGraduacion;
	
	
	public Estudiante_Carrera() {
		
	}

    public Estudiante_Carrera(int estudianteId, int carreraId, Date fechaInscripcion, Date fechaGraduacion) {
        this.estudianteId = estudianteId;
        this.carreraId = carreraId;
        this.fechaInscripcion = fechaInscripcion;
        this.fechaGraduacion = fechaGraduacion;
    }

    public int getEstudianteId() {
        return estudianteId;
    }


    public int getCarreraId() {
        return carreraId;
    }


    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Date getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(Date fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }

    @Override
    public String toString() {
        return "Estudiante_Carrera [carreraId=" + carreraId + ", estudianteId=" + estudianteId + ", fechaGraduacion="
                + fechaGraduacion + ", fechaInscripcion=" + fechaInscripcion + "]";
    }

}