package Estudiante;

import java.util.ArrayList;

public class Materia {
	
	private String nombre;
	private ArrayList<Materia> correlativas;
	private ArrayList<Curso> cursos;
	
	public Materia(String nombre, ArrayList<Materia> correlativas, ArrayList<Curso> cursos) {
		super();
		this.nombre = nombre;
		this.correlativas = correlativas;
		this.cursos = cursos;
	}
	
	public Materia(String nombre) {
		super();
		this.nombre = nombre;
		setCursos(new ArrayList<Curso>());
		setCorrelativas(new ArrayList<Materia>());
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Materia> getCorrelativas() {
		return correlativas;
	}
	
	public void setCorrelativas(ArrayList<Materia> correlativas) {
		this.correlativas = correlativas;
	}
	
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Materia [nombre=" + nombre + ", correlativas=" + correlativas+ ", cursos=" + cursos + "]";
	}
	
	public void agregarCurso(Curso curso) {
		this.cursos.add(curso);
		System.out.println(curso);
	}
	
	public void agregarCorrelativas(Materia correlativa) {
		this.correlativas.add(correlativa);
		System.out.println(correlativa);
	}
	

}
