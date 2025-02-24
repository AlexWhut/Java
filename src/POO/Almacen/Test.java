package POO.Almacen;

public class Test {
    public static void main(String[] args) {
        Producto pizza = new Alimentacion("Pizza", 3.5f, "A001", 15, 3, 18);
        Producto pijama = new Ropa("Pijama", 30f, "R001", "Algodón");
        Producto mp3 = new Electronico("Reproductor MP3", 80f, "E001", 3);
        
        Producto[] productos = {pizza, pijama, mp3};
        Venta venta = new Venta("V001", productos);
        venta.ticket();
    }
}