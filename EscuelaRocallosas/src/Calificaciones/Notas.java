
package Calificaciones;


public class Notas extends Alumnos {
    
    int calificacion;
       
    
    public Notas(String param_nombre, int calificacion){
    
        this.nombre = param_nombre;
        this.calificacion = calificacion;
        
    }

   
    
    @Override
   public void mostrar() {
       super.mostrar();
       System.out.println("Nota: " + this.calificacion);
       
       
 
    }
}