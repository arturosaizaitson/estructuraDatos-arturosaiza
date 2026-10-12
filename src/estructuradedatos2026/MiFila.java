 
package estructuradedatos2026;
 
import java.util.LinkedList;
import java.util.Queue;

public class MiFila {
 
    public static void main(String[] args) {
   //cola oxxo instanciada e inicializada
   Queue<String> colaOXXO = new LinkedList<>();
   
   //offer: agregar un elemento a la cola
   colaOXXO.offer("Maria");
   colaOXXO.offer("Pepe");
   colaOXXO.offer("Juan");
   colaOXXO.offer("Ana");
   colaOXXO.offer("Carlos");
   
   //peek: muestra el siguiente en la cola
   System.out.println("Siguiente:");
   System.out.println(colaOXXO.peek());
   
   //poll: Saca a el siguiente en la cola
   System.out.println("Atendido:");
   System.out.println(colaOXXO.poll());
   
   //size: cantidad de elementos en la cola
   System.out.println("\nQuedan: "+colaOXXO.size()); 
   
   //isEmpty: verifica si la cola esta vacia
   System.out.println("\nesta vacia?: "+colaOXXO.isEmpty());
   System.out.println(colaOXXO);
      
    
        
    }
    
}
