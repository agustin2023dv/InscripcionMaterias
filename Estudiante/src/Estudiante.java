import java.util.ArrayList;

public class Estudiante extends Persona {

	private ArrayList<Materia> materias;

	private ArrayList<Curso> cursos;
	
	public Estudiante(ArrayList<Materia> materias, ArrayList<Curso> cursos, String nombre, int dni) {
		super(nombre, dni);
		this.materias = materias;
		this.cursos = cursos;
	}
	
	public Estudiante(String nombre, int dni) {
		super(nombre, dni);
		setMaterias(new ArrayList<Materia>());
        setCursos(new ArrayList<Curso>());
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public ArrayList<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String toString() {
		return "Estudiante [materias=" + materias + ", cursos=" + cursos + "]";
	}
	
	 public void inscribirMateria (Materia materia) {
		 this.materias.add(materia);
		 System.out.println(materia);
	 }
	 
	 public void inscribirCurso(Curso curso) {
	        this.cursos.add(curso);
	        System.out.println(curso);
	        curso.agregarEstudiante(this);
	    }
	
	


}
