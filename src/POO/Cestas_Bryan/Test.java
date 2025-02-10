package POO.Cestas_Bryan;

public class Test {
    public static void main(String[] args) {
        Cesta cesta = new Cesta("Mi Cesta");

        // Agregar productos
        cesta.addProducto(new Producto(2, "Lata de foie gras", 10, 1)); // 1 es con gluten
        cesta.addProducto(new Producto(3, "Turrón de almendras", 5, 1)); // 1 es con gluten
        cesta.addProducto(new Producto(4, "Caja de mazapán", 8, 1));// 1 es con gluten
        cesta.addProducto(new Producto(5, "Botella de sidra", 8, 0));// 0 es sin gluten
        cesta.addProducto(new Producto(6, "Botella de cava", 15, 0));// 0 es sin gluten

        // Mostrar los productos organizados
        cesta.mostrarProductos();
    }
    
    

}
