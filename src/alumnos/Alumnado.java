package alumnos;

public class Alumnado {
	public String nombre;
	public String apellido;
	public String legajo;
	public int notaDeMatematica;
	public int notaDeLengua;
	public int notaDeProgramacion;

	public Alumnado(String nombre, String apellido, String legajo, int notaDeMatematica, int notaDeLengua,
			int notaDeProgramacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
		this.notaDeMatematica = notaDeMatematica;
		this.notaDeLengua = notaDeLengua;
		this.notaDeProgramacion = notaDeProgramacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public int getNotaDeMatematica() {
		return notaDeMatematica;
	}

	public void setNotaDeMatematica(int notaDeMatematica) {
		this.notaDeMatematica = notaDeMatematica;
	}

	public int getNotaDeLengua() {
		return notaDeLengua;
	}

	public void setNotaDeLengua(int notaDeLengua) {
		this.notaDeLengua = notaDeLengua;
	}

	public int getNotaDeProgramacion() {
		return notaDeProgramacion;
	}

	public void setNotaDeProgramacion(int notaDeProgramacion) {
		this.notaDeProgramacion = notaDeProgramacion;
	}

	public int promedio(){
	return (notaDeMatematica + notaDeLengua + notaDeProgramacion) / 3; 
}
	}
