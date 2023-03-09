import java.util.HashMap;
import java.util.Map;

// Esta clase representa el sistema de ventas de una empresa.
public class SistemaVentas {

    // Mapa para almacenar las tiendas con su respectivo id.
    private Map<Integer, Tienda> tiendas;

    // Constructor para inicializar el mapa.
    public SistemaVentas() {
        tiendas = new HashMap<>();
    }

    // Método para agregar una nueva tienda al sistema.
    public void agregarTienda(int id) {
        Tienda tienda = new Tienda(id); // Creación de un objeto tipo Tienda.
        tiendas.put(id, tienda); // Agregando la nueva tienda al mapa.
    }

    // Método para agregar una nueva venta a una determinada tienda.
    public void agregarVenta(int idTienda, Venta venta) {
        Tienda tienda = tiendas.get(idTienda); // Obteniendo la referencia a la tienda especificada por el id.

        if (tienda != null) { // Si existe la referencia a la tiendan entonces se agregara la venta a esta.

            tienda.agregarVenta(venta);

        }

    }
    // Metodo get para obtener una tienda dado un indice
    public Tienda getTienda(int i) {
        return tiendas.get(i);
    }

}
