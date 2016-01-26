/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author asus
 */
public class Ejercicio {
    public static void main(String[] args){
    Asignatura asignatura1=new Asignatura();
    Asignatura asignatura2=new Asignatura(2);
    Asignatura asignatura3=new Asignatura(3);
    Alumno alumno1=new Alumno(asignatura1,asignatura2,asignatura3);
    Profesor profesor=new Profesor(1,2,3);
    profesor.ponerNotas(alumno1);
    System.out.println(profesor.calcularMedia(alumno1));
    }
}
