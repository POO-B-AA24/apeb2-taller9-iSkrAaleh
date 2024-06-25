
public class NewClass {
    public static void main(String[] args) {
        FijoMensuales trabajadorFijo = new FijoMensuales("Juan", "Pepino", "23", 2342334, 0);
        trabajadorFijo.calcularPagoFijo();
        trabajadorFijo.imprimirDatos();
        System.out.println();
        Comisionarios trabajadorComision = new Comisionarios("Ramiro", "Dante", "La 56", 453653, 0, 0.10);
        trabajadorComision.calcularPorcentajeFijo(5000); 
        trabajadorComision.imprimirDatos();
        System.out.println();
        PorHoras trabajadorPorHoras = new PorHoras("Tayron", "Josue", "La pradera", 1103434, 0, 15, 20);
        trabajadorPorHoras.calcularxHoras(45); 
        trabajadorPorHoras.imprimirDatos();
        System.out.println();
        Jefe jefe = new Jefe("Juanillo", "Pepeorini", "XD", 23423434, 5000);
        jefe.imprimirDatos();
    }
}
class Trabajadores {
    public String nombre;
    public String apellido;
    public String direccion;
    public int DNI;
    public double sueldo;
    public Trabajadores(String nombre, String apellido, String direccion, int DNI, double sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.DNI = DNI;
        this.sueldo = sueldo;
    }
    public void asignarSalario() {
    }
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Dirección: " + direccion);
        System.out.println("DNI: " + DNI);
        System.out.println("Sueldo: " + sueldo);
    }
}
class FijoMensuales extends Trabajadores {
    public FijoMensuales(String nombre, String apellido, String direccion, int DNI, double sueldo) {
        super(nombre, apellido, direccion, DNI, sueldo);
    }

    @Override
    public void asignarSalario() {

    }

    public void calcularPagoFijo() {

        this.sueldo = 2000; 
    }
}

class Comisionarios extends Trabajadores {
    public double ventasRealizadas;
    public double porcentajeComision;

    public Comisionarios(String nombre, String apellido, String direccion, int DNI, double sueldo, double porcentajeComision) {
        super(nombre, apellido, direccion, DNI, sueldo);
        this.porcentajeComision = porcentajeComision;
    }

    @Override
    public void asignarSalario() {
        this.sueldo = ventasRealizadas * porcentajeComision;
    }

    public void calcularPorcentajeFijo(double ventas) {
        this.ventasRealizadas = ventas;
        asignarSalario();
    }
}

class PorHoras extends Trabajadores {
    public int horasTrabajadas;
    public double pagoPorHora;
    public double pagoPorHoraExtra;

    public PorHoras(String nombre, String apellido, String direccion, int DNI, double sueldo, double pagoPorHora, double pagoPorHoraExtra) {
        super(nombre, apellido, direccion, DNI, sueldo);
        this.pagoPorHora = pagoPorHora;
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }
    @Override
    public void asignarSalario() {
        if (horasTrabajadas <= 40) {
            this.sueldo = horasTrabajadas * pagoPorHora;
        } else {
            this.sueldo = (40 * pagoPorHora) + ((horasTrabajadas - 40) * pagoPorHoraExtra);
        }
    }
    public void calcularxHoras(int horas) {
        this.horasTrabajadas = horas;
        asignarSalario();
    }
}

class Jefe extends Trabajadores {
    public Jefe(String nombre, String apellido, String direccion, int DNI, double sueldo) {
        super(nombre, apellido, direccion, DNI, sueldo);
    }

    @Override
    public void asignarSalario() {
    }
}
