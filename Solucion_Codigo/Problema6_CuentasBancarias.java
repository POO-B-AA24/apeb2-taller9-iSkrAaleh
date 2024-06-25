public class NewClass {
    public static void main(String[] args) {
        CuentaCheques cuentaCheques = new CuentaCheques(1, "Dario");
        CuentaAhorros cuentaAhorros = new CuentaAhorros(2, "Fredercik");
        CuentaPlatino cuentaPlatino = new CuentaPlatino(3, "Roberto");

        cuentaCheques.depositar(1000);
        cuentaCheques.retirar(500);

        cuentaAhorros.depositar(2000);
        cuentaAhorros.calcularInteres();

        cuentaPlatino.depositar(5000);
        cuentaPlatino.calcularIntereses();

        System.out.println("Saldo Cuenta Cheques: $" + cuentaCheques.obtenerSaldo());
        System.out.println("Saldo Cuenta Ahorros: $" + cuentaAhorros.obtenerSaldo());
        System.out.println("Saldo Cuenta Platino: $" + cuentaPlatino.obtenerSaldo());
    }
}

class CuentaBancaria {
    public int numeroCuenta;
    public String nombreCliente;
    public double saldo;

    public CuentaBancaria(int numeroCuenta, String nombreCliente) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = 0.0;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) {
        saldo -= cantidad;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}

class CuentaCheques extends CuentaBancaria {
    public boolean saldoNegativo;

    public CuentaCheques(int numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
        this.saldoNegativo = false;
    }
}

class CuentaAhorros extends CuentaBancaria {
    public CuentaAhorros(int numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularInteres() {
     
    }
}

class CuentaPlatino extends CuentaBancaria {
    public CuentaPlatino(int numeroCuenta, String nombreCliente) {
        super(numeroCuenta, nombreCliente);
    }

    public void calcularIntereses() {
    }
}
