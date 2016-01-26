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
public class Alumno {
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Asignatura asignatura3;
    
    public Alumno(Asignatura asignatura1,Asignatura asignatura2,Asignatura asignatura3){
      this.asignatura1=asignatura1;
      this.asignatura2=asignatura2;
      this.asignatura3=asignatura3;
    }
    public Alumno(int id1, int id2, int id3){
        asignatura1=new Asignatura(id1);
        asignatura2=new Asignatura(id2);
        asignatura3=new Asignatura(id3);
    }
    public Asignatura Getasignatura1(){
        return asignatura1;
    }
    public Asignatura Getasignatura2(){
        return asignatura2;
    }
    public Asignatura Getasignatura3(){
        return asignatura3;
    }
}
