package POO.Almacen;

public class Main {
    public static void main(String[] args) {
        
        // Productos
        Tecnologia lap01 = new Tecnologia("Laptop gamer", 28319319L, 1080);
        Tecnologia lap02 = new Tecnologia("LapOfimatica", 4L, 400);

        Ropa chaqueta = new Ropa("Chaqueta", 289372931L, 80, "Negro");

        // Venta de productos
        Venta venta = new Venta();
        venta.addProducto(lap01);
        venta.addProducto(lap02);
        venta.addProducto(chaqueta);

        // Mostrar ventas
        venta.mostrarVenta();
    }
}
