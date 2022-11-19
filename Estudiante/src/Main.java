public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Estudiante pepe = new Estudiante("Pepe", 2345678);
		Profesor osvaldo = new Profesor("Osvaldo", 786993);
		Materia progAvanzada = new Materia("Programacion Avanzada");
		Materia poo = new Materia("POO");


		poo.agregarCorrelativas(progAvanzada);

		poo.getCorrelativas();


		

	}

}
