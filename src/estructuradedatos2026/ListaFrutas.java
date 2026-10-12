 
package estructuradedatos2026;

 import java.util.ArrayList; 

public class ListaFrutas {
 
    public static void main(String[] args) {
    
        //ArrayList: se utiliza para listas
        ArrayList<String> lista= new ArrayList<>();  
        
        //add(valor):agregar un elemento al final
        lista.add("Manzana"); 
        lista.add("Fresa");
        lista.add("Mango");
        lista.add("Durazno");
        //add(index,valor):agregar un elemento en cualquier posicion
        lista.add(2, "Pera"); 
        
        //get(): obtener un elemento segun su indice
        System.out.println("fruta: "+lista.get(2) );
        
        // set(): cambiar valor de un elemento
        lista.set(1,"Mango Manila");
        
        //remove():  quita elementos por indice o por objeto
        lista.remove(3);
        lista.remove("Pera");
        System.out.println(lista);
        
        if( lista.contains("Manzana")){
            System.out.println("Si hay la Manzanas");
        }else{ 
             System.out.println("No hay la Manzanas");
        }
        //size() tamaño del  el arraylist
        System.out.println("hay "+lista.size()+" frutas");
        //empty(): verifica si el rray lsit esta vacio
        System.out.println(lista.isEmpty());
        
          //foreach
         for(String fruta : lista){
             System.out.println(fruta);
         } 
         // foreach moderno
         lista.forEach( (f)->{  System.out.println(f);} );
         
         //for clasico
         for(int i=0; i< lista.size(); i++){
             System.out.println(lista.get(i));
         }
         
         
        
        //clear() limpia el arraylist
        lista.clear(); 
        
        
    }
    
}
