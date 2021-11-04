
package escuelarocallosas;

import Calificaciones.Alumnos;
import Calificaciones.Notas;


public class EscuelaRocallosas {
    
    
    
    public static void main(String[] args) {

        Notas Julio = new Notas("Julio Verne", 2);
        Notas Stephen = new Notas("Stephen KIng", 3);
        Notas JulioI = new Notas("Julio Iglesias", 4);
        Notas Isabel = new Notas("Isabel Allende", 5);
        Notas Fabiana = new Notas("Fabiana Cantilo", 11);
        Notas Vilma = new Notas("Vilma Picapiedras", 10);
        Notas Pebbles = new Notas("Pebbles Picapiedras", 5);
        Notas Luis = new Notas("Luis Alberto Spinetta", 7);
        Notas José = new Notas("José Perales", 2);
        Notas Juan = new Notas("Juan Carlos Baglieto", 1);
        
        
        Julio.mostrar();
        Stephen.mostrar();
        JulioI.mostrar();
        Isabel.mostrar();
        Fabiana.mostrar();
        Vilma.mostrar();
        Pebbles.mostrar();
        Luis.mostrar();
        José.mostrar();
        Juan.mostrar();
        
    
    }
    
}