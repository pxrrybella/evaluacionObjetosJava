// ISABELLA PARRY - COHORTE 4 (HAMILTON) - GENERATION
package com.evaluacionjavaobjetos.evaluacionjavaobjetos;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.evaluacionjavaobjetos.evaluacionjavaobjetos.models.Alumno;
import com.evaluacionjavaobjetos.evaluacionjavaobjetos.models.Curso;
import com.evaluacionjavaobjetos.evaluacionjavaobjetos.models.Materia;
import com.evaluacionjavaobjetos.evaluacionjavaobjetos.models.Nota;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

@SpringBootApplication
public class EvaluacionjavaobjetosApplication {

	public static void ingresarNotas(){
		//Se debe crear una función que permita al profesor ingresar notas por estudiante y que luego permita obtener el promedio de cada estudiante.
		Scanner teclado = new Scanner(System.in);
		HashMap<String, Double> notasAlumnos = new HashMap<String, Double>();
		HashMap<String, Double> promedioAlumnos = new HashMap<String, Double>();
		String resp = "s";
		System.out.println("\nPor favor, ingrese la materia a la cual pertenecen las notas:");
		String nombreMateria = teclado.nextLine();
		System.out.println("Ingrese el curso los alumnos:");
		Materia materiaAux = new Materia(nombreMateria, null);
		String cursoAlumno = teclado.nextLine();
		Curso cursoAux = new Curso(cursoAlumno, null, null);
		System.out.println("Ingrese la cantidad de notas por alumno a registrar:");
		Integer cantNotas = teclado.nextInt();

		do {
			teclado.nextLine();
			System.out.println("Ingrese el nombre del alumno:");
			String nombreAlumno = teclado.nextLine();
			System.out.println("Ingrese el apellido del alumno:");
			String apellidoAlumno = teclado.nextLine();
			HashMap<Materia, Nota> hashmapAlumnoAux = new HashMap<Materia, Nota>();
			Alumno alumnoAux = new Alumno(nombreAlumno, apellidoAlumno, null, null, null, hashmapAlumnoAux);
			Double promAlumno = 0.0;

			for (int i = 0; i < cantNotas; i++) {
				double nota = 0;
				Nota notaBucleFor = new Nota(0.0);
				do {
					System.out.println("Ingrese la nota " + (i+1) + " utilizando COMAS para demarcar decimales.");
					nota = teclado.nextDouble();
					notaBucleFor.setNota(nota);
				} while (nota > 7 || nota < 1);

				hashmapAlumnoAux.put(materiaAux, notaBucleFor);
				notasAlumnos.put((nombreAlumno + " " + apellidoAlumno), nota);

				promAlumno = promAlumno + nota;
			}

			promAlumno = promAlumno / cantNotas;
			promedioAlumnos.put((nombreAlumno + " " + apellidoAlumno + " promedio final"), promAlumno);
			System.out.println("Si desea añadir otro alumno, ingrese 's' sin comillas, si no, ingrese 'n'.");
			resp = teclado.next();
		} while (!resp.equalsIgnoreCase("n"));

		System.out.println(nombreMateria.toUpperCase() + " - " + cursoAlumno.toUpperCase() + " " + notasAlumnos.toString());
		System.out.println(nombreMateria.toUpperCase() + " - " + cursoAlumno.toUpperCase() + " " + promedioAlumnos.toString());

		teclado.close();
	}

