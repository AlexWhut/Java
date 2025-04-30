public class Test {
    public static void main(String[] args) {
        // Creación de la agencia inmobiliaria
        AgenciaInmobiliaria agencia = new AgenciaInmobiliaria();

        // Creación de inmuebles
        Solar solar1 = new Solar("Madrid", 500, 200, 1, false);
        Solar solar2 = new Solar("Barcelona", 300, 250, 2, true);
        PlazaDeGaraje garaje1 = new PlazaDeGaraje("Valencia", 20, 50, 3, true);
        PlazaDeGaraje garaje2 = new PlazaDeGaraje("Sevilla", 25, 45, 4, false);
        Vivienda vivienda1 = new Vivienda("Bilbao", 120, 250000, 1200, 5, true, 3, 2);
        Vivienda vivienda2 = new Vivienda("Málaga", 90, 180000, 900, 6, false, 2, 4);
        LocalComercial local1 = new LocalComercial("Zaragoza", 150, 1200, 7, false);
        LocalComercial local2 = new LocalComercial("Granada", 200, 1400, 8, true);

        // Agregar inmuebles a la agencia
        agencia.addInmueble(solar1);
        agencia.addInmueble(solar2);
        agencia.addInmueble(garaje1);
        agencia.addInmueble(garaje2);
        agencia.addInmueble(vivienda1);
        agencia.addInmueble(vivienda2);
        agencia.addInmueble(local1);
        agencia.addInmueble(local2);

        // Mostrar inmuebles en venta
        System.out.println("===== Inmuebles en venta =====");
        agencia.verTodasVentaInmueble();

        // Mostrar inmuebles en alquiler
        System.out.println("\n===== Inmuebles en alquiler =====");
        agencia.verTodosAlquilerInmueble();

        // Mostrar inmuebles con precio de venta inferior a 200000
        System.out.println("\n===== Inmuebles en venta por debajo de 200000 =====");
        agencia.inmueblesVenta(200000);

        // Mostrar locales comerciales de segunda mano con más de 100 metros cuadrados
        System.out.println("\n===== Locales comerciales de segunda mano con más de 100m² =====");
        agencia.localesSegundaMano(100);

        // Mostrar solares rústicos en venta
        System.out.println("\n===== Solares rústicos en venta =====");
        System.out.println("Total: " + agencia.solaresRusticos());

        // Mostrar viviendas en alquiler con más de 2 dormitorios
        System.out.println("\n===== Viviendas en alquiler con más de 2 dormitorios =====");
        agencia.verViviendasAlquilerDormitorios(2);

        // Mostrar viviendas en venta con más de 1 dormitorio
        System.out.println("\n===== Viviendas en venta con más de 1 dormitorio =====");
        agencia.verViviendasCompraDormitorios(1);

        // Mostrar todos los garajes públicos
        System.out.println("\n===== Garajes públicos =====");
        agencia.verGarajesPublicos();
    }
}
