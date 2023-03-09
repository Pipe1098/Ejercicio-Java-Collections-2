import java.util.ArrayList;
import java.util.List;

// Esta clase representa una tienda, con un id y una lista de ventas.

public class Tienda {

    // Atributo para el id de la tienda
    private int id;
    
    // Lista de ventas realizadas en la tienda
    private List<Venta> ventas;
    
    // Constructor para inicializar el id de la tienda y la lista de ventas. 
    public Tienda(int id) {
        this.id = id;
        ventas = new ArrayList<>();
    }
    
    // Método para obtener el id de la tienda. 
    public int getId() {
        return id;
    }
    
    // Método para obtener la lista de ventas realizadas en la tienda. 
    public List<Venta> getVentas() {
        return ventas;
    }
    
    // Método para agregar una nueva venta a la lista de ventas. 
    public void agregarVenta(Venta venta) {   // Se recibe como parámetro un objeto Venta. 
    
        ventas.add(venta);   // Se agrega a la lista de Ventas. 
    
    }  
    
 }
    