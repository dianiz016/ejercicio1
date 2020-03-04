package principal;

import alumnos.Alumnado;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumnado elAlumno = new Alumnado("Juan", "Perez","A1524", 4 , 4, 7);
		System.out.println(elAlumno.nombre + " " + elAlumno.apellido + " " + elAlumno.notaDeMatematica + " " + elAlumno.notaDeLengua + " " + elAlumno.notaDeProgramacion);
		if (elAlumno.promedio() < 6){
			System.out.println("El alumno no está aprobado");
		} else if (elAlumno.promedio() > 9) {
			System.out.println("Es un alumno destacado");
		}
		if (elAlumno.notaDeMatematica < 6 || elAlumno.notaDeLengua < 6 || elAlumno.notaDeProgramacion < 6) {
			System.out.println("El alumno tiene materias sin aprobar");
		}

		Alumnado elAlumno2 = new Alumnado("Lorena", "Rodriguez","A1525", 10 , 10, 10);
		System.out.println(elAlumno2.nombre + " " + elAlumno2.apellido + " " + elAlumno2.notaDeMatematica + " " + elAlumno2.notaDeLengua + " " + elAlumno2.notaDeProgramacion);
		if (elAlumno2.promedio() < 6){
			System.out.println("El alumno no está aprobado");
		} else if (elAlumno2.promedio() > 9) {
			System.out.println("Es un alumno destacado");
		}
		if (elAlumno2.notaDeMatematica < 6 || elAlumno2.notaDeLengua < 6 || elAlumno2.notaDeProgramacion < 6) {
			System.out.println("El alumno tiene materias sin aprobar");
		}
		
		Alumnado elAlumno3 = new Alumnado("Mario", "Peliado","A1526", 6 , 2, 8);
		System.out.println(elAlumno3.nombre + " " + elAlumno3.apellido + " " + elAlumno3.notaDeMatematica + " " + elAlumno3.notaDeLengua + " " + elAlumno3.notaDeProgramacion);
		if (elAlumno3.promedio() < 6){
			System.out.println("El alumno no está aprobado");
		} else if (elAlumno3.promedio() > 9) {
			System.out.println("Es un alumno destacado");
		}
		if (elAlumno3.notaDeMatematica < 6 || elAlumno3.notaDeLengua < 6 || elAlumno3.notaDeProgramacion < 6) {
			System.out.println("El alumno tiene materias sin aprobar");
		}
		
		Alumnado elAlumno4 = new Alumnado("Maria", "Capazt","A1527", 8 , 9, 5);
		System.out.println(elAlumno4.nombre + " " + elAlumno4.apellido + " " + elAlumno4.notaDeMatematica + " " + elAlumno4.notaDeLengua + " " + elAlumno4.notaDeProgramacion);
		if (elAlumno4.promedio() < 6){
			System.out.println("El alumno no está aprobado");
		} else if (elAlumno4.promedio() > 9) {
			System.out.println("Es un alumno destacado");
		}
		if (elAlumno4.notaDeMatematica < 6 || elAlumno4.notaDeLengua < 6 || elAlumno4.notaDeProgramacion < 6) {
			System.out.println("El alumno tiene materias sin aprobar");	
		}
		
		Alumnado elAlumno5 = new Alumnado("Leandro", "Juanez","A1528", 10 , 2, 3);
		System.out.println(elAlumno5.nombre + " " + elAlumno5.apellido + " " + elAlumno5.notaDeMatematica + " " + elAlumno5.notaDeLengua + " " + elAlumno5.notaDeProgramacion);
		if (elAlumno5.promedio() < 6){
			System.out.println("El alumno no está aprobado");
		} else if (elAlumno5.promedio() > 9) {
			System.out.println("Es un alumno destacado");
		}
		if (elAlumno5.notaDeMatematica < 6 || elAlumno5.notaDeLengua < 6 || elAlumno5.notaDeProgramacion < 6) {
			System.out.println("El alumno tiene materias sin aprobar");	
		}
	}

}
