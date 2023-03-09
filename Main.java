
public class Main {

    public static void main(String[] args) {

        // Creación de un objeto SistemaVentas
        SistemaVentas sistema = new SistemaVentas();

        // Agregar una tienda con id 1 y dos ventas a esta tienda
        sistema.agregarTienda(1);
        sistema.agregarVenta(1, new Venta(1, "Producto 1", 10.0));
        sistema.agregarVenta(1, new Venta(2, "Producto 2", 20.0));

        // Agregar otra tienda con id 2 y una venta a esta tienda
        sistema.agregarTienda(2);
        sistema.agregarVenta(2, new Venta(3, "Producto 3", 30.0));

        // Obtener la tienda con id 1 y mostrar sus ventas por consola
        Tienda tienda1 = sistema.getTienda(1);
        System.out.println("Ventas tienda 1:");
        for (Venta venta : tienda1.getVentas()) {
            System.out.println("- " + venta.getDescripcion() + ": $" + venta.getPrecio());
        }

    }

}
