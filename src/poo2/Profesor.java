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
public class Profesor {
    private Asignatura asignatura1=new Asignatura();
    private Asignatura asignatura2=new Asignatura();
    private Asignatura asignatura3=new Asignatura();
    private Alumno alumno1=new Alumno(asignatura1,asignatura2,asignatura3);
    public Profesor(int id1, int id2, int id3){
    asignatura1=new Asignatura(id1);
    asignatura2=new Asignatura(id2);
    asignatura3=new Asignatura(id3);
    alumno1=new Alumno(asignatura1,asignatura2,asignatura3);
    }
    public void ponerNotas(Alumno alumno){

        asignatura1.Setcali((Math.random()*10)+1);
        asignatura2.Setcali((Math.random()*10)+1);
        asignatura3.Setcali((Math.random()*10)+1);
        
    }
    
    public double calcularMedia(Alumno alumno){
        return (asignatura1.Getcali()+asignatura2.Getcali()+asignatura3.Getcali())/3;
    }
}
