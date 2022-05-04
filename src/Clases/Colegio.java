
package Clases;

import java.util.HashSet;

public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//a) Crear las materias://
        Materia inglesUno = new Materia(1, "Ingles", 1);
        Materia matematicaUno = new Materia(2, "Matematica", 1);
        Materia laboratorioUno = new Materia(3, "Laboratorio", 1);

//b) Crear 2 alumnos://        
        Alumno lopez = new Alumno(1001, "Lopez", "Martin");
        Alumno martinez = new Alumno(1002, "Martinez", "Brenda");

//c) Inscribir a López en las 3 materias: //
        lopez.agregarMateria(inglesUno);
        lopez.agregarMateria(matematicaUno);
        lopez.agregarMateria(laboratorioUno);

//d) Inscribir a Martínez en las 3 materias y volver a inscribirlo en Laboratorio 1.//        
        martinez.agregarMateria(inglesUno);
        martinez.agregarMateria(matematicaUno);
        martinez.agregarMateria(laboratorioUno);
        martinez.agregarMateria(laboratorioUno);

//e) Visualizar la cantidad de materias a las que está inscripto cada alumno.//        
        System.out.println("El alumno Lopez esta inscripto en " + lopez.cantindadMaterias() + " " + "materias :");

        HashSet<Materia> materiasLopez = lopez.getMaterias();

        for (Materia item : materiasLopez) {
            System.out.println(item.getNombre());
        }

        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println("El alumno Martinez esta inscripto en " + martinez.cantindadMaterias() + " " + "materias :");

        HashSet<Materia> materiasMartinez = martinez.getMaterias();

        for (Materia item : materiasMartinez) {
            System.out.println(item.getNombre());
        }

        System.out.println("Ya se encuentra inscripto en Laboratorio Uno");

    }

}