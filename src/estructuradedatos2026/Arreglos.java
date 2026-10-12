 
package estructuradedatos2026;

 
public class Arreglos {

 
    public static void main(String[] args) {
        
        String nombre = "Juanito";
        System.out.println(nombre);
        
        /* Empieza en indice 0;
           0-> juanito  1-> Luis  2->Maria ...*/
        String[] nombres ={"Juanito","Luix","Maria","Lupita"};
        System.out.println(nombres[1]);
        nombres[1]="Luisito"; //editar valor 
        System.out.println(nombres[1]);
        
        System.out.println("--IMPRIMIR TODOS LOS VALORES--");
        for(int i=0; i<nombres.length;i++ ){
            System.out.println(i+": "+nombres[i]);
        }
        
        for(String n :nombres){
            System.out.println("Nombre: "+n);
        }
        
        String[] carreras  = new String[10]; 
        carreras[0]="ISW";
        carreras[4]="LDG";
        carreras[8]="IIS";
        
        /**imprimir todas las carreras con for each*/
        for(String carrera: carreras){
            System.out.println(carrera);
        }
    }
}
