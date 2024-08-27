public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema Reservacion de Hoteles ***");
        String nombreCliente = "Mordraic";
        String diasEstancia = "Viernes, Sabado, Domingo";
        double tarifaDiaria = 125.60;
        boolean hasVistaAlMar = false;

        System.out.println(nombreCliente);
        System.out.println(diasEstancia);
        System.out.println(tarifaDiaria);
        System.out.println(hasVistaAlMar);

        nombreCliente = "Ransom";
        diasEstancia = "Lunes, Martes";
        tarifaDiaria = 100.15;
        hasVistaAlMar = true;

        System.out.println();
        System.out.println(nombreCliente);
        System.out.println(diasEstancia);
        System.out.println(tarifaDiaria);
        System.out.println(hasVistaAlMar);

    }
}
