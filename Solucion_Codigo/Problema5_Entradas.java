public class NewClass {

    public static void main(String[] args) {
        Zona pp = new Zona("Pp", 150, 30, 20);
        Zona tareana = new Zona("Tareana", 30, 80, 50);
        Zona mediana = new Zona("Mediana", 250, 25, 15);
        Zona lateral = new Zona("Lateral", 80, 18, 12);

        Entrada entrada1 = new EntradaNormal(pp, "Pepelio");
        Entrada entrada2 = new EntradaAbonada(tareana, "Dianita");
        Entrada entrada3 = new EntradaReducida(mediana, "Juan");
        Entrada entrada4 = new EntradaNormal(lateral, "Martiti");

        entrada1.calcularPrecioEntrada();
        entrada2.calcularPrecioEntrada();
        entrada3.calcularPrecioEntrada();
        entrada4.calcularPrecioEntrada();
    }
}

class Zona {
    public String nombre;
    public int numeroLocalidades;
    public double precioNormal;
    public double precioAbonado;

    public Zona(String nombre, int numeroLocalidades, double precioNormal, double precioAbonado) {
        this.nombre = nombre;
        this.numeroLocalidades = numeroLocalidades;
        this.precioNormal = precioNormal;
        this.precioAbonado = precioAbonado;
    }
}

class Entrada {
    public Zona zona;
    public int id;
    public String nombreComprador;

    public Entrada(Zona zona, String nombreComprador) {
        this.zona = zona;
        this.nombreComprador = nombreComprador;
        this.id = hashCode();
    }

    public void calcularPrecioEntrada() {
    }
}

class EntradaAbonada extends Entrada {

    public EntradaAbonada(Zona zona, String nombreComprador) {
        super(zona, nombreComprador);
    }

    @Override
    public void calcularPrecioEntrada() {
        double precioFinal = zona.precioAbonado;
        System.out.println("Precio de entrada abonada en zona " + zona.nombre + ": $" + precioFinal);
    }
}

class EntradaNormal extends Entrada {

    public EntradaNormal(Zona zona, String nombreComprador) {
        super(zona, nombreComprador);
    }

    @Override
    public void calcularPrecioEntrada() {
        double precioFinal = zona.precioNormal;
        System.out.println("Precio de entrada normal en zona " + zona.nombre + ": $" + precioFinal);
    }
}

class EntradaReducida extends Entrada {

    public EntradaReducida(Zona zona, String nombreComprador) {
        super(zona, nombreComprador);
    }

    @Override
    public void calcularPrecioEntrada() {
        double descuento = 0.15; 
        double precioFinal = zona.precioNormal * (1 - descuento);
        System.out.println("Precio de entrada reducida en zona " + zona.nombre + ": $" + precioFinal);
    }
}
