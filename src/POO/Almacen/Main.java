package POO.Almacen;

public class Main {
    public static void main(String[] args) {
        
        // Productos
        Tecnologia lap01 = new Tecnologia("Laptop gamer", 28319319, 1080);
        Tecnologia lap02 = new Tecnologia("LapOfimatica", 4, 400);

        Ropa chaqueta = new Ropa("Chaqueta", 289372931, 80, "Negro");

        System.out.println(lap01);
        System.out.println(lap02);
        System.out.println(chaqueta);

        // Venta de productos
        Venta venta = new Venta();
        venta.addProducto(lap01);
        venta.addProducto(lap02);
        venta.addProducto(chaqueta);

    }
}
