 
package estructuradedatos2026;

 
public class Producto {
    
            //atributos 
            private long id; //int
            private String nombre;
            private String sku;
            private char talla;   //S,M,L
            private byte pasillo;
            private short loteAnio;
            private int stokDisponible;
            private float pesoKg;
            private double precioUnitario;
            private boolean activo;
    
            //constructor 
            
            //metodos getters Setter

    public Producto(long id, String nombre, String sku, char talla, byte pasillo, short loteAnio, int stokDisponible, float pesoKg, double precioUnitario, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.sku = sku;
        this.talla = talla;
        this.pasillo = pasillo;
        this.loteAnio = loteAnio;
        this.stokDisponible = stokDisponible;
        this.pesoKg = pesoKg;
        this.precioUnitario = precioUnitario;
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public char getTalla() {
        return talla;
    }

    public void setTalla(char talla) {
        this.talla = talla;
    }

    public byte getPasillo() {
        return pasillo;
    }

    public void setPasillo(byte pasillo) {
        this.pasillo = pasillo;
    }

    public short getLoteAnio() {
        return loteAnio;
    }

    public void setLoteAnio(short loteAnio) {
        this.loteAnio = loteAnio;
    }

    public int getStokDisponible() {
        return stokDisponible;
    }

    public void setStokDisponible(int stokDisponible) {
        this.stokDisponible = stokDisponible;
    }

    public float getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(float pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
    
    
    
    
}
