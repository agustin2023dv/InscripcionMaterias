import java.util.ArrayList;

public class Profesor extends Persona {
	
	private ArrayList<Curso> cursos;

	public Profesor(String nombre, int dni, ArrayList<Curso> cursos) {
		super(nombre, dni);
		this.cursos = cursos;
	}
	
	public Profesor(String nombre, int dni) {
		super(nombre, dni);
		setCursos(new ArrayList<Curso>());
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Profesor [cursos=" + cursos + "]";
	}
	
	public void asignarCurso(Curso curso) {
		this.cursos.add(curso);
		System.out.println(curso);
	}
	
	
	
	

}