	public static void ingresarAlumnos(){
		// Se debe crear una función que permita guardar un arreglo de una cierta cantidad de alumnos por curso y que luego los muestre.
		Scanner teclado = new Scanner(System.in);
		HashMap<Curso, ArrayList<Alumno>> hashmapCursoAlumno = new HashMap<Curso,ArrayList<Alumno>>();
		String resp = "s";

		do {
			System.out.println("Por favor, ingrese el nivel del curso a registrar (Por ejemplo, 2° Medio C):");
			String cursoRegistro = teclado.nextLine();
			System.out.println("A continuación ingrese la cantidad de alumnos a registrar en " + cursoRegistro.toUpperCase());
			Integer cantAlmunos = teclado.nextInt();
			Curso cursoRegistroObjeto = new Curso(cursoRegistro, cantAlmunos, null);
			teclado.nextLine();
			ArrayList<Alumno> arrayAlumnos = new ArrayList<Alumno>();
			for (int i = 1; i <= cantAlmunos; i++) {
				System.out.println("Ingrese nombre de alumno " + i);
				String nombreI = teclado.nextLine();
				System.out.println("Ingrese apellido de alumno " + i);
				String apellidoI = teclado.nextLine();
				System.out.println("Ingrese RUT de alumno " + i + " con puntos y guión");
				String rutI = teclado.nextLine();

				Alumno alumnoFor = new Alumno(nombreI, apellidoI, rutI, cursoRegistroObjeto, null, null);
				arrayAlumnos.add(alumnoFor);
				hashmapCursoAlumno.put(cursoRegistroObjeto, arrayAlumnos);
			}

			System.out.println("Si desea registar otro curso, ingrese 's' sin comillas, si no, ingrese 'n'.");
			resp = teclado.nextLine();

		} while (!resp.equalsIgnoreCase("n"));

		for(Curso i : hashmapCursoAlumno.keySet()){
			System.out.println("El curso " + i.getNivel().toUpperCase() + " tiene " + i.getCantAlumnos() + " alumnos.");
			System.out.println("Los alumnos son: ");
			for (int j = 0; j < i.getCantAlumnos(); j++) {
				System.out.println(hashmapCursoAlumno.get(i).get(j).getNombre() + " " + hashmapCursoAlumno.get(i).get(j).getApellido());
			}
		}

		teclado.close();
	}

	public static void analisisNotas(){
		//Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor nota y el promedio de notas.
		ArrayList<Double> arrayNotas = new ArrayList<Double>();
		Scanner teclado = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de notas a registrar:");
		int cantNotas = teclado.nextInt();
		for (int i = 0; i < cantNotas; i++) {
			double nota = 0;
			do {
				System.out.println("Ingrese la nota " + (i+1) + " utilizando COMAS para demarcar decimales.");
				nota = teclado.nextDouble();
			} while (nota > 7 || nota < 1);
			arrayNotas.add(nota);
		}

		Double mejorNota = arrayNotas.get(0);
		for (int i = 0; i < cantNotas; i++) {
			if (arrayNotas.get(i)>mejorNota) {
				mejorNota = arrayNotas.get(i);
			} else {
				mejorNota = mejorNota;
				//por legibilidad, me gusta dejar eso ahí pero desconozco si será apropiado
			}
		}

		Double peorNota = arrayNotas.get(0);
		for (int i = 0; i < cantNotas; i++) {
			if (arrayNotas.get(i)<peorNota) {
				peorNota = arrayNotas.get(i);
			} else {
				peorNota = peorNota;
				//lo mismo, por legibilidad, me gusta dejar eso ahí pero desconozco si será apropiado
			}
		}

		Double sumador = 0.0;
		for (int i = 0; i < cantNotas; i++) {
			sumador = sumador + arrayNotas.get(i);
		}

		Double promedio = sumador / cantNotas;

		System.out.println("\nLa nota más alta es: " + mejorNota);
		System.out.println("La nota más baja es: " + peorNota);
		System.out.println("El promedio de las notas es: " + promedio);

		teclado.close();
	}
	public static void main(String[] args) {
		Scanner tecladoMain = new Scanner(System.in);
		int opcion = 1; 


		do{
			System.out.println("\n");
			System.out.println("Bienvenido/a");
			System.out.println("Seleccione 1 si quiere ingresar notas por estudiante y luego obtener el promedio de cada estudiante.");
			System.out.println("Seleccione 2 si quiere guardar una cierta cantidad de alumnos por curso.");
			System.out.println("Seleccione 3 para generar un análisis de notas (obtener la nota más alta, la más baja y el promedio de todas las notas.)");
			System.out.println("Seleccione 0 para salir del menú");
			System.out.print("A continuación, su opción: ");
			opcion = tecladoMain.nextInt();
				
			}while(opcion < 0 || opcion > 3);

			if(opcion == 1){
				ingresarNotas();
			}else if (opcion == 2){
				ingresarAlumnos();
			}else if(opcion == 3){
				analisisNotas();
			}else{
				System.out.println("Muchas gracias.");
			}

}
}
