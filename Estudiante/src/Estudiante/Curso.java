package Estudiante;

import java.util.ArrayList;
import java.util.Date;

public class Curso {
	
	private Materia materia;
	private Profesor profesor;
	private ArrayList<Estudiante> estudiantes;
	private Date horario;
	
	public Curso(Materia materia, Profesor profesor, ArrayList<Estudiante> estudiantes, Date horario) {
		super();
		this.materia = materia;
		this.profesor = profesor;
		this.estudiantes = estudiantes;
		this.horario = horario;
	}
	
	public Curso(Materia materia, Profesor profesor, Date horario) {
		super();
		this.materia = materia;
		this.profesor = profesor;
		this.horario = horario;
		setEstudiantes(new ArrayList<Estudiante>());
	}
	
	public Materia getMateria() {
		return materia;
	}
	
	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
	public Date getHorario() {
		return horario;
	}
	
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return "Curso [materia=" + materia + ", profesor=" + profesor + ", estudiantes=" + estudiantes + ", horario="
				+ horario + "]";
	}
	
	public void agregarEstudiante(Estudiante estudiante) {
		this.estudiantes.add(estudiante);
		System.out.println(estudiante);
	}
	
	

}
