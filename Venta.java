
// Esta clase representa un objeto Venta, que contiene los atributos id, descripción y precio.
public class Venta {
    // Atributos de la clase Venta
    private int id;
    private String descripcion;
    private double precio;
    
    // Constructor de la clase Venta 
    public Venta(int id, String descripcion, double precio) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    // Métodos para obtener el valor de los atributos de la clase Venta 
    public int getId() {
        return id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public double getPrecio() {
        return precio; 
    }    
    
    }
    




