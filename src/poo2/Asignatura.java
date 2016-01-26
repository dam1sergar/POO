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
public class Asignatura {

    /**
     * @param args the command line arguments
     */
   private int ident;
   private double calificacion;
   
   public Asignatura(){
       ident=1;
       
   }
   public Asignatura(int id){
       ident=id;
       
   }
   public int Getident(){
      return ident; 
   }
   public double Getcali(){
      return calificacion; 
   }
   public void Setcali(double calificacion){
       this.calificacion=calificacion;
   }
}
