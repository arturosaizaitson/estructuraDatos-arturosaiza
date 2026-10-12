 
package estructuradedatos2026.Listas;

 
public class Main {

   
    public static void main(String[] args) {  
    ListaEnlazada listaAlumnos = new ListaEnlazada(); 
    
    listaAlumnos.agregarInicio("Juanito");
    listaAlumnos.agregarInicio( "Maria");
    listaAlumnos.agregarInicio( "Pepito");
    listaAlumnos.agregarFinal("Lupita");
    listaAlumnos.agregarFinal("Carlos"); 
    listaAlumnos.agregarFinal("Clase :P");  
    
    System.out.println("tamaño: "+listaAlumnos.cantidadNodos());
    listaAlumnos.mostrarLista(); 
        
    }
    
}
