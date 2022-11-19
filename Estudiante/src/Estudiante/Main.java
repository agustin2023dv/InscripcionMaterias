package Estudiante;

import java.util.ArrayList;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Estudiante pepe = new Estudiante("Pepe", 2345678);
		Profesor osvaldo = new Profesor ("Osvaldo", 786993);
		Materia progAvanzada = new Materia ("Programacion Avanzada");
		Materia poo = new Materia ("POO");
		Curso act2vb = new Curso(poo, osvaldo, new Date(14,00,00));
		
		poo.agregarCorrelativas(progAvanzada);
		pepe.inscribirMateria(poo);
		pepe.inscribirCurso(act2vb);
		osvaldo.asignarCurso(act2vb);
		

	}

}
