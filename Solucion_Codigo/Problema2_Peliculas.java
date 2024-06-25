public class NewClass {
    public static void main(String[] args) {
      
        Pelicula pelicula1 = new Pelicula("Juan", "Franola", "1933", "Español");
        Pelicula pelicula2 = new Pelicula("Rdas", "Jameron", "2015", "Español, Inglés");

        
        Soporte dvd1 = new DVD(pelicula1, 7.7);
        Soporte vhs1 = new VHS(pelicula1, "Metalica");

        Soporte dvd2 = new DVD(pelicula2, 9.5);
        Soporte vhs2 = new VHS(pelicula2, "Aluminio");

       
        dvd1.calcularPrecio();  
        vhs1.calcularPrecio();  
        dvd2.calcularPrecio();  
        vhs2.calcularPrecio();  
    }
}

class Pelicula {
    public String titulo;
    public String autor;
    public String anoEdicion;
    public String idioma;

    public Pelicula(String titulo, String autor, String anoEdicion, String idioma) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoEdicion = anoEdicion;
        this.idioma = idioma;
    }
}

class Soporte {
    public Pelicula pelicula;

    public Soporte(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void calcularPrecio() {
        // Método a ser implementado por subclases
    }
}

class DVD extends Soporte {
    public double almacenamientoGB;

    public DVD(Pelicula pelicula, double almacenamientoGB) {
        super(pelicula);
        this.almacenamientoGB = almacenamientoGB;
    }

    @Override
    public void calcularPrecio() {
        double precioBase = 10.0;  
        double precioFinal = precioBase * 1.1;  
        System.out.println("Precio de DVD " + pelicula.titulo + " $" + precioFinal);
    }
}

class VHS extends Soporte {
    public String tipoCintaMagnetica;

    public VHS(Pelicula pelicula, String tipoCintaMagnetica) {
        super(pelicula);
        this.tipoCintaMagnetica = tipoCintaMagnetica;
    }

    @Override
    public void calcularPrecio() {
        double precioBase = 10.0;  
        System.out.println("Precio del VHS " + pelicula.titulo + " $" + precioBase);
    }
}
